package work.hang.dk.framework.bean;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class Fpdksfzpzb extends BaseBean {

	private static final long serialVersionUID = 373006856815117997L;

	private String id;
	/**
	 * 征收项目代码
	 **/
	private String zsxmDm;
	/**
	 * 征收品目代码
	 **/
	private String zspmDm;
	/**
	 * 征收率
	 **/
	private String sfl;

	public String getZsxmDm() {
		return zsxmDm;
	}

	public void setZsxmDm(String zsxmDm) {
		this.zsxmDm = zsxmDm;
	}

	public String getZspmDm() {
		return zspmDm;
	}

	public void setZspmDm(String zspmDm) {
		this.zspmDm = zspmDm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSfl() {
		return sfl;
	}

	public void setSfl(String sfl) {
		this.sfl = sfl;
	}
}
