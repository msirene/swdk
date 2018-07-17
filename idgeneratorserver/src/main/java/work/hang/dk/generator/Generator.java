package work.hang.dk.generator;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import work.hang.dk.framework.redis.RedisService;
import work.hang.dk.framework.thread.ThreadService;
import work.hang.dk.framework.util.PropertyUtil;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.ResourceBundle;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@Slf4j
@Component
public class Generator {

	private Logger logger = LoggerFactory.getLogger(Generator.class);

	@Resource
	private RedisService redisService;

	@Resource
	private ThreadService threadService;

	private boolean flag = true;

	boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	/**
	 * 用Snowflake算法实现的算号器
	 */
	private SnowflakeIdWorker snowflakeIdWorker;

	public Generator() {
		String snowflakeWorkerId = ResourceBundle.getBundle("it/config/common").getString("snowflake.worker.id");
		String snowflakeDataCenterId = ResourceBundle.getBundle("it/config/common").getString("snowflake.data.center.id");
		snowflakeIdWorker = new SnowflakeIdWorker(Long.valueOf(snowflakeWorkerId), Long.valueOf(snowflakeDataCenterId));
	}

	@PostConstruct
	public void initialization() {
		log.info("Generator启动");
		threadService.execute(new WorkThread(redisService, snowflakeIdWorker));
	}

	@PreDestroy
	public void close() {
		log.info("Generator关闭");
		flag = false;
		threadService.close();
	}

	public static void main(String[] args) {
		System.out.println(ResourceBundle.getBundle("it/config/common").getString("snowflake.worker.id"));
		System.out.println(PropertyUtil.getProperty("snowflake.worker.id"));
	}
}
