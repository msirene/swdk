package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum OperationType {
	/**
	 * 增
	 */
	ADD("1"),

	/**
	 * 删
	 */
	MODIFY("2"),

	/**
	 * 改
	 */
	DELETE("3"),

	/**
	 * 查默认开票项
	 */
	DEFAULT("5");

	private String code;

	OperationType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return code;
	}
}
