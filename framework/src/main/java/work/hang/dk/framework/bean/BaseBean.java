package work.hang.dk.framework.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class BaseBean implements Serializable {

	private static final long serialVersionUID = -6423688142116469275L;

	/**
	 * 去除字符串两端空格，如果字符串为null，直接返回null
	 *
	 * @param str 原始字符串
	 * @return 去除空格字符的字符串，或null
	 */
	protected String trim(String str) {
		return str == null ? null : str.trim();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
