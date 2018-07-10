package work.hang.dk.framework.bean.co.invoice.request;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"fpt", "xmxxs"})
public class RequestCommonFpkj extends BaseBean {
	private static final long serialVersionUID = -6150686288682064614L;
	/**
	 * 发票抬头
	 */
	@XmlElement(name = "COMMON_FPKJ_FPT")
	private CommonFpkjFpt fpt = new CommonFpkjFpt();

	/**
	 * 项目信息
	 */
	@XmlElement(name = "COMMON_FPKJ_XMXXS")
	private CommonFpkjXmxxs xmxxs = new CommonFpkjXmxxs();

	@XmlAttribute(name = "class")
	private String classType = "REQUEST_COMMON_FPKJ";

	public CommonFpkjFpt getFpt() {
		return fpt;
	}

	public void setFpt(CommonFpkjFpt fpt) {
		this.fpt = fpt;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public CommonFpkjXmxxs getXmxxs() {
		return xmxxs;
	}

	public void setXmxxs(CommonFpkjXmxxs xmxxs) {
		this.xmxxs = xmxxs;
	}
}
