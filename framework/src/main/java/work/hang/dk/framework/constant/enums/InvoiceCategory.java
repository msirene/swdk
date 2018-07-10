package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum InvoiceCategory {
	/**
	 * 增值税专用发票
	 */
	ZZSZYFP("1", "增值税专用发票"),

	/**
	 * 通用机打平推式普通发票
	 */
	TYJDPTSPTFP("2", "通用机打平推式普通发票"),

	/**
	 * 通用机打卷式普通发票
	 */
	TYJDJSPTFP("3", "通用机打卷式普通发票"),

	/**
	 * 通用手工普通发票
	 */
	TYSGPTFP("4", "通用手工普通发票"),

	/**
	 * 通用定额普通发票
	 */
	TPDEPTFP("5", "通用定额普通发票"),

	/**
	 * 企业冠名普通发票
	 */
	QYGMPTFP("6", "企业冠名普通发票"),

	/**
	 * 企业冠名普通发票
	 */
	QYGMPTFP2("7", "企业冠名普通发票"),

	/**
	 * 特定业务普通发票
	 */
	TDYWPTFP("8", "特定业务普通发票"),

	/**
	 * 其他
	 */
	OTHER("9", "其他");

	private String code;

	private String message;

	InvoiceCategory(String code, String message) {
		this.code = code;
		this.message = message;
	}


	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public static String getMessage(String code) {
		for (InvoiceCategory bs : InvoiceCategory.values()) {
			if (bs.match(code)) {
				return bs.getMessage();
			}
		}
		return null;
	}

	public boolean match(String code) {
		return this.code.equals(code);
	}

	@Override
	public String toString() {
		return String.format("code:%s,message:%s", code, message);
	}
}
