package work.hang.dk.framework.generator;

import work.hang.dk.framework.thread.ThreadService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class PrimaryKeyQueueListener {
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	/**
	 *
	 */
	public static boolean FLAG = true;
	@Resource
	private IdCacheInterface idCache;
	@Resource
	private ThreadService threadService;
	@Resource
	private PrimaryKeyQueue primaryKeyQueue;

	@PostConstruct
	public void initialization() {
		PrimaryKeyWorker thread = new PrimaryKeyWorker(idCache, primaryKeyQueue);
		threadService.execute(thread);
	}

	@PreDestroy
	public void close() {
		PrimaryKeyQueueListener.FLAG = false;
		threadService.close();
	}
}
