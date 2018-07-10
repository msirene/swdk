package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "service")
@XmlType(propOrder = {"head", "body"})
public class Service extends BaseBean {
	private static final long serialVersionUID = 1L;

	@XmlAttribute(name = "xmlns")
	private String xmlns = "";

	@XmlElement(name = "head")
	private Head head;

	@XmlElement(name = "body")
	private String body;

	/**
	 * 存放body数据的bean
	 */
	private TaxMl originData;

	/**
	 * @return the xmlns
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * @param xmlns the xmlns to set
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * @return the head
	 */
	public Head getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Head head) {
		this.head = head;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	public TaxMl getOriginData() {
		return originData;
	}

	public void setOriginData(TaxMl originData) {
		this.originData = originData;
	}
}
