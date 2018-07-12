package work.hang.dk.framework.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/11
 */
public class PropertyUtil {
	//private static final Logger logger = LoggerFactory.getLogger(PropertyUtil.class);
	private static Properties properties;

	static {
		loadProps("");
	}

	synchronized static private void loadProps(String key) {
		//logger.info("开始加载properties文件内容.......");
		properties = new Properties();
		InputStream in;
		try {
			//<!--第一种，通过类加载器进行获取properties文件流-->
			in = PropertyUtil.class.getClassLoader().getResourceAsStream(key);
			//<!--第二种，通过类进行获取properties文件流-->
			//in = PropertyUtil.class.getResourceAsStream("/jdbc.properties");properties.load(in);
			properties.load(in);
		} catch (IOException e) {
			//logger.error("jdbc.properties文件未找到");
		}
		//logger.info("加载properties文件内容完成...........");
		//logger.info("properties文件内容：" + props);
	}

	public static String getProperty(String key) {
		if (null == properties) {
			loadProps(key);
		}
		return properties.getProperty(key);
	}

	public static String getProperty(String key, String defaultValue) {
		if (null == properties) {
			loadProps(key);
		}
		return properties.getProperty(key, defaultValue);
	}
}
