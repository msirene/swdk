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
@XmlRootElement(name = "fpdksfmxVO")
public class FPDkSfmxVO extends BaseBean {

	private static final long serialVersionUID = -5837801969217167080L;
	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 计税费依据
	 */
	@XmlElement(name = "jsfyj")
	private String jsfyj;

	/**
	 * 税款所属期止
	 */
	@XmlElement(name = "skssqz")
	private String skssqz;

	/**
	 * 行业代码
	 */
	@XmlElement(name = "hyDm")
	private String hyDm;

	/**
	 * 主税征收品目代码
	 */
	@XmlElement(name = "zszspmDm")
	private String zszspmDm;

	/**
	 * 作废日期
	 */
	@XmlElement(name = "zfrq1")
	private String zfrq1;

	/**
	 * 关联代开申请UUID
	 */
	@XmlElement(name = "gldksquuid")
	private String gldksquuid;

	/**
	 * 主税征收子目
	 */
	@XmlElement(name = "zszszmDm")
	private String zszszmDm;

	/**
	 * 主税征收项目代码
	 */
	@XmlElement(name = "zszsxmDm")
	private String zszsxmDm;

	/**
	 * 减免税费额
	 */
	@XmlElement(name = "jmsfe")
	private String jmsfe;

	/**
	 * 已缴税费额
	 */
	@XmlElement(name = "yjsfe")
	private String yjsfe;

	/**
	 * 征收子目代码
	 */
	@XmlElement(name = "zszmDm")
	private String zszmDm;

	/**
	 * 减免审批结果uuid||对应yh_jmsspjg字段mxuuid
	 */
	@XmlElement(name = "jmspjguuid")
	private String jmspjguuid;
	/**
	 * 征收项目代码
	 */
	@XmlElement(name = "zsxmDm")
	private String zsxmDm;

	/**
	 * 代开发票类别代码||1增值税2通用机打3货物运输业4机动车5销售不动产6建筑业
	 */
	@XmlElement(name = "dkfplbDm")
	private String dkfplbDm;

	/**
	 * 代开申请UUID
	 */
	@XmlElement(name = "dksquuid")
	private String dksquuid;

	/**
	 * 税费明细UUID
	 */
	@XmlElement(name = "sfmxuuid")
	private String sfmxuuid;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 速算扣除数
	 */
	@XmlElement(name = "sskcs")
	private String sskcs;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 作废人代码
	 */
	@XmlElement(name = "zfrDm")
	private String zfrDm;

	/**
	 * 应补税费额
	 */
	@XmlElement(name = "ybsfe")
	private String ybsfe;

	/**
	 * 应纳税费额
	 */
	@XmlElement(name = "ynsfe")
	private String ynsfe;

	/**
	 * 允许扣除金额
	 */
	@XmlElement(name = "yxkcje")
	private String yxkcje;

	/**
	 * 收入总额
	 */
	@XmlElement(name = "srze")
	private String srze;

	/**
	 * 征收品目代码
	 */
	@XmlElement(name = "zspmDm")
	private String zspmDm;
	/**
	 * 作废标志
	 */
	@XmlElement(name = "zfbz1")
	private String zfbz1;
	/**
	 * 税费率
	 */
	@XmlElement(name = "sfl")
	private String sfl;

	/**
	 * 税款所属期起
	 */
	@XmlElement(name = "skssqq")
	private String skssqq;
	/**
	 * 经营项目代码
	 */
	@XmlElement(name = "jyxmDm")
	private String jyxmDm;
	/**
	 * 纳税期内已缴税额
	 */
	@XmlElement(name = "je")
	private String je;
	/**
	 * 代开申请单号码
	 */
	@XmlElement(name = "sqdhm")
	private String sqdhm;
	/**
	 * 土地等级代码
	 */
	@XmlElement(name = "tddjDm")
	private String tddjDm;
	/**
	 * 租金收入是否分摊
	 */
	@XmlElement(name = "zjsrsfft")
	private String zjsrsfft;
	/**
	 * 租赁月份起
	 */
	@XmlElement(name = "qxq")
	private String qxq;

	/**
	 * 租赁月份止
	 */
	@XmlElement(name = "qxz")
	private String qxz;

	/**
	 * 租金加收备注信息
	 */
	@XmlElement(name = "bz")
	private String bz;

	/**
	 * 是否出租住房
	 */
	@XmlElement(name = "sfzczf")
	private String sfzczf;

	/**
	 * 租金分摊减免金额
	 */
	@XmlElement(name = "jmje")
	private String jmje;

	/**
	 * 税收减免性质代码
	 */
	@XmlElement(name = "ssjmxzDm")
	private String ssjmxzDm;

	/**
	 * 税收减免性质名称
	 */
	@XmlElement(name = "ssjmxzmc")
	private String ssjmxzmc;

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
	 * @return the jsfyj
	 */
	public String getJsfyj() {
		return jsfyj;
	}

	/**
	 * @param jsfyj the jsfyj to set
	 */
	public void setJsfyj(String jsfyj) {
		this.jsfyj = jsfyj;
	}

	/**
	 * @return the skssqz
	 */
	public String getSkssqz() {
		return skssqz;
	}

	/**
	 * @param skssqz the skssqz to set
	 */
	public void setSkssqz(String skssqz) {
		this.skssqz = skssqz;
	}

	/**
	 * @return the hyDm
	 */
	public String getHyDm() {
		return hyDm;
	}

	/**
	 * @param hyDm the hyDm to set
	 */
	public void setHyDm(String hyDm) {
		this.hyDm = hyDm;
	}

	/**
	 * @return the zszspmDm
	 */
	public String getZszspmDm() {
		return zszspmDm;
	}

	/**
	 * @param zszspmDm the zszspmDm to set
	 */
	public void setZszspmDm(String zszspmDm) {
		this.zszspmDm = zszspmDm;
	}

	/**
	 * @return the zfrq1
	 */
	public String getZfrq1() {
		return zfrq1;
	}

	/**
	 * @param zfrq1 the zfrq1 to set
	 */
	public void setZfrq1(String zfrq1) {
		this.zfrq1 = zfrq1;
	}

	/**
	 * @return the gldksquuid
	 */
	public String getGldksquuid() {
		return gldksquuid;
	}

	/**
	 * @param gldksquuid the gldksquuid to set
	 */
	public void setGldksquuid(String gldksquuid) {
		this.gldksquuid = gldksquuid;
	}

	/**
	 * @return the zszszmDm
	 */
	public String getZszszmDm() {
		return zszszmDm;
	}

	/**
	 * @param zszszmDm the zszszmDm to set
	 */
	public void setZszszmDm(String zszszmDm) {
		this.zszszmDm = zszszmDm;
	}

	/**
	 * @return the zszsxmDm
	 */
	public String getZszsxmDm() {
		return zszsxmDm;
	}

	/**
	 * @param zszsxmDm the zszsxmDm to set
	 */
	public void setZszsxmDm(String zszsxmDm) {
		this.zszsxmDm = zszsxmDm;
	}

	/**
	 * @return the jmsfe
	 */
	public String getJmsfe() {
		return jmsfe;
	}

	/**
	 * @param jmsfe the jmsfe to set
	 */
	public void setJmsfe(String jmsfe) {
		this.jmsfe = jmsfe;
	}

	/**
	 * @return the yjsfe
	 */
	public String getYjsfe() {
		return yjsfe;
	}

	/**
	 * @param yjsfe the yjsfe to set
	 */
	public void setYjsfe(String yjsfe) {
		this.yjsfe = yjsfe;
	}

	/**
	 * @return the zszmDm
	 */
	public String getZszmDm() {
		return zszmDm;
	}

	/**
	 * @param zszmDm the zszmDm to set
	 */
	public void setZszmDm(String zszmDm) {
		this.zszmDm = zszmDm;
	}

	/**
	 * @return the jmspjguuid
	 */
	public String getJmspjguuid() {
		return jmspjguuid;
	}

	/**
	 * @param jmspjguuid the jmspjguuid to set
	 */
	public void setJmspjguuid(String jmspjguuid) {
		this.jmspjguuid = jmspjguuid;
	}

	/**
	 * @return the zsxmDm
	 */
	public String getZsxmDm() {
		return zsxmDm;
	}

	/**
	 * @param zsxmDm the zsxmDm to set
	 */
	public void setZsxmDm(String zsxmDm) {
		this.zsxmDm = zsxmDm;
	}

	/**
	 * @return the dkfplbDm
	 */
	public String getDkfplbDm() {
		return dkfplbDm;
	}

	/**
	 * @param dkfplbDm the dkfplbDm to set
	 */
	public void setDkfplbDm(String dkfplbDm) {
		this.dkfplbDm = dkfplbDm;
	}

	/**
	 * @return the dksquuid
	 */
	public String getDksquuid() {
		return dksquuid;
	}

	/**
	 * @param dksquuid the dksquuid to set
	 */
	public void setDksquuid(String dksquuid) {
		this.dksquuid = dksquuid;
	}

	/**
	 * @return the sfmxuuid
	 */
	public String getSfmxuuid() {
		return sfmxuuid;
	}

	/**
	 * @param sfmxuuid the sfmxuuid to set
	 */
	public void setSfmxuuid(String sfmxuuid) {
		this.sfmxuuid = sfmxuuid;
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
	 * @return the sskcs
	 */
	public String getSskcs() {
		return sskcs;
	}

	/**
	 * @param sskcs the sskcs to set
	 */
	public void setSskcs(String sskcs) {
		this.sskcs = sskcs;
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
	 * @return the zfrDm
	 */
	public String getZfrDm() {
		return zfrDm;
	}

	/**
	 * @param zfrDm the zfrDm to set
	 */
	public void setZfrDm(String zfrDm) {
		this.zfrDm = zfrDm;
	}

	/**
	 * @return the ybsfe
	 */
	public String getYbsfe() {
		return ybsfe;
	}

	/**
	 * @param ybsfe the ybsfe to set
	 */
	public void setYbsfe(String ybsfe) {
		this.ybsfe = ybsfe;
	}

	/**
	 * @return the ynsfe
	 */
	public String getYnsfe() {
		return ynsfe;
	}

	/**
	 * @param ynsfe the ynsfe to set
	 */
	public void setYnsfe(String ynsfe) {
		this.ynsfe = ynsfe;
	}

	/**
	 * @return the yxkcje
	 */
	public String getYxkcje() {
		return yxkcje;
	}

	/**
	 * @param yxkcje the yxkcje to set
	 */
	public void setYxkcje(String yxkcje) {
		this.yxkcje = yxkcje;
	}

	/**
	 * @return the srze
	 */
	public String getSrze() {
		return srze;
	}

	/**
	 * @param srze the srze to set
	 */
	public void setSrze(String srze) {
		this.srze = srze;
	}

	/**
	 * @return the zspmDm
	 */
	public String getZspmDm() {
		return zspmDm;
	}

	/**
	 * @param zspmDm the zspmDm to set
	 */
	public void setZspmDm(String zspmDm) {
		this.zspmDm = zspmDm;
	}

	/**
	 * @return the zfbz1
	 */
	public String getZfbz1() {
		return zfbz1;
	}

	/**
	 * @param zfbz1 the zfbz1 to set
	 */
	public void setZfbz1(String zfbz1) {
		this.zfbz1 = zfbz1;
	}

	/**
	 * @return the sfl
	 */
	public String getSfl() {
		return sfl;
	}

	/**
	 * @param sfl the sfl to set
	 */
	public void setSfl(String sfl) {
		this.sfl = sfl;
	}

	/**
	 * @return the skssqq
	 */
	public String getSkssqq() {
		return skssqq;
	}

	/**
	 * @param skssqq the skssqq to set
	 */
	public void setSkssqq(String skssqq) {
		this.skssqq = skssqq;
	}

	/**
	 * @return the jyxmDm
	 */
	public String getJyxmDm() {
		return jyxmDm;
	}

	/**
	 * @param jyxmDm the jyxmDm to set
	 */
	public void setJyxmDm(String jyxmDm) {
		this.jyxmDm = jyxmDm;
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
	 * @return the sqdhm
	 */
	public String getSqdhm() {
		return sqdhm;
	}

	/**
	 * @param sqdhm the sqdhm to set
	 */
	public void setSqdhm(String sqdhm) {
		this.sqdhm = sqdhm;
	}

	/**
	 * @return the tddjDm
	 */
	public String getTddjDm() {
		return tddjDm;
	}

	/**
	 * @param tddjDm the tddjDm to set
	 */
	public void setTddjDm(String tddjDm) {
		this.tddjDm = tddjDm;
	}

	/**
	 * @return the zjsrsfft
	 */
	public String getZjsrsfft() {
		return zjsrsfft;
	}

	/**
	 * @param zjsrsfft the zjsrsfft to set
	 */
	public void setZjsrsfft(String zjsrsfft) {
		this.zjsrsfft = zjsrsfft;
	}

	/**
	 * @return the qxq
	 */
	public String getQxq() {
		return qxq;
	}

	/**
	 * @param qxq the qxq to set
	 */
	public void setQxq(String qxq) {
		this.qxq = qxq;
	}

	/**
	 * @return the qxz
	 */
	public String getQxz() {
		return qxz;
	}

	/**
	 * @param qxz the qxz to set
	 */
	public void setQxz(String qxz) {
		this.qxz = qxz;
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
	 * @return the sfzczf
	 */
	public String getSfzczf() {
		return sfzczf;
	}

	/**
	 * @param sfzczf the sfzczf to set
	 */
	public void setSfzczf(String sfzczf) {
		this.sfzczf = sfzczf;
	}

	/**
	 * @return the jmje
	 */
	public String getJmje() {
		return jmje;
	}

	/**
	 * @param jmje the jmje to set
	 */
	public void setJmje(String jmje) {
		this.jmje = jmje;
	}

	public String getSsjmxzDm() {
		return ssjmxzDm;
	}

	public void setSsjmxzDm(String ssjmxzDm) {
		this.ssjmxzDm = ssjmxzDm;
	}

	public String getSsjmxzmc() {
		return ssjmxzmc;
	}

	public void setSsjmxzmc(String ssjmxzmc) {
		this.ssjmxzmc = ssjmxzmc;
	}
}
