package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum TaxpayerStatusCode {
	/**
	 * 受理
	 */
	ACCEPT("01", "受理"),

	/**
	 * 筹建期
	 */
	PREPARATORY("02", "筹建期"),

	/**
	 * 正常
	 */
	NORMAL("03", "正常"),

	/**
	 * 停业
	 */
	CLOSURE("04", "停业"),

	/**
	 * 非正常
	 */
	ABNORMAL("05", "非正常"),

	/**
	 * 清算
	 */
	LIQUIDATION("06", "清算"),

	/**
	 * 注销
	 */
	CANCEL("07", "注销"),

	/**
	 * 非正常户注销
	 */
	ABNORMAL_CANCEL("08", "非正常户注销"),

	/**
	 * 报验
	 */
	DECLARATION("09", "报验"),

	/**
	 * 核销报验
	 */
	VERIFICATION("10", "核销报验"),

	/**
	 * 中断缴费
	 */
	SUSPEND_PAYMENT("11", "中断缴费"),

	/**
	 * 恢复缴费
	 */
	RESUME_PAYMENT("12", "恢复缴费"),

	/**
	 * 其他
	 */
	OTHER("99", "其他");

	private String code;

	private String message;

	TaxpayerStatusCode(String code, String message) {
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
		for (TaxpayerStatusCode bs : TaxpayerStatusCode.values()) {
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
