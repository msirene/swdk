package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum CooperationType {
	/**
	 * 获取实名认证信息
	 */
	REAL_NAME_REGISTRATION(1),

	/**
	 * 获取企业信息
	 */
	GET_ENTERPRISES(2),

	/**
	 * 获取企业的剩余额度
	 */
	GET_AMOUNT(3),

	/**
	 * 开具发票
	 */
	INVOICE(4),

	/**
	 * 同步发票状态
	 */
	SYNCHRONIZE_STATUS(5),

//    /**
//     * 传递发票数据到金三系统
//     */
//    TRANSFER_INVOCIE(6),
//
//    /**
//     * 申请开票
//     */
//    APPLY(7)
	;

	private int code;

	CooperationType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return String.valueOf(code);
	}
}
