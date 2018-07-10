package work.hang.dk.framework.generator;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class PrimaryKeyQueue {
	//private static Logger logger = LoggerFactory.getLogger(PrimaryKeyQueue.class);
	/**
	 * 存放 SnowFlakeId 线程安全阻塞队列
	 **/
	private BlockingQueue<Long> queue = new LinkedBlockingQueue<>();

	public String nextId() {
		try {
			return queue.take().toString();
		} catch (Exception e) {
			//logger.error("获取主键失败", e);
		}
		return null;
	}

	public void offer(Long primaryKey) {
		queue.offer(primaryKey);
	}

	public int size() {
		return queue.size();
	}
}
