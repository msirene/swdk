package work.hang.dk.framework.bean;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TInvoiceTitleBean extends BaseBean {
	private static final long serialVersionUID = 3711067080549961964L;
	/**
	 * 购买方名称
	 **/
	private String gmfMc;
	/**
	 * 购买方纳税人识别号
	 **/
	private String gmfNsrsbh;
	/**
	 * 购买方地址电话
	 **/
	private String gmfDzdh;
	/**
	 * 购买方开户行账号
	 **/
	private String gmfYhzh;

	private String getGmfMc() {
		return gmfMc;
	}

	public void setGmfMc(String gmfMc) {
		this.gmfMc = trim(gmfMc);
	}

	private String getGmfNsrsbh() {
		return gmfNsrsbh;
	}

	public void setGmfNsrsbh(String gmfNsrsbh) {
		this.gmfNsrsbh = trim(gmfNsrsbh);
	}

	private String getGmfDzdh() {
		return gmfDzdh;
	}

	public void setGmfDzdh(String gmfDzdh) {
		this.gmfDzdh = trim(gmfDzdh);
	}

	private String getGmfYhzh() {
		return gmfYhzh;
	}

	public void setGmfYhzh(String gmfYhzh) {
		this.gmfYhzh = trim(gmfYhzh);
	}

	public boolean match(TInvoiceTitleBean one) {
		return this.gmfMc.equals(one.getGmfMc())
				&& this.gmfNsrsbh.equals(one.getGmfNsrsbh())
				&& this.gmfDzdh.equals(one.getGmfDzdh())
				&& this.gmfYhzh.equals(one.getGmfYhzh());
	}
}
