package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum ImposeSubject {
	/**
	 * 单位纳税人税务登记
	 */
	_1110("1110", "单位纳税人税务登记"),

	/**
	 * 个体经营纳税人税务登记
	 */
	_1120("1120", "个体经营纳税人税务登记"),

	/**
	 * 临时税务登记纳税人登记
	 */
	_1130("1130", "临时税务登记纳税人登记"),

	/**
	 * 领取临时营业执照
	 */
	_1131("1131", "领取临时营业执照"),

	/**
	 * 承包租赁经营
	 */
	_1132("1132", "承包租赁经营"),

	/**
	 * 境外企业承包工程或劳务
	 */
	_1133("1133", "境外企业承包工程或劳务"),

	/**
	 * 未办理营业执照
	 */
	_1134("1134", "未办理营业执照"),

	/**
	 * 不需办工商营业执照而需有关部门批准但未经批准纳税人
	 */
	_1135("1135", "不需办工商营业执照而需有关部门批准但未经批准纳税人"),

	/**
	 * 异地非正常户
	 */
	_1136("1136", "异地非正常户"),

	/**
	 * 境外注册中资控股居民企业
	 */
	_1137("1137", "境外注册中资控股居民企业");

	private String code;

	private String message;

	ImposeSubject(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public static String getMessage(String code) {
		for (ImposeSubject bs : ImposeSubject.values()) {
			if (bs.match(code)) {
				return bs.getMessage();
			}
		}
		return null;
	}

	public static boolean matchAny(String code) {
		for (ImposeSubject bs : ImposeSubject.values()) {
			if (bs.match(code)) {
				return true;
			}
		}
		return false;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public boolean match(String code) {
		return this.code.equals(code);
	}

	@Override
	public String toString() {
		return String.format("code:%s,message:%s", code, message);
	}
}
