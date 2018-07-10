package work.hang.dk.framework.util;

import java.util.Properties;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/5/31
 */
public class ApplicationProperties {
	private static Properties prop;

	public void setProp(Properties props) {
		prop = props;
	}

	private static String getProperty(String key) {
		if (prop != null) {
			return prop.getProperty(key);
		} else {
			return null;
		}
	}

	public static long getLong(String key) {
		return Long.parseLong(getProperty(key));
	}

	public static int getInt(String key) {
		return Integer.parseInt(getProperty(key));
	}
}
