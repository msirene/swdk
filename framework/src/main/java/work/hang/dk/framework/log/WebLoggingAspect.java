package work.hang.dk.framework.log;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import work.hang.dk.framework.util.CommonUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
@Slf4j
public class WebLoggingAspect {

	//private Logger logger = LoggerFactory.getLogger(WebLoggingAspect.class);

	private Set<String> excludeMethods = new HashSet<>();

	public void setExcludeMethods() {
		Set<String> excludeMethods = new HashSet<>();
		this.excludeMethods = excludeMethods;
	}

	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		try {
			Signature classMethod = proceedingJoinPoint.getSignature();
			String methodName = classMethod.getName();
			Object[] args = proceedingJoinPoint.getArgs();

			// 未设置流水号的场合、自动设置一个流水号
			if (args[0] == null || StringUtils.isEmpty(args[0].toString())) {
				args[0] = CommonUtil.generateWebSerialNumber();
			}
			String sn = args[0].toString();

			if (!excludeMethods.contains(methodName)) {
				//前置通知
				log.info(CommonUtil.appendSerialNumber(sn, "方法[%s]开始！", classMethod));
			}
			if (args.length > 1 && args[1] != null) {
				log.info(CommonUtil.appendSerialNumber(sn, "参数：%s", args[1].toString()));
			}
			Object result = proceedingJoinPoint.proceed(args);
			if (!excludeMethods.contains(methodName)) {
				//后置通知
				log.info(CommonUtil.appendSerialNumber(sn, "方法[%s]结束！", classMethod));
			}
			return result;
		} catch (Throwable e) {
			log.error("环绕日志处理发生异常！", e);
			throw e;
		}
	}
}
