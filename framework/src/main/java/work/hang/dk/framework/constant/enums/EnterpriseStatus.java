package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum EnterpriseStatus {
	/**
	 * 0-正常
	 */
	OK("0", "正常"),
	/**
	 * 1-异常
	 */
	NG("1", "异常"),
	/**
	 * 2-同步失败
	 */
	ERROR("2", "同步失败");

	private String status;

	private String message;

	public boolean match(String status) {
		return this.status.equals(status);
	}

	EnterpriseStatus(String status, String message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
