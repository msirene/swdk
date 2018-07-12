package work.hang.dk.generator.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
public class BootStartGenerator {
	//private static Logger logger = LoggerFactory.getLogger(BootStartGenerator.class);
	public static void main(String[] args) {
		startGenerator();
	}

	//boolean flag = true;
	private static void startGenerator() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dev/spring/spring-context.xml");
			context.start();
			//logger.debug("Generator服务提供者启动成功");
			System.out.println("Generator服务提供者启动成功");
			synchronized (BootStartGenerator.class) {
				while (true) {
					try {
						BootStartGenerator.class.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
