package work.hang.dk.framework.bean.co.invoice.request;

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
public class BusinessRequestCommonFpcx extends BaseBean {

	private static final long serialVersionUID = 8441652395174939226L;
	/**
	 * ID
	 */
	@XmlAttribute(name = "id")
	private String id="FPCX";

	/**
	 * 描述
	 */
	@XmlAttribute(name = "comment")
	private String comment="发票查询";

	/**
	 * 发票内容
	 */
	@XmlElement(name = "REQUEST_COMMON_FPCX")
	private RequestCommonFpcx fpcx = new RequestCommonFpcx();

	public BusinessRequestCommonFpcx() {
	}

	public BusinessRequestCommonFpcx(String fpqqlsh) {
		this.fpcx.setFpqqlsh(fpqqlsh);
	}

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

	public RequestCommonFpcx getFpcx() {
		return fpcx;
	}

	public void setFpcx(RequestCommonFpcx fpcx) {
		this.fpcx = fpcx;
	}
}
