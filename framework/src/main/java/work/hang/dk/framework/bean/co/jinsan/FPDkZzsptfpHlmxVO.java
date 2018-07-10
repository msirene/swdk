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
@XmlRootElement(name = "fpdkzzsptfpHlmxVO")

public class FPDkZzsptfpHlmxVO extends BaseBean {

	private static final long serialVersionUID = -4764982065865243672L;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 货劳数量
	 */
	@XmlElement(name = "hlsl")
	private String hlsl;

	/**
	 * 税额
	 */
	@XmlElement(name = "se")
	private String se;

	/**
	 * 单位数量代码
	 */
	@XmlElement(name = "dwslDm")
	private String dwslDm;

	/**
	 * 增值税发票UUID
	 */
	@XmlElement(name = "zzsfpuuid")
	private String zzsfpuuid;

	/**
	 * 税率征收率
	 */
	@XmlElement(name = "slzsl")
	private String slzsl;

	/**
	 * 金额
	 */
	@XmlElement(name = "je")
	private String je;

	/**
	 * 单价
	 */
	@XmlElement(name = "hldj")
	private String hldj;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 货物劳务名称
	 */
	@XmlElement(name = "hwlwmc")
	private String hwlwmc;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 规格型号
	 */
	@XmlElement(name = "ggxh")
	private String ggxh;

	/**
	 * 增值税发票明细UUID
	 */
	@XmlElement(name = "zzsfpmxuuid")
	private String zzsfpmxuuid;

	/**
	 * 含税销售额
	 */
	@XmlElement(name = "xse")
	private String xse;

	/**
	 * 扣除额
	 */
	@XmlElement(name = "kce")
	private String kce;

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
	 * @return the hlsl
	 */
	public String getHlsl() {
		return hlsl;
	}

	/**
	 * @param hlsl the hlsl to set
	 */
	public void setHlsl(String hlsl) {
		this.hlsl = hlsl;
	}

	/**
	 * @return the se
	 */
	public String getSe() {
		return se;
	}

	/**
	 * @param se the se to set
	 */
	public void setSe(String se) {
		this.se = se;
	}

	/**
	 * @return the dwslDm
	 */
	public String getDwslDm() {
		return dwslDm;
	}

	/**
	 * @param dwslDm the dwslDm to set
	 */
	public void setDwslDm(String dwslDm) {
		this.dwslDm = dwslDm;
	}

	/**
	 * @return the zzsfpuuid
	 */
	public String getZzsfpuuid() {
		return zzsfpuuid;
	}

	/**
	 * @param zzsfpuuid the zzsfpuuid to set
	 */
	public void setZzsfpuuid(String zzsfpuuid) {
		this.zzsfpuuid = zzsfpuuid;
	}

	/**
	 * @return the slzsl
	 */
	public String getSlzsl() {
		return slzsl;
	}

	/**
	 * @param slzsl the slzsl to set
	 */
	public void setSlzsl(String slzsl) {
		this.slzsl = slzsl;
	}

	/**
	 * @return the je
	 */
	public String getJe() {
		return je;
	}

	/**
	 * @param je the je to set
	 */
	public void setJe(String je) {
		this.je = je;
	}

	/**
	 * @return the hldj
	 */
	public String getHldj() {
		return hldj;
	}

	/**
	 * @param hldj the hldj to set
	 */
	public void setHldj(String hldj) {
		this.hldj = hldj;
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
	 * @return the hwlwmc
	 */
	public String getHwlwmc() {
		return hwlwmc;
	}

	/**
	 * @param hwlwmc the hwlwmc to set
	 */
	public void setHwlwmc(String hwlwmc) {
		this.hwlwmc = hwlwmc;
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
	 * @return the ggxh
	 */
	public String getGgxh() {
		return ggxh;
	}

	/**
	 * @param ggxh the ggxh to set
	 */
	public void setGgxh(String ggxh) {
		this.ggxh = ggxh;
	}

	/**
	 * @return the zzsfpmxuuid
	 */
	public String getZzsfpmxuuid() {
		return zzsfpmxuuid;
	}

	/**
	 * @param zzsfpmxuuid the zzsfpmxuuid to set
	 */
	public void setZzsfpmxuuid(String zzsfpmxuuid) {
		this.zzsfpmxuuid = zzsfpmxuuid;
	}

	/**
	 * @return the xse
	 */
	public String getXse() {
		return xse;
	}

	/**
	 * @param xse the xse to set
	 */
	public void setXse(String xse) {
		this.xse = xse;
	}

	/**
	 * @return the kce
	 */
	public String getKce() {
		return kce;
	}

	/**
	 * @param kce the kce to set
	 */
	public void setKce(String kce) {
		this.kce = kce;
	}

}
