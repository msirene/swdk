package work.hang.dk.generator;

import work.hang.dk.framework.constant.CommonConstant;
import work.hang.dk.framework.redis.RedisService;
import work.hang.dk.framework.util.ApplicationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
public class WorkThread implements Runnable {
	//private Logger logger = LoggerFactory.getLogger(WorkThread.class);
	private RedisService redisService;
	private SnowflakeIdWorker snowflakeIdWorker;
	private Generator generator;
	private int increment;
	private int minNum;
	private long interval;

	WorkThread(RedisService redisService, SnowflakeIdWorker snowflakeIdWorker) {
		this.redisService = redisService;
		this.snowflakeIdWorker = snowflakeIdWorker;
		increment = ApplicationProperties.getInt("primary.key.increment");
		minNum = ApplicationProperties.getInt("primary.key.min.num");
		interval = ApplicationProperties.getLong("interval");
	}

	@Override
	public void run() {
		while (generator.isFlag()) {
			try {
				long size = redisService.listSize(CommonConstant.PRIMARY_KEY_QUEUE);
				if (size <= minNum) {
					List<Long> list = new ArrayList<>();
					for (int i = 0; i < increment; i++) {
						list.add(snowflakeIdWorker.nextId());
					}
					redisService.lpushAll(CommonConstant.PRIMARY_KEY_QUEUE, list);
				}
				Thread.sleep(interval);
			} catch (Exception e) {
				//logger.error("snowflakeId 入队列失败", e);
			}
		}
		//logger.info("主键生成线程正常结束！");
	}
}
