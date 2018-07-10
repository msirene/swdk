package work.hang.dk.framework.bean.co.invoice.request;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.NONE)
public class CommonFpkjXmxxs extends BaseBean {

	private static final long serialVersionUID = 1474619012136064218L;
	/**
	 * class属性
	 */
	@XmlAttribute(name = "class")
	private String classType="COMMON_FPKJ_XMXX";

	/**
	 * size属性
	 */
	@XmlAttribute(name = "size")
	private int size;

	@XmlElement(name = "COMMON_FPKJ_XMXX")
	private List<CommonFpkjXmxx> xmxxs = new ArrayList<>();

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<CommonFpkjXmxx> getXmxxs() {
		return xmxxs;
	}

	public void setXmxxs(List<CommonFpkjXmxx> xmxxs) {
		this.xmxxs = xmxxs;
	}
}
