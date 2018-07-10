package work.hang.dk.framework.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * [概 要] 封装访问远程接口的参数和返回结果
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/5/31
 */
public class RemoteParameter<T> implements Serializable {

	private static final long serialVersionUID = 5229105668309891633L;

	/**
	 * 返回值：正常
	 */
	private final static int SUCCESS = 0;

	/**
	 * 返回值：异常
	 */
	private final static int FAILURE = 1;

	/**
	 * 返回值 0:正常 1:异常
	 */
	private Integer status = SUCCESS;

	/**
	 * 异常信息
	 */
	private String message = null;

	/**
	 * 每页的记录数
	 */
	private Integer pageSize = null;

	/**
	 * 流水号，方便从日志中跟踪调用链
	 */
	private String serialNumber = null;

	/**
	 * 查询结果数据
	 */
	private List<T> data = null;

	/**
	 * insert操作时系统生成的ID
	 */
	private Object generatedId = null;

	/**
	 * 查询结果的分页总数
	 */
	private Integer pageCount = null;

	/**
	 * 查询结果的记录数
	 */
	private Integer totalCount = null;

	/**
	 * 参数
	 */
	private T param = null;

	public RemoteParameter() {
	}

	public RemoteParameter(String sn, T bean) {
		this.serialNumber = sn;
		this.param = bean;
	}

	public void copySerialNumber(String sn) {
		this.serialNumber = sn;
	}

	public Integer getPageCount() {

		if (null == this.totalCount || this.totalCount <= 1) {
			return 1;
		}

		if (null == this.pageSize || this.pageSize < 1) {
			pageSize = 10;
		}

		Integer b = this.totalCount / this.pageSize;
		Integer c = this.totalCount % this.pageSize;
		pageCount = b;
		if (c > 0) {
			pageCount = b + 1;
		}

		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}

	/**
	 * @return the data
	 */
	public T getSingleData() {
		if (null == data || data.isEmpty()) {
			return null;
		} else {
			return data.get(0);
		}
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}

	/**
	 * @return the param
	 */
	public T getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(T param) {
		this.param = param;
	}

	/**
	 * @return the generatedId
	 */
	public Object getGeneratedId() {
		return generatedId;
	}

	/**
	 * @param generatedId the generatedId to set
	 */
	public void setGeneratedId(Object generatedId) {
		this.generatedId = generatedId;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 设置失败标识、清除全部的输入
	 *
	 * @param message 消息
	 */
	public void fail(String message) {
		failWithoutClean(message);
		cleanInput();
	}

	/**
	 * 设置失败标识、不清除全部的输入
	 *
	 * @param message 消息
	 */
	private void failWithoutClean(String message) {
		this.status = FAILURE;
		this.message = message;
	}

	/**
	 * 设置成功标识、清除全部的输入
	 *
	 * @param message 消息
	 */
	public void success(String message) {
		successWithoutClean(message);
		cleanInput();
	}

	/**
	 * 设置成功标识、不清除全部的输入
	 *
	 * @param message 消息
	 */
	private void successWithoutClean(String message) {
		this.status = SUCCESS;
		this.message = message;
	}

	public boolean isSuccess() {
		return this.status == SUCCESS;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * 添加一条结果
	 *
	 * @param o 类型
	 */
	public void addData(T o) {
		if (null == this.data) {
			this.data = new ArrayList<>();
		}
		this.data.add(o);
	}

	/**
	 * 添加多条结果
	 *
	 * @param o 类型
	 */
	public void addData(List<T> o) {
		if (null == this.data) {
			this.data = new ArrayList<>();
		}
		this.data.addAll(o);
	}

	/**
	 * 删除全部的输入数据
	 */
	private void cleanInput() {
		this.param = null;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

    //@Override
    //public String toString() {
    //    return "ConfigParameter [status=" + status + ", message=" + message
    //            + ", startIndex=" + startIndex + ", pageSize=" + pageSize
    //            + ", data=" + data + ", pageCount=" + pageCount + ", param="
    //            + param + "]";
    //}
}
