package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum InvoiceItemType {
	/**
	 * 常用开票项
	 */
	BUREAU("1", "常用开票项"),

	/**
	 * 商品
	 */
	COMMODITY("2", "商品");

	private String code;

	private String message;

	InvoiceItemType(String code, String message) {
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
		for (InvoiceItemType bs : InvoiceItemType.values()) {
			if (bs.getCode().equals(code)) {
				return bs.getMessage();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return code;
	}
}
