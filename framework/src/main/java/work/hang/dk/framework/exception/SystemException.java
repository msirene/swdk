package work.hang.dk.framework.exception;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class SystemException extends RuntimeException implements BaseException {

	private static final long serialVersionUID = -7072006125908746827L;

	private String messageCode = null;

//    // TODO 暂时使用明文message
//    protected String message = null;
//
//    protected Throwable cause = null;

	private Object[] pattern = null;

	public SystemException(String definedMessage) {
		super(definedMessage);
	}

//    protected SystemException(String messageCode, Object[] pattern) {
//        this(messageCode, null, pattern);
//    }
//
//    protected SystemException(String messageCode, Throwable t) {
//        this(messageCode, t, null);
//    }

	public SystemException(String message, Object[] pattern) {
		this(message, null, pattern);
	}

	public SystemException(String message, Throwable t) {
		this(message, t, null);
	}

	public SystemException(String message, Throwable t, Object[] pattern) {
		super(message, t);
		// TODO this.messageCode = messageCode;
//        this.message = message;
//        this.cause = t;
		this.pattern = pattern;
	}

	@Override
	public String getMessage() {
		if (null == this.messageCode) {
			return super.getMessage();
		} else {
			// TODO 需要定义从message.properties获取错误消息的逻辑
			return "";
			// return MessageProperties.getInstance().getMessageValue(messageCode, pattern);
		}
	}

	@Override
	public String getMessageCode() {
		return messageCode;
	}

	@Override
	public Object[] getReplacePattern() {
		return pattern;
	}

	@Override
	public String toString() {
		return getMessage();
	}
}
