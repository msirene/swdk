package work.hang.dk.framework.bean.co.invoice.response;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="business")
public class BusinessResponseCommonFpcx extends BaseBean {

	private static final long serialVersionUID = -5070843041260290746L;
	/**
	 * ID
	 */
	@XmlAttribute(name = "id")
	private String id="";

	/**
	 * 描述
	 */
	@XmlAttribute(name = "comment")
	private String comment="";

	/**
	 * 响应类
	 */
	@XmlElement(name = "RESPONSE_COMMON_FPCX")
	private ResponseCommonFpcx fpcx;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public ResponseCommonFpcx getFpcx() {
		return fpcx;
	}
	public void setFpkj(ResponseCommonFpcx fpcx) {
		this.fpcx = fpcx;
	}
}
