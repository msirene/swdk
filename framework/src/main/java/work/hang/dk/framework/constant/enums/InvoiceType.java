package work.hang.dk.framework.constant.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum InvoiceType {

	/**
	 * 1-手动
	 */
	INVOICE_HANDCRAFT("1", "手动"),
	/**
	 * 2-非手动
	 */
	INVOICE_NO_HANDCRAFT("2", "非手动");

	private String type;

	private String message;

	InvoiceType(String type, String message) {
		this.type = type;
		this.message = message;
	}

	/**
	 * 得到发票类型对象
	 *
	 * @param type
	 */
	public static InvoiceType getType(String type) {
		if (StringUtils.isEmpty(type)) {
			return null;
		}
		for (InvoiceType invoiceType : InvoiceType.values()) {
			if (invoiceType.getType().equals(type)) {
				return invoiceType;
			}
		}
		return null;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
