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
@XmlRootElement(name = "FPNsrfpjcVO")
public class FPNsrfpjcVO extends BaseBean {

	private static final long serialVersionUID = 5463575966705747363L;

	/**
	 * 份数
	 */
	@XmlElement(name = "fs")
	private String fs;

	/**
	 * 发票代码
	 */
	@XmlElement(name = "fpDm")
	private String fpDm;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 发票种类代码
	 */
	@XmlElement(name = "fpzlDm")
	private String fpzlDm;

	/**
	 * 登记序号
	 */
	@XmlElement(name = "djxh")
	private String djxh;

	/**
	 * 税务机关代码
	 */
	@XmlElement(name = "swjgDm")
	private String swjgDm;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq2;

	/**
	 * 发票终止号码
	 */
	@XmlElement(name = "fpzzhm")
	private String fpzzhm;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 发票种类代码
	 */
	@XmlElement(name = "fpzlDm")
	private String fpzlDm2;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 登记序号
	 */
	@XmlElement(name = "djxh")
	private String djxh2;

	/**
	 * 发票起始号码
	 */
	@XmlElement(name = "fpqshm")
	private String fpqshm;

	/**
	 * 份数
	 */
	@XmlElement(name = "fs")
	private String fs2;

	/**
	 * 發票代碼
	 */
	@XmlElement(name = "fpDm")
	private String fpDm2;

	/**
	 * 纳税人结存UUID
	 */
	@XmlElement(name = "nsrjcuuid")
	private String nsrjcuuid;

	/**
	 * 发票终止号码
	 */
	@XmlElement(name = "fpzzhm")
	private String fpzzhm2;

	/**
	 * 发票起始号码
	 */
	@XmlElement(name = "fpqshm")
	private String fpqshm2;

	/**
	 * 发票状态代码
	 */
	@XmlElement(name = "fpztDm")
	private String fpztDm;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "llrDm")
	private String lrrDm2;


	/**
	 * 发票状态代码
	 */
	@XmlElement(name = "fpztDm")
	private String fpztDm2;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm2;

	/**
	 * 税务机关代码
	 */
	@XmlElement(name = "swjgDm")
	private String swjgDm2;
	/**
	 * 纳税人结存UUID
	 */
	@XmlElement(name = "nsrjcuuid")
	private String nsrjcuuid2;

	/**
	 * @return the sjgsdq2
	 */
	public String getSjgsdq2() {
		return sjgsdq2;
	}

	/**
	 * @param sjgsdq2 the sjgsdq2 to set
	 */
	public void setSjgsdq2(String sjgsdq2) {
		this.sjgsdq2 = sjgsdq2;
	}

	/**
	 * @return the fpzlDm2
	 */
	public String getFpzlDm2() {
		return fpzlDm2;
	}

	/**
	 * @param fpzlDm2 the fpzlDm2 to set
	 */
	public void setFpzlDm2(String fpzlDm2) {
		this.fpzlDm2 = fpzlDm2;
	}

	/**
	 * @return the djxh2
	 */
	public String getDjxh2() {
		return djxh2;
	}

	/**
	 * @param djxh2 the djxh2 to set
	 */
	public void setDjxh2(String djxh2) {
		this.djxh2 = djxh2;
	}

	/**
	 * @return the fs2
	 */
	public String getFs2() {
		return fs2;
	}

	/**
	 * @param fs2 the fs2 to set
	 */
	public void setFs2(String fs2) {
		this.fs2 = fs2;
	}

	/**
	 * @return the fpDm2
	 */
	public String getFpDm2() {
		return fpDm2;
	}

	/**
	 * @param fpDm2 the fpDm2 to set
	 */
	public void setFpDm2(String fpDm2) {
		this.fpDm2 = fpDm2;
	}

	/**
	 * @return the fpzzhm2
	 */
	public String getFpzzhm2() {
		return fpzzhm2;
	}

	/**
	 * @param fpzzhm2 the fpzzhm2 to set
	 */
	public void setFpzzhm2(String fpzzhm2) {
		this.fpzzhm2 = fpzzhm2;
	}

	/**
	 * @return the fpqshm2
	 */
	public String getFpqshm2() {
		return fpqshm2;
	}

	/**
	 * @param fpqshm2 the fpqshm2 to set
	 */
	public void setFpqshm2(String fpqshm2) {
		this.fpqshm2 = fpqshm2;
	}

	/**
	 * @return the lrrDm2
	 */
	public String getLrrDm2() {
		return lrrDm2;
	}

	/**
	 * @param lrrDm2 the lrrDm2 to set
	 */
	public void setLrrDm2(String lrrDm2) {
		this.lrrDm2 = lrrDm2;
	}

	/**
	 * @return the fpztDm2
	 */
	public String getFpztDm2() {
		return fpztDm2;
	}

	/**
	 * @param fpztDm2 the fpztDm2 to set
	 */
	public void setFpztDm2(String fpztDm2) {
		this.fpztDm2 = fpztDm2;
	}

	/**
	 * @return the xgrDm2
	 */
	public String getXgrDm2() {
		return xgrDm2;
	}

	/**
	 * @param xgrDm2 the xgrDm2 to set
	 */
	public void setXgrDm2(String xgrDm2) {
		this.xgrDm2 = xgrDm2;
	}

	/**
	 * @return the swjgDm2
	 */
	public String getSwjgDm2() {
		return swjgDm2;
	}

	/**
	 * @param swjgDm2 the swjgDm2 to set
	 */
	public void setSwjgDm2(String swjgDm2) {
		this.swjgDm2 = swjgDm2;
	}

	/**
	 * @return the nsrjcuuid2
	 */
	public String getNsrjcuuid2() {
		return nsrjcuuid2;
	}

	/**
	 * @param nsrjcuuid2 the nsrjcuuid2 to set
	 */
	public void setNsrjcuuid2(String nsrjcuuid2) {
		this.nsrjcuuid2 = nsrjcuuid2;
	}

	/**
	 * @return the fs
	 */
	public String getFs() {
		return fs;
	}

	/**
	 * @param fs the fs to set
	 */
	public void setFs(String fs) {
		this.fs = fs;
	}

	/**
	 * @return the fpDm
	 */
	public String getFpDm() {
		return fpDm;
	}

	/**
	 * @param fpDm the fpDm to set
	 */
	public void setFpDm(String fpDm) {
		this.fpDm = fpDm;
	}

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
	 * @return the fpzlDm
	 */
	public String getFpzlDm() {
		return fpzlDm;
	}

	/**
	 * @param fpzlDm the fpzlDm to set
	 */
	public void setFpzlDm(String fpzlDm) {
		this.fpzlDm = fpzlDm;
	}

	/**
	 * @return the djxh
	 */
	public String getDjxh() {
		return djxh;
	}

	/**
	 * @param djxh the djxh to set
	 */
	public void setDjxh(String djxh) {
		this.djxh = djxh;
	}

	/**
	 * @return the swjgDm
	 */
	public String getSwjgDm() {
		return swjgDm;
	}

	/**
	 * @param swjgDm the swjgDm to set
	 */
	public void setSwjgDm(String swjgDm) {
		this.swjgDm = swjgDm;
	}

	/**
	 * @return the fpzzhm
	 */
	public String getFpzzhm() {
		return fpzzhm;
	}

	/**
	 * @param fpzzhm the fpzzhm to set
	 */
	public void setFpzzhm(String fpzzhm) {
		this.fpzzhm = fpzzhm;
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
	 * @return the fpqshm
	 */
	public String getFpqshm() {
		return fpqshm;
	}

	/**
	 * @param fpqshm the fpqshm to set
	 */
	public void setFpqshm(String fpqshm) {
		this.fpqshm = fpqshm;
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
	 * @return the nsrjcuuid
	 */
	public String getNsrjcuuid() {
		return nsrjcuuid;
	}

	/**
	 * @param nsrjcuuid the nsrjcuuid to set
	 */
	public void setNsrjcuuid(String nsrjcuuid) {
		this.nsrjcuuid = nsrjcuuid;
	}

	/**
	 * @return the fpztDm
	 */
	public String getFpztDm() {
		return fpztDm;
	}

	/**
	 * @param fpztDm the fpztDm to set
	 */
	public void setFpztDm(String fpztDm) {
		this.fpztDm = fpztDm;
	}

}
