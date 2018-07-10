package work.hang.dk.framework.exception;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public interface BaseException {

	String getMessage();

	String getMessageCode();

	Object[] getReplacePattern();

	Throwable getCause();

}
