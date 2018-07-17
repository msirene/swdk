package work.hang.dk.framework.generator;

import lombok.extern.slf4j.Slf4j;
import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.util.ApplicationProperties;

import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
@Slf4j
public class PrimaryKeyWorker implements Runnable {
	//private Logger logger = LoggerFactory.getLogger(PrimaryKeyWorker.class);
	private IdCacheInterface idCache;
	private int minNum;
	private long interval;
	private PrimaryKeyQueue primaryKeyQueue;

	public PrimaryKeyWorker(IdCacheInterface idCache, PrimaryKeyQueue primaryKeyQueue) {
		this.idCache = idCache;
		this.primaryKeyQueue = primaryKeyQueue;
		minNum = ApplicationProperties.getInt("primary.key.min.num");
		interval = ApplicationProperties.getLong("interval");
	}


	@Override
	public void run() {
		while (PrimaryKeyQueueListener.FLAG) {
			try {
				if (this.primaryKeyQueue.size() <= minNum) {
					RemoteParameter<Long> parameter = new RemoteParameter<>();
					RemoteParameter<Long> result = idCache.getTablePrimaryKey(parameter);
					if (result.isSuccess()) {
						List<Long> list = result.getData();
						for (Long l : list) {
							this.primaryKeyQueue.offer(l);
						}
					}
				}
				Thread.sleep(interval);
			} catch (Exception e) {
				log.error("snowflakeId 入队列失败", e);
			}
		}
		log.info("主键队列监听工作线程正常结束！");
	}
}
