package work.hang.dk.framework.exception;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class BusinessException extends SystemException {

	private static final long serialVersionUID = -8068003799520647668L;

	public BusinessException(String definedMessage) {
		super(definedMessage);
	}

	public BusinessException(String messageCode, Throwable cause) {
		super(messageCode, cause);
	}

	//public BusinessException(String messageCode, Throwable t, Object[] pattern) {
	//	super(messageCode, t, pattern);
	//}
	//
	//public BusinessException(String messageCode, Object[] pattern) {
	//	super(messageCode, null, pattern);
	//}
}
