package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fpdkhwyszzsfpClmxVO")

public class FPDkHwyszzsfpClmxVO extends BaseBean {

	private static final long serialVersionUID = -5174672085722731763L;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name="sjgsdq")
	private String sjgsdq;

	/**
	 * 车辆类型代码
	 */
	@XmlElement(name="cllxDm")
	private String cllxDm;

	/**
	 * 代开申请车辆明细UUID
	 */
	@XmlElement(name="dksqclmxuuid")
	private String dksqclmxuuid;

	/**
	 * 车辆牌照号码
	 */
	@XmlElement(name="clpzhm")
	private String clpzhm;

	/**
	 * 车辆吨位
	 */
	@XmlElement(name="cldw")
	private String cldw;

	/**
	 * 货物运输业增值税专用发票UUID
	 */
	@XmlElement(name="hwysfpuuid")
	private String hwysfpuuid;

	/**
	 * 录入人代码
	 */
	@XmlElement(name="lrrDm")
	private String lrrDm;

	/**
	 * 修改人代码
	 */
	@XmlElement(name="xgrDm")
	private String xgrDm;

	/**
	 * 船舶类型代码
	 */
	@XmlElement(name="cblxDm1")
	private String cblxDm1;

	/**
	 * 身份证件类型代码
	 */
	@XmlElement(name="sfzjlxDm")
	private String sfzjlxDm;

	/**
	 * 身份证件号码
	 */
	@XmlElement(name="sfzjhm")
	private String sfzjhm;
	/**
	 * @return the sjgsdq
	 */
	public String getSjgsdq() {
		return sjgsdq;
	}
	/**
	 * @param sjgsdq the sjgsdq to set
	 */
	public void setSjgsdq(String sjgsdq) {
		this.sjgsdq = sjgsdq;
	}
	/**
	 * @return the cllxDm
	 */
	public String getCllxDm() {
		return cllxDm;
	}
	/**
	 * @param cllxDm the cllxDm to set
	 */
	public void setCllxDm(String cllxDm) {
		this.cllxDm = cllxDm;
	}
	/**
	 * @return the dksqclmxuuid
	 */
	public String getDksqclmxuuid() {
		return dksqclmxuuid;
	}
	/**
	 * @param dksqclmxuuid the dksqclmxuuid to set
	 */
	public void setDksqclmxuuid(String dksqclmxuuid) {
		this.dksqclmxuuid = dksqclmxuuid;
	}
	/**
	 * @return the clpzhm
	 */
	public String getClpzhm() {
		return clpzhm;
	}
	/**
	 * @param clpzhm the clpzhm to set
	 */
	public void setClpzhm(String clpzhm) {
		this.clpzhm = clpzhm;
	}
	/**
	 * @return the cldw
	 */
	public String getCldw() {
		return cldw;
	}
	/**
	 * @param cldw the cldw to set
	 */
	public void setCldw(String cldw) {
		this.cldw = cldw;
	}
	/**
	 * @return the hwysfpuuid
	 */
	public String getHwysfpuuid() {
		return hwysfpuuid;
	}
	/**
	 * @param hwysfpuuid the hwysfpuuid to set
	 */
	public void setHwysfpuuid(String hwysfpuuid) {
		this.hwysfpuuid = hwysfpuuid;
	}
	/**
	 * @return the lrrDm
	 */
	public String getLrrDm() {
		return lrrDm;
	}
	/**
	 * @param lrrDm the lrrDm to set
	 */
	public void setLrrDm(String lrrDm) {
		this.lrrDm = lrrDm;
	}
	/**
	 * @return the xgrDm
	 */
	public String getXgrDm() {
		return xgrDm;
	}
	/**
	 * @param xgrDm the xgrDm to set
	 */
	public void setXgrDm(String xgrDm) {
		this.xgrDm = xgrDm;
	}
	/**
	 * @return the cblxDm1
	 */
	public String getCblxDm1() {
		return cblxDm1;
	}
	/**
	 * @param cblxDm1 the cblxDm1 to set
	 */
	public void setCblxDm1(String cblxDm1) {
		this.cblxDm1 = cblxDm1;
	}
	/**
	 * @return the sfzjlxDm
	 */
	public String getSfzjlxDm() {
		return sfzjlxDm;
	}
	/**
	 * @param sfzjlxDm the sfzjlxDm to set
	 */
	public void setSfzjlxDm(String sfzjlxDm) {
		this.sfzjlxDm = sfzjlxDm;
	}
	/**
	 * @return the sfzjhm
	 */
	public String getSfzjhm() {
		return sfzjhm;
	}
	/**
	 * @param sfzjhm the sfzjhm to set
	 */
	public void setSfzjhm(String sfzjhm) {
		this.sfzjhm = sfzjhm;
	}


}
