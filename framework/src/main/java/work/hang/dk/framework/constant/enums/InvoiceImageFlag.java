package work.hang.dk.framework.constant.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum InvoiceImageFlag {
	TODO("0", "未生成"),
	DOING("1", "生成中"),
	DONE("2", "已生成"),
	FAIL("3", "生成失败");

	private String status;

	private String message;

	InvoiceImageFlag(String status, String message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * 根据状态得到对象
	 *
	 * @param status
	 * @return
	 */
	public static InvoiceImageFlag getStatus(String status) {
		if (StringUtils.isEmpty(status)) {
			return null;
		}
		for (InvoiceImageFlag pdfAndImageStatus : InvoiceImageFlag.values()) {
			if (pdfAndImageStatus.getStatus().equals(status)) {
				return pdfAndImageStatus;
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
