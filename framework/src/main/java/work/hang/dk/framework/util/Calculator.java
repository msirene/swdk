package work.hang.dk.framework.util;

import java.math.BigDecimal;

/**
 * [概 要] 算术工具类
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/5/31
 */
public class Calculator {

	/**
	 * 加法
	 */
	private static BigDecimal add(BigDecimal arg0, BigDecimal arg1) {
		return arg0.add(arg1);
	}

	/**
	 * 减法
	 */
	private static BigDecimal subtract(BigDecimal arg0, BigDecimal arg1) {
		return arg0.subtract(arg1);
	}

	/**
	 * 乘法
	 */
	private static BigDecimal multiply(BigDecimal arg0, BigDecimal arg1, Integer digit) {
		return arg0.multiply(arg1).setScale(digit, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 除法 四舍五入
	 */
	private static BigDecimal divide(BigDecimal arg0, Integer digit, BigDecimal arg1) {
		return arg0.divide(arg1, digit, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args) {
		BigDecimal arg0 = new BigDecimal("17.11");
		BigDecimal arg1 = new BigDecimal("3.21");
		System.out.println(add(arg0, arg1));
		System.out.println(subtract(arg0, arg1));
		System.out.println(multiply(arg0, arg1, 3));
		System.out.println(divide(arg0, 3, arg1));
	}
}
