package work.hang.dk.framework.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -6423688142116469275L;

	/**
	 * 查询用页码
	 */
	private Integer pageIndex = null;

	/**
	 * 查询用每页记录数
	 */
	private Integer pageSize = null;

	/**
	 * 查询范围
	 */
	protected Integer start = null;

	/**
	 * 查询范围
	 */
	protected Integer end = null;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getStart() {
		if (null == pageSize || null == pageIndex) {
			return null;
		} else {
			return (pageIndex - 1) * pageSize + 1;
		}
	}

	public Integer getEnd() {
		if (null == pageSize || null == pageIndex) {
			return null;
		} else {
			return pageSize * pageIndex;
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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
