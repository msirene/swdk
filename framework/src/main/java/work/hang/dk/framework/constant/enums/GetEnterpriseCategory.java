package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum GetEnterpriseCategory {
	/**
	 * 注册
	 */
	REGISTRATION("1", "注册"),

	/**
	 * 开通企业
	 */
	SYNCHRONIZATION("2", "开通企业"),
// 同步企业数据2 开始 陈誉天 2018-02-23
	/**
	 * 确认开票时的验证
	 */
	CHECK("3", "确认开票时的验证"),

	/**
	 * 申请开票时的验证
	 */
	APPLY("4", "申请开票时的验证"),

	/**
	 * 注册时的重新获取
	 */
	SYNCHRONIZATION_4_REGISTRATION("5", "注册时的重新获取");
// 同步企业数据2 结束 陈誉天 2018-02-23

	private String code;

	private String message;

	GetEnterpriseCategory(String code, String message) {
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
		for (GetEnterpriseCategory bs : GetEnterpriseCategory.values()) {
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
