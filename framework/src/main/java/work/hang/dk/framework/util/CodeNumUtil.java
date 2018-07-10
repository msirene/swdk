package work.hang.dk.framework.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/5/31
 */
public final class CodeNumUtil {
	//private static Logger logger = LoggerFactory.getLogger(CodeNumUtil.class);

	private static int LSH = 0;
	private static long LASTGETTIME = -1L;
	//private static long twepoch = 1480000000000L;

	/**
	 * baseString 递归调用
	 *
	 * @param num  十进制数
	 * @param base 要转换成的进制数
	 */
	private static String baseString(int num, int base) {
		String str;
		String digit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (num == 0) {
			return "";
		} else {
			str = baseString(num / base, base);
			return str + digit.charAt(num % base);
		}
	}

	/**
	 * [概 要]十进制转三十六进制方法
	 *
	 * @param num  十进制数
	 * @param base 要转的进制数
	 * @return 三十六进制的字符串
	 */
	private static String baseString(BigInteger num, int base) {
		String str;
		String digit = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (num.longValue() == 0) {
			return "";
		} else {
			BigInteger valueOf = BigInteger.valueOf(base);
			str = baseString(num.divide(valueOf), base);
			return str + digit.charAt(num.mod(valueOf).shortValue());
		}
	}

	/**
	 * [概 要]获得唯一码
	 *
	 * @param num 十进制数字
	 * @return 十进制转三十六进制后的len位CODE
	 */
	private static String getQrCodeNum(BigInteger num, Integer len) {
		//String value = baseString(num, 36);
		/*
		 * while (baseString.length() < len) { baseString = "0" + baseString; }
		 */
		return baseString(num, 36);
	}

	private static long tilNextMillis(long lastTimestamp) {
		long timestamp = System.currentTimeMillis();
		while (timestamp <= lastTimestamp) {
			timestamp = System.currentTimeMillis();
		}
		return timestamp;
	}

	private synchronized static String getQRCodeNum(String machineCode) {
		long timestamp = System.currentTimeMillis();
		if (LASTGETTIME > timestamp) {
			throw new RuntimeException();
		}
		if (LASTGETTIME == timestamp) {
			LSH = LSH + 1;
			int ninetynine = 99;
			if (LSH > ninetynine) {
				timestamp = tilNextMillis(LASTGETTIME);
				LSH = 0;
			}
		} else {
			LSH = 0;
		}
		//String ip = IPUtil.getLocalIP();
		//String value = ResourceBundle.getBundle("config/config").getString(ip + "_machine");
		long twepoch = 1480000000000L;
		String s = (timestamp - twepoch) + machineCode + LSH;
		LASTGETTIME = timestamp;
		String codeNumStr = getQrCodeNum(new BigInteger(s), 10);
		String codeNumZero = "0000000000";
		if (StringUtils.equals(codeNumStr, codeNumZero)) {
			//logger.error(String.format("errorNumssss:%s%s", s, "*****"));
			throw new RuntimeException();
		}
		return codeNumStr;

	}

    /*public synchronized static String getQRCodeNum(String machineCode) {
        long timestamp = System.currentTimeMillis();
        if (LASTGETTIME > timestamp) {
            throw new RuntimeException();
        }
        if (LASTGETTIME == timestamp) {
            LSH = LSH + 1;
            if (LSH > 99) {
                timestamp = tilNextMillis(LASTGETTIME);
                LSH = 0;
            }
        } else {
            LSH = 0;
        }
        String s = (timestamp - twepoch) + machineCode + LSH;
        LASTGETTIME = timestamp;
        return s;
    }*/

	//public static void main(String[] args) {
	//	//System.out.println(System.nanoTime() + "" + (int) (new Random().nextDouble() * (99999 - 10000 + 1)));
	//	//System.out.println(getQRCodeNum("1"));
	//
	//	System.out.println(getQRCodeNum("1"));
	//}
}
