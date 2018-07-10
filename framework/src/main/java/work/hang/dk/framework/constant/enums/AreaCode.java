package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum AreaCode {
	BEI_JING("010", "北京市"),

	CHONG_QING("023", "重庆市"),

	CHANG_SHA("0731", "长沙市");

	private String code;

	private String message;

	AreaCode(String code, String message) {
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
		for (AreaCode bs : AreaCode.values()) {
			if (bs.getCode().equals(code)) {
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
		return code;
	}
}
