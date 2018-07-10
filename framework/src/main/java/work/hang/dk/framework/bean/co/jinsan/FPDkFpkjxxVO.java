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
@XmlRootElement(name = "FPDkFpkjxxVO")
public class FPDkFpkjxxVO extends BaseBean {

	private static final long serialVersionUID = -2048733869147855871L;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name="sjgsdq")
	private String sjgsdq;

	/**
	 * 作废申请日期
	 */
	@XmlElement(name="zfsqrq")
	private String zfsqrq;

	/**
	 * 发票号码
	 */
	@XmlElement(name="fphm")
	private String fphm;

	/**
	 * 发票种类代码
	 */
	@XmlElement(name="fpzlDm")

	/**
	 * 数据归属地区
	 */
	private String fpzlDm;

	/**
	 * 登记序号
	 */
	@XmlElement(name="djxh")
	private String djxh;

	/**
	 * 开票人代码
	 */
	@XmlElement(name="kprDm")
	private String kprDm;

	/**
	 * 发票库房代码
	 */
	@XmlElement(name="fpkfDm")
	private String fpkfDm;

	/**
	 * 开票金额
	 */
	@XmlElement(name="kpje")
	private String kpje;

	/**
	 * 作废日期
	 */
	@XmlElement(name="zfrq1")
	private String zfrq1;

	/**
	 * 备注
	 */
	@XmlElement(name="bz")
	private String bz;

	/**
	 * 蓝字发票代码
	 */
	@XmlElement(name="lzfpdm")
	private String lzfpdm;

	/**
	 * 发票代码
	 */
	@XmlElement(name="fpDm")
	private String fpDm;

	/**
	 * 开具税务机关代码
	 */
	@XmlElement(name="kjswjgDm")
	private String kjswjgDm;

	/**
	 * 代开申请UUID
	 */
	@XmlElement(name="dksquuid")
	private String dksquuid;

	/**
	 * 作废申请人
	 */
	@XmlElement(name="zfsqr")
	private String zfsqr;

	/**
	 * 蓝字发票号码
	 */
	@XmlElement(name="lzfphm")
	private String lzfphm;

	/**
	 * 录入人代码
	 */
	@XmlElement(name="lrrDm")
	private String lrrDm;

	/**
	 * 作废原因
	 */
	@XmlElement(name="zfyy")
	private String zfyy;

	/**
	 * 修改人代码
	 */
	@XmlElement(name="xgrDm")
	private String xgrDm;

	/**
	 * 作废人代码
	 */
	@XmlElement(name="zfrDm")
	private String zfrDm;

	/**
	 * 开具日期
	 */
	@XmlElement(name="kjrq")
	private String kjrq;

	/**
	 * 发票开具信息UUID
	 */
	@XmlElement(name="fpkjxxuuid")
	private String fpkjxxuuid;

	/**
	 * 作废标志
	 */
	@XmlElement(name="zfbz1")
	private String zfbz1;

	/**
	 * 特殊纳税人登记序号
	 */
	@XmlElement(name="tsnsrdjxh")
	private String tsnsrdjxh;

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
	 * @return the zfsqrq
	 */
	public String getZfsqrq() {
		return zfsqrq;
	}
	/**
	 * @param zfsqrq the zfsqrq to set
	 */
	public void setZfsqrq(String zfsqrq) {
		this.zfsqrq = zfsqrq;
	}
	/**
	 * @return the fphm
	 */
	public String getFphm() {
		return fphm;
	}
	/**
	 * @param fphm the fphm to set
	 */
	public void setFphm(String fphm) {
		this.fphm = fphm;
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
	 * @return the kprDm
	 */
	public String getKprDm() {
		return kprDm;
	}
	/**
	 * @param kprDm the kprDm to set
	 */
	public void setKprDm(String kprDm) {
		this.kprDm = kprDm;
	}
	/**
	 * @return the fpkfDm
	 */
	public String getFpkfDm() {
		return fpkfDm;
	}
	/**
	 * @param fpkfDm the fpkfDm to set
	 */
	public void setFpkfDm(String fpkfDm) {
		this.fpkfDm = fpkfDm;
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
	 * @return the lzfpdm
	 */
	public String getLzfpdm() {
		return lzfpdm;
	}
	/**
	 * @param lzfpdm the lzfpdm to set
	 */
	public void setLzfpdm(String lzfpdm) {
		this.lzfpdm = lzfpdm;
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
	 * @return the kjswjgDm
	 */
	public String getKjswjgDm() {
		return kjswjgDm;
	}
	/**
	 * @param kjswjgDm the kjswjgDm to set
	 */
	public void setKjswjgDm(String kjswjgDm) {
		this.kjswjgDm = kjswjgDm;
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
	 * @return the zfsqr
	 */
	public String getZfsqr() {
		return zfsqr;
	}
	/**
	 * @param zfsqr the zfsqr to set
	 */
	public void setZfsqr(String zfsqr) {
		this.zfsqr = zfsqr;
	}
	/**
	 * @return the lzfphm
	 */
	public String getLzfphm() {
		return lzfphm;
	}
	/**
	 * @param lzfphm the lzfphm to set
	 */
	public void setLzfphm(String lzfphm) {
		this.lzfphm = lzfphm;
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
	 * @return the zfyy
	 */
	public String getZfyy() {
		return zfyy;
	}
	/**
	 * @param zfyy the zfyy to set
	 */
	public void setZfyy(String zfyy) {
		this.zfyy = zfyy;
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
	 * @return the kjrq
	 */
	public String getKjrq() {
		return kjrq;
	}
	/**
	 * @param kjrq the kjrq to set
	 */
	public void setKjrq(String kjrq) {
		this.kjrq = kjrq;
	}
	/**
	 * @return the fpkjxxuuid
	 */
	public String getFpkjxxuuid() {
		return fpkjxxuuid;
	}
	/**
	 * @param fpkjxxuuid the fpkjxxuuid to set
	 */
	public void setFpkjxxuuid(String fpkjxxuuid) {
		this.fpkjxxuuid = fpkjxxuuid;
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
	 * @return the tsnsrdjxh
	 */
	public String getTsnsrdjxh() {
		return tsnsrdjxh;
	}
	/**
	 * @param tsnsrdjxh the tsnsrdjxh to set
	 */
	public void setTsnsrdjxh(String tsnsrdjxh) {
		this.tsnsrdjxh = tsnsrdjxh;
	}


}
