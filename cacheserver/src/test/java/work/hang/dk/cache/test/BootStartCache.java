package work.hang.dk.cache.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/17
 */
@Slf4j
public class BootStartCache {
	//private static Logger logger  = LoggerFactory.getLogger(BootStartCache.class);

	private static void startProvider() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dev/spring/spring-context.xml");
			context.start();
			log.debug("cache服务提供者启动成功");
			synchronized (BootStartCache.class) {
				while (true) {
					try {
						BootStartCache.class.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		startProvider();
	}
}
