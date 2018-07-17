package work.hang.dk.framework.log;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import work.hang.dk.framework.bean.RemoteParameter;
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
public class LoggingAspect {
	//private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	private Set<String> excludeMethods = new HashSet<>();

	public void setExcludeMethods() {
		Set<String> excludeMethods = new HashSet<>();
		this.excludeMethods = excludeMethods;
	}

	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object[] args = proceedingJoinPoint.getArgs();
		Object firstParam = args[0];
		RemoteParameter<?> remoteParameter = null;
		Signature classMethod = proceedingJoinPoint.getSignature();
		String methodName = classMethod.getName();
		if (firstParam instanceof RemoteParameter<?>) {
			remoteParameter = (RemoteParameter<?>) firstParam;
		}

		boolean logFlag = false;

		if (null != remoteParameter) {
			// 未设置流水号的场合、自动设置一个流水号
			if (StringUtils.isEmpty(remoteParameter.getSerialNumber())) {
				remoteParameter.setSerialNumber(CommonUtil.generateWebSerialNumber());
			}
			if (!excludeMethods.contains(methodName)) {
				logFlag = true;
			}
			args[0] = remoteParameter;
		}

		if (logFlag) {
			//前置通知
			log.info(CommonUtil.appendSerialNumber(remoteParameter, String.format("方法[%s]开始", classMethod)));
			if (null != remoteParameter.getParam()) {
				log.info(CommonUtil.appendSerialNumber(remoteParameter, "参数：%s", remoteParameter.getParam().toString()));
			}
		}
		Object result = proceedingJoinPoint.proceed(args);
		if (logFlag) {
			//后置通知
			log.info(CommonUtil.appendSerialNumber(remoteParameter, String.format("方法[%s]结束", classMethod)));
		}
		return result;

	}
}
