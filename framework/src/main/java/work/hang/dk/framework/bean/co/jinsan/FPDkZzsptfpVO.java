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
@XmlRootElement(name = "fpdkzzsptfpVO")
public class FPDkZzsptfpVO extends BaseBean {

	private static final long serialVersionUID = 4868660695488371534L;

	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 增值税发票UUID
	 */
	@XmlElement(name = "zzsfpuuid")
	private String zzsfpuuid;

	/**
	 * 代开申请UUID
	 */
	@XmlElement(name = "dksquuid")
	private String dksquuid;

	/**
	 * 销货方身份证件种类代码
	 */
	@XmlElement(name = "xhfsfzjzlDm")
	private String xhfsfzjzlDm;

	/**
	 * 销货方身份证件号码
	 */
	@XmlElement(name = "xhfsfzjhm")
	private String xhfsfzjhm;

	/**
	 * 销货方登记序号
	 */
	@XmlElement(name = "xhfdjxh")
	private String xhfdjxh;

	/**
	 * 销货方纳税人识别号
	 */
	@XmlElement(name = "xhfnsrsbh")
	private String xhfnsrsbh;

	/**
	 * 销货方纳税人名称
	 */
	@XmlElement(name = "xhfnsrmc")
	private String xhfnsrmc;

	/**
	 * 销货方开户银行代码
	 */
	@XmlElement(name = "xhfkhyhDm")
	private String xhfkhyhDm;

	/**
	 * 销货方银行营业网点名称
	 */
	@XmlElement(name = "xhfyhyywdmc")
	private String xhfyhyywdmc;

	/**
	 * 销货方银行账号
	 */
	@XmlElement(name = "xhfyhzh")
	private String xhfyhzh;
	/**
	 * 销货方联系电话
	 */
	@XmlElement(name = "xhflxdh")
	private String xhflxdh;

	/**
	 * 销货方地址
	 */
	@XmlElement(name = "xhfdz")
	private String xhfdz;

	/**
	 * 蓝字发票代码
	 */
	@XmlElement(name = "lzfpdm")
	private String lzfpdm;

	/**
	 * 蓝字发票号码
	 */
	@XmlElement(name = "lzfphm")
	private String lzfphm;

	/**
	 * 购货方登记序号
	 */
	@XmlElement(name = "ghfdjxh")
	private String ghfdjxh;

	/**
	 * 购货方纳税人识别号
	 */
	@XmlElement(name = "ghfnsrsbh")
	private String ghfnsrsbh;

	/**
	 * 购货方纳税人名称
	 */
	@XmlElement(name = "ghfnsrmc")
	private String ghfnsrmc;

	/**
	 * 购货方身份证件种类代码
	 */
	@XmlElement(name = "ghfsfzjzlDm")
	private String ghfsfzjzlDm;

	/**
	 * 购货方身份证件号码
	 */
	@XmlElement(name = "ghfsfzjhm")
	private String ghfsfzjhm;

	/**
	 * 购货方开户银行代码
	 */
	@XmlElement(name = "ghfkhyhDm")
	private String ghfkhyhDm;

	/**
	 * 购货方银行营业网点名称
	 */
	@XmlElement(name = "ghfyhyywdmc")
	private String ghfyhyywdmc;

	/**
	 * 购货方银行账号
	 */
	@XmlElement(name = "ghfyhzh")
	private String ghfyhzh;

	/**
	 * 购货方地址
	 */
	@XmlElement(name = "ghfdz")
	private String ghfdz;

	/**
	 * 购货方联系电话
	 */
	@XmlElement(name = "ghflxdh")
	private String ghflxdh;

	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 备注
	 */
	@XmlElement(name = "bz")
	private String bz;

	/**
	 * 是否录入货运信息
	 */
	@XmlElement(name = "sflrhyxx")
	private String sflrhyxx;

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
	 * @return the xhfsfzjzlDm
	 */
	public String getXhfsfzjzlDm() {
		return xhfsfzjzlDm;
	}

	/**
	 * @param xhfsfzjzlDm the xhfsfzjzlDm to set
	 */
	public void setXhfsfzjzlDm(String xhfsfzjzlDm) {
		this.xhfsfzjzlDm = xhfsfzjzlDm;
	}

	/**
	 * @return the xhfsfzjhm
	 */
	public String getXhfsfzjhm() {
		return xhfsfzjhm;
	}

	/**
	 * @param xhfsfzjhm the xhfsfzjhm to set
	 */
	public void setXhfsfzjhm(String xhfsfzjhm) {
		this.xhfsfzjhm = xhfsfzjhm;
	}

	/**
	 * @return the xhfdjxh
	 */
	public String getXhfdjxh() {
		return xhfdjxh;
	}

	/**
	 * @param xhfdjxh the xhfdjxh to set
	 */
	public void setXhfdjxh(String xhfdjxh) {
		this.xhfdjxh = xhfdjxh;
	}

	/**
	 * @return the xhfnsrsbh
	 */
	public String getXhfnsrsbh() {
		return xhfnsrsbh;
	}

	/**
	 * @param xhfnsrsbh the xhfnsrsbh to set
	 */
	public void setXhfnsrsbh(String xhfnsrsbh) {
		this.xhfnsrsbh = xhfnsrsbh;
	}

	/**
	 * @return the xhfnsrmc
	 */
	public String getXhfnsrmc() {
		return xhfnsrmc;
	}

	/**
	 * @param xhfnsrmc the xhfnsrmc to set
	 */
	public void setXhfnsrmc(String xhfnsrmc) {
		this.xhfnsrmc = xhfnsrmc;
	}

	/**
	 * @return the xhfkhyhDm
	 */
	public String getXhfkhyhDm() {
		return xhfkhyhDm;
	}

	/**
	 * @param xhfkhyhDm the xhfkhyhDm to set
	 */
	public void setXhfkhyhDm(String xhfkhyhDm) {
		this.xhfkhyhDm = xhfkhyhDm;
	}

	/**
	 * @return the xhfyhyywdmc
	 */
	public String getXhfyhyywdmc() {
		return xhfyhyywdmc;
	}

	/**
	 * @param xhfyhyywdmc the xhfyhyywdmc to set
	 */
	public void setXhfyhyywdmc(String xhfyhyywdmc) {
		this.xhfyhyywdmc = xhfyhyywdmc;
	}

	/**
	 * @return the xhfyhzh
	 */
	public String getXhfyhzh() {
		return xhfyhzh;
	}

	/**
	 * @param xhfyhzh the xhfyhzh to set
	 */
	public void setXhfyhzh(String xhfyhzh) {
		this.xhfyhzh = xhfyhzh;
	}

	/**
	 * @return the xhflxdh
	 */
	public String getXhflxdh() {
		return xhflxdh;
	}

	/**
	 * @param xhflxdh the xhflxdh to set
	 */
	public void setXhflxdh(String xhflxdh) {
		this.xhflxdh = xhflxdh;
	}

	/**
	 * @return the xhfdz
	 */
	public String getXhfdz() {
		return xhfdz;
	}

	/**
	 * @param xhfdz the xhfdz to set
	 */
	public void setXhfdz(String xhfdz) {
		this.xhfdz = xhfdz;
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
	 * @return the ghfdjxh
	 */
	public String getGhfdjxh() {
		return ghfdjxh;
	}

	/**
	 * @param ghfdjxh the ghfdjxh to set
	 */
	public void setGhfdjxh(String ghfdjxh) {
		this.ghfdjxh = ghfdjxh;
	}

	/**
	 * @return the ghfnsrsbh
	 */
	public String getGhfnsrsbh() {
		return ghfnsrsbh;
	}

	/**
	 * @param ghfnsrsbh the ghfnsrsbh to set
	 */
	public void setGhfnsrsbh(String ghfnsrsbh) {
		this.ghfnsrsbh = ghfnsrsbh;
	}

	/**
	 * @return the ghfnsrmc
	 */
	public String getGhfnsrmc() {
		return ghfnsrmc;
	}

	/**
	 * @param ghfnsrmc the ghfnsrmc to set
	 */
	public void setGhfnsrmc(String ghfnsrmc) {
		this.ghfnsrmc = ghfnsrmc;
	}

	/**
	 * @return the ghfsfzjzlDm
	 */
	public String getGhfsfzjzlDm() {
		return ghfsfzjzlDm;
	}

	/**
	 * @param ghfsfzjzlDm the ghfsfzjzlDm to set
	 */
	public void setGhfsfzjzlDm(String ghfsfzjzlDm) {
		this.ghfsfzjzlDm = ghfsfzjzlDm;
	}

	/**
	 * @return the ghfsfzjhm
	 */
	public String getGhfsfzjhm() {
		return ghfsfzjhm;
	}

	/**
	 * @param ghfsfzjhm the ghfsfzjhm to set
	 */
	public void setGhfsfzjhm(String ghfsfzjhm) {
		this.ghfsfzjhm = ghfsfzjhm;
	}

	/**
	 * @return the ghfkhyhDm
	 */
	public String getGhfkhyhDm() {
		return ghfkhyhDm;
	}

	/**
	 * @param ghfkhyhDm the ghfkhyhDm to set
	 */
	public void setGhfkhyhDm(String ghfkhyhDm) {
		this.ghfkhyhDm = ghfkhyhDm;
	}

	/**
	 * @return the ghfyhyywdmc
	 */
	public String getGhfyhyywdmc() {
		return ghfyhyywdmc;
	}

	/**
	 * @param ghfyhyywdmc the ghfyhyywdmc to set
	 */
	public void setGhfyhyywdmc(String ghfyhyywdmc) {
		this.ghfyhyywdmc = ghfyhyywdmc;
	}

	/**
	 * @return the ghfyhzh
	 */
	public String getGhfyhzh() {
		return ghfyhzh;
	}

	/**
	 * @param ghfyhzh the ghfyhzh to set
	 */
	public void setGhfyhzh(String ghfyhzh) {
		this.ghfyhzh = ghfyhzh;
	}

	/**
	 * @return the ghfdz
	 */
	public String getGhfdz() {
		return ghfdz;
	}

	/**
	 * @param ghfdz the ghfdz to set
	 */
	public void setGhfdz(String ghfdz) {
		this.ghfdz = ghfdz;
	}

	/**
	 * @return the ghflxdh
	 */
	public String getGhflxdh() {
		return ghflxdh;
	}

	/**
	 * @param ghflxdh the ghflxdh to set
	 */
	public void setGhflxdh(String ghflxdh) {
		this.ghflxdh = ghflxdh;
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
	 * @return the sflrhyxx
	 */
	public String getSflrhyxx() {
		return sflrhyxx;
	}

	/**
	 * @param sflrhyxx the sflrhyxx to set
	 */
	public void setSflrhyxx(String sflrhyxx) {
		this.sflrhyxx = sflrhyxx;
	}

}
