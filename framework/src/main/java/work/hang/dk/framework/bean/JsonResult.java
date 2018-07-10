package work.hang.dk.framework.bean;

import java.io.Serializable;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class JsonResult implements Serializable {

	private static final long serialVersionUID = 6952922297949129810L;

	/**
	 * 查询结果的分页总数
	 */
	private Integer pageCount = null;
	/**
	 * 查询结果的记录数
	 */
	private Integer totalCount = null;
	/**
	 * 结果标志(1:异常 0:正常)<br/>
	 * 默认0
	 */
	private String flag = "0";

	/**
	 * 消息
	 */
	private String message = null;

	private Object object = null;

	private Object generatedId = null;

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public void fail(String message) {
		this.flag = "1";
		this.message = message;
	}

	public void success(String message) {
		this.flag = "0";
		this.message = message;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public boolean isSuccess() {
		return "0".equals(this.flag);
	}

	public Object getGeneratedId() {
		return generatedId;
	}

	public void setGeneratedId(Object generatedId) {
		this.generatedId = generatedId;
	}
}
