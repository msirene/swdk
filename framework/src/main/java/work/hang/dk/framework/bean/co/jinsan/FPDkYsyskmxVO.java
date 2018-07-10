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
@XmlRootElement(name = "fpdkysyskmxVO")
public class FPDkYsyskmxVO extends BaseBean {

	private static final long serialVersionUID = 1117718811181842003L;

	/**
	 * 完税凭证字轨
	 */
	@XmlElement(name = "wspzzg")
	private String wspzzg;

	/**
	 * 完税凭证种类代码
	 */
	@XmlElement(name = "wspzzlDm")
	private String wspzzlDm;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

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
	 * 本次扣除税额
	 */
	@XmlElement(name = "bckcse")
	private String bckcse;

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
	 * 税票UUID
	 */
	@XmlElement(name = "spuuid")
	private String spuuid;

	/**
	 * 税费明细UUID
	 */
	@XmlElement(name = "sfmxuuid")
	private String sfmxuuid;

	/**
	 * 税款属性
	 */
	@XmlElement(name = "sksx")
	private String sksx;

	/**
	 * 票面税额
	 */
	@XmlElement(name = "pmse")
	private String pmse;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 征收品目代码
	 */
	@XmlElement(name = "zspmDm")
	private String zspmDm;

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
	 * 发票代开已使用税款明细
	 */
	@XmlElement(name = "ysyskmxuuid")
	private String ysyskmxuuid;

	/**
	 * 税款所属期起
	 */
	@XmlElement(name = "skssqq")
	private String skssqq;

	/**
	 * 作废标志
	 */
	@XmlElement(name = "zfbz1")
	private String zfbz1;

	/**
	 * 完税凭证号码
	 */
	@XmlElement(name = "wspzhm")
	private String wspzhm;

	/**
	 * @return the wspzzg
	 */
	public String getWspzzg() {
		return wspzzg;
	}

	/**
	 * @param wspzzg the wspzzg to set
	 */
	public void setWspzzg(String wspzzg) {
		this.wspzzg = wspzzg;
	}

	/**
	 * @return the wspzzlDm
	 */
	public String getWspzzlDm() {
		return wspzzlDm;
	}

	/**
	 * @param wspzzlDm the wspzzlDm to set
	 */
	public void setWspzzlDm(String wspzzlDm) {
		this.wspzzlDm = wspzzlDm;
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
	 * @return the bckcse
	 */
	public String getBckcse() {
		return bckcse;
	}

	/**
	 * @param bckcse the bckcse to set
	 */
	public void setBckcse(String bckcse) {
		this.bckcse = bckcse;
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
	 * @return the spuuid
	 */
	public String getSpuuid() {
		return spuuid;
	}

	/**
	 * @param spuuid the spuuid to set
	 */
	public void setSpuuid(String spuuid) {
		this.spuuid = spuuid;
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
	 * @return the sksx
	 */
	public String getSksx() {
		return sksx;
	}

	/**
	 * @param sksx the sksx to set
	 */
	public void setSksx(String sksx) {
		this.sksx = sksx;
	}

	/**
	 * @return the pmse
	 */
	public String getPmse() {
		return pmse;
	}

	/**
	 * @param pmse the pmse to set
	 */
	public void setPmse(String pmse) {
		this.pmse = pmse;
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
	 * @return the ysyskmxuuid
	 */
	public String getYsyskmxuuid() {
		return ysyskmxuuid;
	}

	/**
	 * @param ysyskmxuuid the ysyskmxuuid to set
	 */
	public void setYsyskmxuuid(String ysyskmxuuid) {
		this.ysyskmxuuid = ysyskmxuuid;
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
	 * @return the wspzhm
	 */
	public String getWspzhm() {
		return wspzhm;
	}

	/**
	 * @param wspzhm the wspzhm to set
	 */
	public void setWspzhm(String wspzhm) {
		this.wspzhm = wspzhm;
	}


}
