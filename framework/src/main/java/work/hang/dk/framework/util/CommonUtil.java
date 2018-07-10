package work.hang.dk.framework.util;

import work.hang.dk.framework.bean.RemoteParameter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/5/31
 */
public class CommonUtil {
	/**
	 * 字符集合
	 */
	private static char[] codes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

	public static String appendSerialNumber(RemoteParameter<?> rp, String message) {
		return appendSerialNumber(rp.getSerialNumber(), message);
	}

	public static String appendSerialNumber(RemoteParameter<?> rp, String message, Object... params) {
		return appendSerialNumber(rp.getSerialNumber(), message, params);
	}

	private static String appendSerialNumber(String sn, String message, Object... params) {
		return String.format("流水号：%s,日志信息===>%s", sn, String.format(message, params));
	}

	private static String appendSerialNumber(String sn, String message) {
		return String.format("流水号：%s,日志信息===>%s", sn, message);
	}

	/**
	 * 产生20位的流水号(纯数字)
	 *
	 * @return String 20位的流水号
	 */
	public static String generateWebSerialNumber() {
		return String.format("%d%s", System.currentTimeMillis(), getRandomNumber(7, true));
	}

	/**
	 * 产生随机码（纯数字）
	 *
	 * @param length      长度
	 * @param isCanRepeat 是否能够出现重复的字符，如果为true，则可能出现 5578这样包含两个5,如果为false，则不可能出现这种情况
	 * @return String 随机码
	 */
	private static String getRandomNumber(int length, boolean isCanRepeat) {
		// 随机抽取len个字符
		//int len = length;

		// 字符集合长度
		int n = codes.length;

		// 存放抽取出来的字符
		char[] result = new char[length];
		// 判断能否出现重复的字符
		if (isCanRepeat) {
			for (int i = 0; i < result.length; i++) {
				// 索引 0 and n-1
				int r = (int) (Math.random() * n);

				// 将result中的第i个元素设置为codes[r]存放的数值
				result[i] = codes[r];
			}
		} else {
			for (int i = 0; i < result.length; i++) {
				// 索引 0 and n-1
				int r = (int) (Math.random() * n);

				// 将result中的第i个元素设置为codes[r]存放的数值
				result[i] = codes[r];

				// 必须确保不会再次抽取到那个字符，因为所有抽取的字符必须不相同。
				// 因此，这里用数组中的最后一个字符改写codes[r]，并将n减1
				codes[r] = codes[n - 1];
				n--;
			}
		}
		return String.valueOf(result);
	}

	public static void main(String[] args) {
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 073185090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731-85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731 -85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731   -85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731- 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 0731-   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (0731)85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (0731) 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (0731)   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 86(0731)85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 86 (0731) 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 86   (0731)   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 +86(0731)85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 +86 (0731) 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 +86   (0731)   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (86)（0731）85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (86) （0731) 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (86)   (0731）   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (+86)(0731)85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 (+86） (0731) 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 （+86)   (0731)   85090988");
//
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 +86-(0731)85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 +86- (0731) 85090988");
//        splitAddressAndContacts("湖南省长沙市天心区中信凯旋蓝岸 +86-   (0731)   85090988");

		System.out.println("20171203".compareTo("20171202"));
	}

	public static boolean checkAuthorityItem(BigInteger authorityBin, int bitIndex) {
		BigInteger targetItems = BigInteger.ONE.shiftLeft(bitIndex);
		//boolean result = targetItems.equals(targetItems.and(authorityBin));
		return targetItems.equals(targetItems.and(authorityBin));
	}

	/**
	 * 拆分银行及账号
	 *
	 * @param args 参数
	 * @return String[]{'银行','账号'}
	 */
	public static String[] splitBankAndAccount(String args) {
		String regex = "([1-9])(\\d{14,17})";
		// 将给定的正则表达式编译到模式中
		Pattern pattern = Pattern.compile(regex);
		// 创建匹配给定输入与此模式的匹配器。
		Matcher matcher = pattern.matcher(args);
		String account = "";
		//查找字符串中是否有符合的子字符串
		while (matcher.find()) {
			//查找到符合的即输出
			account = matcher.group();
		}
		String[] result = new String[2];
		result[0] = args.replace(account, "");
		result[1] = account;
		return result;
	}

	/**
	 * 拆分地址以及联系方式
	 *
	 * @param args 参数
	 * @return String[]{'地址','联系方式'}
	 */
	public static String[] splitAddressAndContacts(String args) {
		String mobile = "((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[0-9])|(18[0,5-9]))\\d{8}";
		String fix = "([\\(（]?\\+?86[\\)）]?\\s*\\-?\\s*)?([\\\\(（]?0[0-9]{2,3}[\\\\)）]?\\s*\\-?\\s*)?([2-9][0-9]{6,7})+(\\-[0-9]{1,4})?";

		String regex = String.format("(%s)|(%s)", mobile, fix);
		// 将给定的正则表达式编译到模式中
		Pattern pattern = Pattern.compile(regex);
		// 创建匹配给定输入与此模式的匹配器。
		Matcher matcher = pattern.matcher(args);
		String contacts = "";
		//查找字符串中是否有符合的子字符串
		while (matcher.find()) {
			//查找到符合的即输出
			contacts = matcher.group();
		}
		String[] result = new String[2];
		result[0] = args.replace(contacts, "");
		result[1] = contacts;
		//System.out.println(String.format("address:%s ; contacts:%s", result[0], result[1]));
		return result;
	}

	/**
	 * 得到本季度第一天的日期
	 *
	 * @return Date
	 */
	public static Date getFirstDayOfQuarter(Date date) {
		Calendar cDay = Calendar.getInstance();
		cDay.setTime(date);
		int curMonth = cDay.get(Calendar.MONTH);
		if (curMonth >= Calendar.JANUARY && curMonth <= Calendar.MARCH) {
			cDay.set(Calendar.MONTH, Calendar.JANUARY);
		}
		if (curMonth >= Calendar.APRIL && curMonth <= Calendar.JUNE) {
			cDay.set(Calendar.MONTH, Calendar.APRIL);
		}
		if (curMonth >= Calendar.JULY && curMonth <= Calendar.AUGUST) {
			cDay.set(Calendar.MONTH, Calendar.JULY);
		}
		if (curMonth >= Calendar.OCTOBER && curMonth <= Calendar.DECEMBER) {
			cDay.set(Calendar.MONTH, Calendar.OCTOBER);
		}
		cDay.set(Calendar.DAY_OF_MONTH, cDay.getActualMinimum(Calendar.DAY_OF_MONTH));
		return cDay.getTime();
	}

	/**
	 * 得到本季度最后一天的日期
	 *
	 * @return Date
	 */
	public static Date getLastDayOfQuarter(Date date) {
		Calendar cDay = Calendar.getInstance();
		cDay.setTime(date);
		int curMonth = cDay.get(Calendar.MONTH);
		if (curMonth >= Calendar.JANUARY && curMonth <= Calendar.MARCH) {
			cDay.set(Calendar.MONTH, Calendar.MARCH);
		}
		if (curMonth >= Calendar.APRIL && curMonth <= Calendar.JUNE) {
			cDay.set(Calendar.MONTH, Calendar.JUNE);
		}
		if (curMonth >= Calendar.JULY && curMonth <= Calendar.AUGUST) {
			cDay.set(Calendar.MONTH, Calendar.AUGUST);
		}
		if (curMonth >= Calendar.OCTOBER && curMonth <= Calendar.DECEMBER) {
			cDay.set(Calendar.MONTH, Calendar.DECEMBER);
		}
		cDay.set(Calendar.DAY_OF_MONTH, cDay.getActualMaximum(Calendar.DAY_OF_MONTH));
		return cDay.getTime();
	}

	/**
	 * @param plusTax 含税金额
	 * @param taxRate 税率
	 * @param scale   精度
	 * @return BigDecimal[] 0:不含税金额 1:税额
	 */
	public static BigDecimal[] taxFee(BigDecimal plusTax, BigDecimal taxRate, int scale) {
		BigDecimal divisor = taxRate.add(BigDecimal.ONE).setScale(scale, RoundingMode.HALF_UP);
		BigDecimal excludingTax = plusTax.setScale(scale, RoundingMode.HALF_UP).divide(divisor, scale, RoundingMode.HALF_UP);
		BigDecimal taxFee = plusTax.subtract(excludingTax).setScale(scale, RoundingMode.HALF_UP);
		return new BigDecimal[]{excludingTax, taxFee};
	}
}
