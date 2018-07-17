package work.hang.dk.framework.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
@Slf4j
public class ThreadService {
	//private Logger logger = LoggerFactory.getLogger(ThreadService.class);

	private ExecutorService pool = Executors.newCachedThreadPool();

	/**
	 * 执行一个任务
	 *
	 * @param task
	 */
	public void execute(Runnable task) {
		pool.execute(task);
	}

	/**
	 * 等待一定时间，再关闭线程池
	 *
	 * @param waitTime 等待时间，单位：秒
	 */
	public void close(int waitTime) {
		try {
			boolean isTermated = pool.awaitTermination(waitTime, TimeUnit.SECONDS);
			if (!isTermated) {
				pool.shutdownNow();
				log.info("线程池强制关闭！");
			} else {
				log.info("线程池正常关闭！");
			}
		} catch (InterruptedException e) {
			log.error("", e);
		}
	}

	/**
	 * 默认等待3秒，再关闭线程池
	 */
	public void close() {
		close(3);
	}
}
