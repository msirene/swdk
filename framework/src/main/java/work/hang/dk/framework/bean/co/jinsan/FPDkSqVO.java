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
@XmlRootElement(name = "fpdksqVO")
public class FPDkSqVO extends BaseBean {

	private static final long serialVersionUID = -4086261579994367535L;

	/**
	 * 主管税务所（科、分局）代码
	 */
	@XmlElement(name = "zgswskfjDm")
	private String zgswskfjDm;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 开具标志
	 */
	@XmlElement(name = "kjbz")
	private String kjbz;

	/**
	 * 登记序号
	 */
	@XmlElement(name = "djxh")
	private String djxh;

	/**
	 * 行业代码
	 */
	@XmlElement(name = "hyDm")
	private String hyDm;

	/**
	 * 街道乡镇代码
	 */
	@XmlElement(name = "jdxzDm")
	private String jdxzDm;

	/**
	 * 凭证序号
	 */
	@XmlElement(name = "pzxh")
	private String pzxh;

	/**
	 * 开票金额
	 */
	@XmlElement(name = "kpje")
	private String kpje;

	/**
	 * 减免原因
	 */
	@XmlElement(name = "jmyy")
	private String jmyy;

	/**
	 * 开票类型代码
	 */
	@XmlElement(name = "kplxDm")
	private String kplxDm;

	/**
	 * 作废日期
	 */
	@XmlElement(name = "zfrq1")
	private String zfrq1;

	/**
	 * 申请人姓名
	 */
	@XmlElement(name = "sqrxm")
	private String sqrxm;

	/**
	 * 流程实例ID
	 */
	@XmlElement(name = "lcslid")
	private String lcslid;

	/**
	 * 申请单号码||发票代开申请单号码
	 */
	@XmlElement(name = "sqdhm")
	private String sqdhm;

	/**
	 * 申请日期
	 */
	@XmlElement(name = "sqrq")
	private String sqrq;

	/**
	 * 代开申请UUID
	 */
	@XmlElement(name = "dksquuid")
	private String dksquuid;

	/**
	 * 代开发票类别代码
	 */
	@XmlElement(name = "dkfplbDm")
	private String dkfplbDm;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 受理税务机关代码
	 */
	@XmlElement(name = "slswjgDm")
	private String slswjgDm;

	/**
	 * 行政区划数字代码
	 */
	@XmlElement(name = "xzqhszDm")
	private String xzqhszDm;

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
	 * 减免税标志
	 */
	@XmlElement(name = "jmsbz")
	private String jmsbz;

	/**
	 * 应补税费额
	 */
	@XmlElement(name = "ybsfe")
	private String ybsfe;

	/**
	 * 代开申请金额
	 */
	@XmlElement(name = "dksqje")
	private String dksqje;

	/**
	 * 自然人标志
	 */
	@XmlElement(name = "zrrbz")
	private String zrrbz;

	/**
	 * 作废标志
	 */
	@XmlElement(name = "zfbz1")
	private String zfbz1;

	/**
	 * 受理日期
	 */
	@XmlElement(name = "slrq")
	private String slrq;

	/**
	 * 受理人代码
	 */
	@XmlElement(name = "slrDm")
	private String slrDm;
	/**
	 * 减免税类型代码
	 */
	@XmlElement(name = "jmslxDm")
	private String jmslxDm;

	/**
	 * 房源编号
	 */
	@XmlElement(name = "fybh")
	private String fybh;

	/**
	 * 发票类型（01正常代开02差额征税代开）
	 */
	@XmlElement(name = "fplxDm")
	private String fplxDm;

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
	 * 是否出租住房
	 */
	@XmlElement(name = "sfzczf")
	private String sfzczf;

	/**
	 * 合同编号
	 */
	@XmlElement(name = "htbh")
	private String htbh;

	/**
	 * 房产交易UUID
	 */
	@XmlElement(name = "fcjycjxxuuid")
	private String fcjycjxxuuid;

	/**
	 * 申报UUID
	 */
	@XmlElement(name = "sbuuid")
	private String sbuuid;

	/**
	 * 汇总代开类型代码
	 */
	@XmlElement(name = "hzdklxDm")
	private String hzdklxDm;

	/**
	 * 纳税期限代码
	 */
	@XmlElement(name = "nsqxDm")
	private String nsqxDm;

	/**
	 * 项目名称
	 */
	@XmlElement(name = "xmmc")
	private String xmmc;

	/**
	 * 房屋坐落地址
	 */
	@XmlElement(name = "fwzldz")
	private String fwzldz;

	/**
	 * 国税代开申请uuid
	 */
	@XmlElement(name = "gsdksquuid")
	private String gsdksquuid;

	/**
	 * @return the zgswskfjDm
	 */
	public String getZgswskfjDm() {
		return zgswskfjDm;
	}

	/**
	 * @param zgswskfjDm the zgswskfjDm to set
	 */
	public void setZgswskfjDm(String zgswskfjDm) {
		this.zgswskfjDm = zgswskfjDm;
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
	 * @return the kjbz
	 */
	public String getKjbz() {
		return kjbz;
	}

	/**
	 * @param kjbz the kjbz to set
	 */
	public void setKjbz(String kjbz) {
		this.kjbz = kjbz;
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
	 * @return the jdxzDm
	 */
	public String getJdxzDm() {
		return jdxzDm;
	}

	/**
	 * @param jdxzDm the jdxzDm to set
	 */
	public void setJdxzDm(String jdxzDm) {
		this.jdxzDm = jdxzDm;
	}

	/**
	 * @return the pzxh
	 */
	public String getPzxh() {
		return pzxh;
	}

	/**
	 * @param pzxh the pzxh to set
	 */
	public void setPzxh(String pzxh) {
		this.pzxh = pzxh;
	}

	/**
	 * @return the kpje
	 */
	public String getKpje() {
		return kpje;
	}

	/**
	 * @param kpje the kpje to set
	 */
	public void setKpje(String kpje) {
		this.kpje = kpje;
	}

	/**
	 * @return the jmyy
	 */
	public String getJmyy() {
		return jmyy;
	}

	/**
	 * @param jmyy the jmyy to set
	 */
	public void setJmyy(String jmyy) {
		this.jmyy = jmyy;
	}

	/**
	 * @return the kplxDm
	 */
	public String getKplxDm() {
		return kplxDm;
	}

	/**
	 * @param kplxDm the kplxDm to set
	 */
	public void setKplxDm(String kplxDm) {
		this.kplxDm = kplxDm;
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
	 * @return the sqrxm
	 */
	public String getSqrxm() {
		return sqrxm;
	}

	/**
	 * @param sqrxm the sqrxm to set
	 */
	public void setSqrxm(String sqrxm) {
		this.sqrxm = sqrxm;
	}

	/**
	 * @return the lcslid
	 */
	public String getLcslid() {
		return lcslid;
	}

	/**
	 * @param lcslid the lcslid to set
	 */
	public void setLcslid(String lcslid) {
		this.lcslid = lcslid;
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
	 * @return the sqrq
	 */
	public String getSqrq() {
		return sqrq;
	}

	/**
	 * @param sqrq the sqrq to set
	 */
	public void setSqrq(String sqrq) {
		this.sqrq = sqrq;
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
	 * @return the slswjgDm
	 */
	public String getSlswjgDm() {
		return slswjgDm;
	}

	/**
	 * @param slswjgDm the slswjgDm to set
	 */
	public void setSlswjgDm(String slswjgDm) {
		this.slswjgDm = slswjgDm;
	}

	/**
	 * @return the xzqhszDm
	 */
	public String getXzqhszDm() {
		return xzqhszDm;
	}

	/**
	 * @param xzqhszDm the xzqhszDm to set
	 */
	public void setXzqhszDm(String xzqhszDm) {
		this.xzqhszDm = xzqhszDm;
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
	 * @return the jmsbz
	 */
	public String getJmsbz() {
		return jmsbz;
	}

	/**
	 * @param jmsbz the jmsbz to set
	 */
	public void setJmsbz(String jmsbz) {
		this.jmsbz = jmsbz;
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
	 * @return the dksqje
	 */
	public String getDksqje() {
		return dksqje;
	}

	/**
	 * @param dksqje the dksqje to set
	 */
	public void setDksqje(String dksqje) {
		this.dksqje = dksqje;
	}

	/**
	 * @return the zrrbz
	 */
	public String getZrrbz() {
		return zrrbz;
	}

	/**
	 * @param zrrbz the zrrbz to set
	 */
	public void setZrrbz(String zrrbz) {
		this.zrrbz = zrrbz;
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
	 * @return the slrq
	 */
	public String getSlrq() {
		return slrq;
	}

	/**
	 * @param slrq the slrq to set
	 */
	public void setSlrq(String slrq) {
		this.slrq = slrq;
	}

	/**
	 * @return the slrDm
	 */
	public String getSlrDm() {
		return slrDm;
	}

	/**
	 * @param slrDm the slrDm to set
	 */
	public void setSlrDm(String slrDm) {
		this.slrDm = slrDm;
	}

	/**
	 * @return the jmslxDm
	 */
	public String getJmslxDm() {
		return jmslxDm;
	}

	/**
	 * @param jmslxDm the jmslxDm to set
	 */
	public void setJmslxDm(String jmslxDm) {
		this.jmslxDm = jmslxDm;
	}

	/**
	 * @return the fybh
	 */
	public String getFybh() {
		return fybh;
	}

	/**
	 * @param fybh the fybh to set
	 */
	public void setFybh(String fybh) {
		this.fybh = fybh;
	}

	/**
	 * @return the fplxDm
	 */
	public String getFplxDm() {
		return fplxDm;
	}

	/**
	 * @param fplxDm the fplxDm to set
	 */
	public void setFplxDm(String fplxDm) {
		this.fplxDm = fplxDm;
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
	 * @return the htbh
	 */
	public String getHtbh() {
		return htbh;
	}

	/**
	 * @param htbh the htbh to set
	 */
	public void setHtbh(String htbh) {
		this.htbh = htbh;
	}

	/**
	 * @return the fcjycjxxuuid
	 */
	public String getFcjycjxxuuid() {
		return fcjycjxxuuid;
	}

	/**
	 * @param fcjycjxxuuid the fcjycjxxuuid to set
	 */
	public void setFcjycjxxuuid(String fcjycjxxuuid) {
		this.fcjycjxxuuid = fcjycjxxuuid;
	}

	/**
	 * @return the sbuuid
	 */
	public String getSbuuid() {
		return sbuuid;
	}

	/**
	 * @param sbuuid the sbuuid to set
	 */
	public void setSbuuid(String sbuuid) {
		this.sbuuid = sbuuid;
	}

	/**
	 * @return the hzdklxDm
	 */
	public String getHzdklxDm() {
		return hzdklxDm;
	}

	/**
	 * @param hzdklxDm the hzdklxDm to set
	 */
	public void setHzdklxDm(String hzdklxDm) {
		this.hzdklxDm = hzdklxDm;
	}

	/**
	 * @return the nsqxDm
	 */
	public String getNsqxDm() {
		return nsqxDm;
	}

	/**
	 * @param nsqxDm the nsqxDm to set
	 */
	public void setNsqxDm(String nsqxDm) {
		this.nsqxDm = nsqxDm;
	}

	/**
	 * @return the xmmc
	 */
	public String getXmmc() {
		return xmmc;
	}

	/**
	 * @param xmmc the xmmc to set
	 */
	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	/**
	 * @return the fwzldz
	 */
	public String getFwzldz() {
		return fwzldz;
	}

	/**
	 * @param fwzldz the fwzldz to set
	 */
	public void setFwzldz(String fwzldz) {
		this.fwzldz = fwzldz;
	}

	/**
	 * @return the gsdksquuid
	 */
	public String getGsdksquuid() {
		return gsdksquuid;
	}

	/**
	 * @param gsdksquuid the gsdksquuid to set
	 */
	public void setGsdksquuid(String gsdksquuid) {
		this.gsdksquuid = gsdksquuid;
	}

}
