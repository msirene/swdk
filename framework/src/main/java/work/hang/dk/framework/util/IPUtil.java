package work.hang.dk.framework.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
@Slf4j
public class IPUtil {

	//protected static Logger logger = LoggerFactory.getLogger(IPUtil.class);

	/**
	 * 获得主机IP
	 *
	 * @return String
	 */
	private static boolean isWindowsOS() {
		String windows = "windows";
		boolean isWindowsOS = false;
		String osName = System.getProperty("os.name");
		if (StringUtils.contains(osName.toLowerCase(), windows)) {
			isWindowsOS = true;
		}
		return isWindowsOS;
	}

	/**
	 * 获取本机ip地址，并自动区分Windows还是linux操作系统
	 *
	 * @return String
	 */
	private static String getLocalIP() {
		try {
			String sIP = "";
			InetAddress ip = null;
			// 如果是Windows操作系统
			if (isWindowsOS()) {
				ip = InetAddress.getLocalHost();
			}
			// 如果是Linux操作系统
			else {
				boolean bFindIP = false;
				Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
				while (netInterfaces.hasMoreElements()) {
					if (bFindIP) {
						break;
					}
					NetworkInterface networkInterface = netInterfaces.nextElement();
					// ----------特定情况，可以考虑用ni.getName判断
					// 遍历所有ip
					Enumeration<InetAddress> ips = networkInterface.getInetAddresses();
					while (ips.hasMoreElements()) {
						ip = ips.nextElement();
						// 127.开头的都是lookback地址
						if (ip.isSiteLocalAddress() && !ip.isLoopbackAddress() && StringUtils.contains(ip.getHostAddress(), ":")) {
							bFindIP = true;
							break;
						}
					}
				}
			}
			if (null != ip) {
				sIP = ip.getHostAddress();
			}
			return sIP;
		} catch (Exception e) {
			log.error("", e);
		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println(IPUtil.getLocalIP());
	}
}
