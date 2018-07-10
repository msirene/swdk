package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum AppUserRole {
	/**
	 * 管理员
	 */
	MANAGER("1", "管理员"),

	/**
	 * 操作员
	 */
	EMPLOYEE("2", "操作员");

	private String code;

	private String message;

	AppUserRole(String code, String message) {
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
		for (AppUserRole bs : AppUserRole.values()) {
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
