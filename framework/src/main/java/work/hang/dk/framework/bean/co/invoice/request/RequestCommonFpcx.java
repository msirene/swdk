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
@XmlType(propOrder = {"fpqqlsh"})
public class RequestCommonFpcx extends BaseBean {
	private static final long serialVersionUID = -2096219769926139971L;
	/**
	 * 发票请求流水号
	 */
	@XmlElement(name = "FPQQLSH")
	private String fpqqlsh;

	@XmlAttribute(name = "class")
	private String classType = "REQUEST_COMMON_FPCX";

	public String getFpqqlsh() {
		return fpqqlsh;
	}

	public void setFpqqlsh(String fpqqlsh) {
		this.fpqqlsh = fpqqlsh;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
}
