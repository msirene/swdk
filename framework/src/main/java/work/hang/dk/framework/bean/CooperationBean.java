package work.hang.dk.framework.bean;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class CooperationBean extends BaseBean {

	private static final long serialVersionUID = 3060155019565591061L;

	/**
	 * 请求类型
	 */
	private int type;

	/**
	 * 操作分类
	 */
	private String category;

	/**
	 * 参数
	 */
	private Object param;

	/**
	 * 附加参数
	 */
	private Object subParam;

	/**
	 * 处理结果
	 */
	private Object result;

	private String sn;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the param
	 */
	public Object getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(Object param) {
		this.param = param;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = trim(sn);
	}

	public Object getSubParam() {
		return subParam;
	}

	public void setSubParam(Object subParam) {
		this.subParam = subParam;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = trim(category);
	}
}
