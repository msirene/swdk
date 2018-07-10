package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlElement;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
public class FPFpNsrfpjcJcVO extends BaseBean {

	private static final long serialVersionUID = -1114653551780049731L;

	/**
	 * 纳税人结存UUID
	 */
	private String nsrjcuuid;

	/**
	 * 份数
	 */
	private String fs;

	/**
	 * 发票代码
	 */
	private String fpDm;

	/**
	 * 数据归属地区
	 */
	private String sjgsdq;

	/**
	 * 发票种类代码
	 */
	private String fpzlDm;

	/**
	 * 登记序号
	 */
	private String djxh;

	/**
	 * 税务机关代码
	 */
	private String swjgDm;

	/**
	 * 发票终止号码
	 */
	private String fpzzhm;

	/**
	 * 录入人代码
	 */
	private String lrrDm;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 发票起始号码
	 */
	private String fpqshm;

	/**
	 * 发票状态代码
	 */
	private String fpztDm;

	/**
	 * 修改日期
	 */
	private String xgrq;

	/**
	 * 录入日期
	 */
	private String lrrq;
	/**
	 * 发票种类名称
	 */
	private String fpzlmc;

	/**
	 * 发票代码名称
	 */
	private String fpdmmc;

	/**
	 * 票号长度
	 */
	private String phcd;

	/**
	 * 计量单位代码
	 */
	private String jldwDm;

	/**
	 * 委托代开标志
	 */
	private String wtdkbz;

	/**
	 * 定额发票标志
	 */
	private String defpbz;

	/**
	 * 专票票种代码
	 */
	private String zppzDm;

	/**
	 * 发票购票方式代码
	 */
	private String fpgpfsDm;

	/**
	 * 发票面额
	 */
	private String fpme;
	/**
	 * 每本份数
	 */
	private String mbfs;

	/**
	 * 开票金额
	 */
	private String kpje;

	/**
	 * 自开代开类型代码
	 */
	private String zkdklxDm;

	/**
	 * 发票类别代码
	 */
	private String fplbDm;

	/**
	 * 特定行业代码
	 */
	private String tdhyDm;
	/**
	 * 税控标志
	 */
	private String skbz;

	private String defpxebz;

	private String yspc;

	private String fpzg;

	/**
	 * @return the nsrjcuuid
	 */
	public String getNsrjcuuid() {
		return nsrjcuuid;
	}

	/**
	 * @return the zkdklxDm
	 */
	public String getZkdklxDm() {
		return zkdklxDm;
	}

	/**
	 * @param zkdklxDm the zkdklxDm to set
	 */
	public void setZkdklxDm(String zkdklxDm) {
		this.zkdklxDm = zkdklxDm;
	}

	/**
	 * @param nsrjcuuid the nsrjcuuid to set
	 */
	public void setNsrjcuuid(String nsrjcuuid) {
		this.nsrjcuuid = nsrjcuuid;
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

	/**
	 * @return the xgrq
	 */
	public String getXgrq() {
		return xgrq;
	}

	/**
	 * @param xgrq the xgrq to set
	 */
	public void setXgrq(String xgrq) {
		this.xgrq = xgrq;
	}

	/**
	 * @return the lrrq
	 */
	public String getLrrq() {
		return lrrq;
	}

	/**
	 * @param lrrq the lrrq to set
	 */
	public void setLrrq(String lrrq) {
		this.lrrq = lrrq;
	}

	/**
	 * @return the fpzlmc
	 */
	public String getFpzlmc() {
		return fpzlmc;
	}

	/**
	 * @param fpzlmc the fpzlmc to set
	 */
	public void setFpzlmc(String fpzlmc) {
		this.fpzlmc = fpzlmc;
	}

	/**
	 * @return the fpdmmc
	 */
	public String getFpdmmc() {
		return fpdmmc;
	}

	/**
	 * @param fpdmmc the fpdmmc to set
	 */
	public void setFpdmmc(String fpdmmc) {
		this.fpdmmc = fpdmmc;
	}

	/**
	 * @return the phcd
	 */
	public String getPhcd() {
		return phcd;
	}

	/**
	 * @param phcd the phcd to set
	 */
	public void setPhcd(String phcd) {
		this.phcd = phcd;
	}

	/**
	 * @return the jldwDm
	 */
	public String getJldwDm() {
		return jldwDm;
	}

	/**
	 * @param jldwDm the jldwDm to set
	 */
	public void setJldwDm(String jldwDm) {
		this.jldwDm = jldwDm;
	}

	/**
	 * @return the wtdkbz
	 */
	public String getWtdkbz() {
		return wtdkbz;
	}

	/**
	 * @param wtdkbz the wtdkbz to set
	 */
	public void setWtdkbz(String wtdkbz) {
		this.wtdkbz = wtdkbz;
	}

	/**
	 * @return the defpbz
	 */
	public String getDefpbz() {
		return defpbz;
	}

	/**
	 * @param defpbz the defpbz to set
	 */
	public void setDefpbz(String defpbz) {
		this.defpbz = defpbz;
	}

	/**
	 * @return the zppzDm
	 */
	public String getZppzDm() {
		return zppzDm;
	}

	/**
	 * @param zppzDm the zppzDm to set
	 */
	public void setZppzDm(String zppzDm) {
		this.zppzDm = zppzDm;
	}

	/**
	 * @return the fpgpfsDm
	 */
	public String getFpgpfsDm() {
		return fpgpfsDm;
	}

	/**
	 * @param fpgpfsDm the fpgpfsDm to set
	 */
	public void setFpgpfsDm(String fpgpfsDm) {
		this.fpgpfsDm = fpgpfsDm;
	}

	/**
	 * @return the fpme
	 */
	public String getFpme() {
		return fpme;
	}

	/**
	 * @param fpme the fpme to set
	 */
	public void setFpme(String fpme) {
		this.fpme = fpme;
	}

	/**
	 * @return the mbfs
	 */
	public String getMbfs() {
		return mbfs;
	}

	/**
	 * @param mbfs the mbfs to set
	 */
	public void setMbfs(String mbfs) {
		this.mbfs = mbfs;
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
	 * @return the fplbDm
	 */
	public String getFplbDm() {
		return fplbDm;
	}

	/**
	 * @param fplbDm the fplbDm to set
	 */
	public void setFplbDm(String fplbDm) {
		this.fplbDm = fplbDm;
	}

	/**
	 * @return the tdhyDm
	 */
	public String getTdhyDm() {
		return tdhyDm;
	}

	/**
	 * @param tdhyDm the tdhyDm to set
	 */
	public void setTdhyDm(String tdhyDm) {
		this.tdhyDm = tdhyDm;
	}

	/**
	 * @return the skbz
	 */
	public String getSkbz() {
		return skbz;
	}

	/**
	 * @param skbz the skbz to set
	 */
	public void setSkbz(String skbz) {
		this.skbz = skbz;
	}

	/**
	 * @return the defpxebz
	 */
	public String getDefpxebz() {
		return defpxebz;
	}

	/**
	 * @param defpxebz the defpxebz to set
	 */
	public void setDefpxebz(String defpxebz) {
		this.defpxebz = defpxebz;
	}

	/**
	 * @return the yspc
	 */
	public String getYspc() {
		return yspc;
	}

	/**
	 * @param yspc the yspc to set
	 */
	public void setYspc(String yspc) {
		this.yspc = yspc;
	}

	/**
	 * @return the fpzg
	 */
	public String getFpzg() {
		return fpzg;
	}

	/**
	 * @param fpzg the fpzg to set
	 */
	public void setFpzg(String fpzg) {
		this.fpzg = fpzg;
	}

}
