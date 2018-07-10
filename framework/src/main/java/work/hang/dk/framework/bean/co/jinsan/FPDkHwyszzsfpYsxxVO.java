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
@XmlRootElement(name = "fpdkhwyszzsfpYsxxVO")
public class FPDkHwyszzsfpYsxxVO extends BaseBean {

	private static final long serialVersionUID = -558715065251204950L;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 价税合计
	 */
	@XmlElement(name = "jshj")
	private String jshj;

	/**
	 * 船舶吨位
	 */
	@XmlElement(name = "cbdw")
	private String cbdw;

	/**
	 * 到达地
	 */
	@XmlElement(name = "ddd")
	private String ddd;

	/**
	 * 货物运输发票UUID
	 */
	@XmlElement(name = "hwysfpuuid")
	private String hwysfpuuid;

	/**
	 * 备注
	 */
	@XmlElement(name = "bz")
	private String bz;

	/**
	 * 经由地
	 */
	@XmlElement(name = "jyd")
	private String jyd;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 金额合计
	 */
	@XmlElement(name = "jehj")
	private String jehj;

	/**
	 * 货物运输发票运输信息uuid
	 */
	@XmlElement(name = "hwysfpysxxuuid")
	private String hwysfpysxxuuid;

	/**
	 * 运输货物信息
	 */
	@XmlElement(name = "yshwxx")
	private String yshwxx;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 起运地
	 */
	@XmlElement(name = "qyd")
	private String qyd;

	/**
	 * 车船吨位合计
	 */
	@XmlElement(name = "ccdwhj")
	private String ccdwhj;

	/**
	 * 发货人纳税人识别号
	 */
	@XmlElement(name = "fhrnsrsbh")
	private String fhrnsrsbh;

	/**
	 * 发货人名称
	 */
	@XmlElement(name = "fhrmc")
	private String fhrmc;

	/**
	 * 收货人纳税人识别号
	 */
	@XmlElement(name = "shrnsrsbh")
	private String shrnsrsbh;

	/**
	 * 收货人名称
	 */
	@XmlElement(name = "shrmc")
	private String shrmc;

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
	 * @return the jshj
	 */
	public String getJshj() {
		return jshj;
	}

	/**
	 * @param jshj the jshj to set
	 */
	public void setJshj(String jshj) {
		this.jshj = jshj;
	}

	/**
	 * @return the cbdw
	 */
	public String getCbdw() {
		return cbdw;
	}

	/**
	 * @param cbdw the cbdw to set
	 */
	public void setCbdw(String cbdw) {
		this.cbdw = cbdw;
	}

	/**
	 * @return the ddd
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * @param ddd the ddd to set
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
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
	 * @return the bz
	 */
	public String getBz() {
		return bz;
	}

	/**
	 * @param bz the bz to set
	 */
	public void setBz(String bz) {
		this.bz = bz;
	}

	/**
	 * @return the jyd
	 */
	public String getJyd() {
		return jyd;
	}

	/**
	 * @param jyd the jyd to set
	 */
	public void setJyd(String jyd) {
		this.jyd = jyd;
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
	 * @return the jehj
	 */
	public String getJehj() {
		return jehj;
	}

	/**
	 * @param jehj the jehj to set
	 */
	public void setJehj(String jehj) {
		this.jehj = jehj;
	}

	/**
	 * @return the hwysfpysxxuuid
	 */
	public String getHwysfpysxxuuid() {
		return hwysfpysxxuuid;
	}

	/**
	 * @param hwysfpysxxuuid the hwysfpysxxuuid to set
	 */
	public void setHwysfpysxxuuid(String hwysfpysxxuuid) {
		this.hwysfpysxxuuid = hwysfpysxxuuid;
	}

	/**
	 * @return the yshwxx
	 */
	public String getYshwxx() {
		return yshwxx;
	}

	/**
	 * @param yshwxx the yshwxx to set
	 */
	public void setYshwxx(String yshwxx) {
		this.yshwxx = yshwxx;
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
	 * @return the qyd
	 */
	public String getQyd() {
		return qyd;
	}

	/**
	 * @param qyd the qyd to set
	 */
	public void setQyd(String qyd) {
		this.qyd = qyd;
	}

	/**
	 * @return the ccdwhj
	 */
	public String getCcdwhj() {
		return ccdwhj;
	}

	/**
	 * @param ccdwhj the ccdwhj to set
	 */
	public void setCcdwhj(String ccdwhj) {
		this.ccdwhj = ccdwhj;
	}

	/**
	 * @return the fhrnsrsbh
	 */
	public String getFhrnsrsbh() {
		return fhrnsrsbh;
	}

	/**
	 * @param fhrnsrsbh the fhrnsrsbh to set
	 */
	public void setFhrnsrsbh(String fhrnsrsbh) {
		this.fhrnsrsbh = fhrnsrsbh;
	}

	/**
	 * @return the fhrmc
	 */
	public String getFhrmc() {
		return fhrmc;
	}

	/**
	 * @param fhrmc the fhrmc to set
	 */
	public void setFhrmc(String fhrmc) {
		this.fhrmc = fhrmc;
	}

	/**
	 * @return the shrnsrsbh
	 */
	public String getShrnsrsbh() {
		return shrnsrsbh;
	}

	/**
	 * @param shrnsrsbh the shrnsrsbh to set
	 */
	public void setShrnsrsbh(String shrnsrsbh) {
		this.shrnsrsbh = shrnsrsbh;
	}

	/**
	 * @return the shrmc
	 */
	public String getShrmc() {
		return shrmc;
	}

	/**
	 * @param shrmc the shrmc to set
	 */
	public void setShrmc(String shrmc) {
		this.shrmc = shrmc;
	}

}
