package work.hang.dk.framework.constant.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum InvoiceStatus {
	/**
	 * 0-正在开票
	 */
	INVOICE_UNDERWAY("0", "正在开票"),
	/**
	 * 1-开票成功
	 */
	INVOICE_SUCCEED("1", "开票成功"),
	/**
	 * 2-开票失败
	 */
	INVOICE_DEFEATED("2", "开票失败"),
	/**
	 * 3-取消开票
	 */
	INVOICE_CANCELLED("3", "开票取消"),;

	private String status;

	private String message;

	InvoiceStatus(String status, String message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * 得到发票状态对象
	 *
	 * @param status
	 * @return
	 */
	public static InvoiceStatus getStatus(String status) {
		if (StringUtils.isEmpty(status)) {
			return null;
		}
		for (InvoiceStatus invoiceStatus : InvoiceStatus.values()) {
			if (invoiceStatus.getStatus().equals(status)) {
				return invoiceStatus;
			}
		}
		return null;
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
