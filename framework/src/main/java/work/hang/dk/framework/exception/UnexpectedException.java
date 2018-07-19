package work.hang.dk.framework.exception;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class UnexpectedException extends SystemException {

	private static final long serialVersionUID = -4294304120127132394L;

//    private static final String MESSAGE_CODE = MessageConstant.FRAMEWORK_ERROE_003;

	//public UnexpectedException() {
     //   super(MESSAGE_CODE);
	//}
	//
	//public UnexpectedException(Throwable e) {
     //   super(MESSAGE_CODE, e);
	//}
	//
	public UnexpectedException() {
		super("预期外异常！");
	}

	public UnexpectedException(String message, Throwable e) {
		super(message, e);
	}
}
