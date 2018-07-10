package work.hang.dk.framework.constant.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum InvoiceKplx {

	/**
	 * 0-蓝票
	 */
	INVOICE_BLUE("0", "蓝票"),
	/**
	 * 1-红票
	 */
	INVOICE_RED("1", "红票");

	private String kplx;

	private String message;

	InvoiceKplx(String kplx, String message) {
		this.kplx = kplx;
		this.message = message;
	}

	/**
	 * 得到发票类型对象
	 *
	 */
	public static InvoiceKplx getKplx(String kplx) {
		if (StringUtils.isEmpty(kplx)) {
			return null;
		}
		for (InvoiceKplx _kplx : InvoiceKplx.values()) {
			if (_kplx.getKplx().equals(kplx)) {
				return _kplx;
			}
		}
		return null;
	}

	/**
	 * @return the kplx
	 */
	public String getKplx() {
		return kplx;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
