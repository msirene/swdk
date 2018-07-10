package work.hang.dk.framework.bean.co.invoice.request;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"fpqqlsh", "kplx", "bmbBbh", "zsfs", "tspz", "xsfNsrsbh", "xsfMc", "xsfDzdh", "xsfYhzh", "gmfNsrsbh",
		"gmfMc", "gmfDzdh", "gmfYhzh", "kpr", "skr", "fhr", "yfpDm", "yfpHm", "jshj", "hjje", "hjse", "bz"})
public class CommonFpkjFpt extends BaseBean {

	private static final long serialVersionUID = -4428191059278918893L;

	/**
	 * 发票请求流水号
	 */
	@XmlElement(name = "FPQQLSH")
	private String fpqqlsh;

	/**
	 * 开票类型
	 */
	@XmlElement(name = "KPLX")
	private String kplx;

	/**
	 * 编码表版本号
	 */
	@XmlElement(name = "BMB_BBH")
	private String bmbBbh;

	/**
	 * 征税方式
	 */
	@XmlElement(name = "ZSFS")
	private String zsfs;

	/**
	 * 特殊票种标识
	 */
	@XmlElement(name = "TSPZ")
	private String tspz;

	/**
	 * 销售方纳税人识别号
	 */
	@XmlElement(name = "XSF_NSRSBH")
	private String xsfNsrsbh;

	/**
	 * 销售方名称
	 */
	@XmlElement(name = "XSF_MC")
	private String xsfMc;

	/**
	 * 销售方地址、电话
	 */
	@XmlElement(name = "XSF_DZDH")
	private String xsfDzdh;

	/**
	 * 销售方银行账号
	 */
	@XmlElement(name = "XSF_YHZH")
	private String xsfYhzh;

	/**
	 * 购买方纳税人识别号
	 */
	@XmlElement(name = "GMF_NSRSBH")
	private String gmfNsrsbh;

	/**
	 * 购买方名称
	 */
	@XmlElement(name = "GMF_MC")
	private String gmfMc;

	/**
	 * 购买方地址、电话
	 */
	@XmlElement(name = "GMF_DZDH")
	private String gmfDzdh;

	/**
	 * 购买方银行账号
	 */
	@XmlElement(name = "GMF_YHZH")
	private String gmfYhzh;

	/**
	 * 开票人
	 */
	@XmlElement(name = "KPR")
	private String kpr;

	/**
	 * 收款人
	 */
	@XmlElement(name = "SKR")
	private String skr;

	/**
	 * 复核人
	 */
	@XmlElement(name = "FHR")
	private String fhr;

	/**
	 * 原发票代码
	 */
	@XmlElement(name = "YFP_DM")
	private String yfpDm;

	/**
	 * 原发票号码
	 */
	@XmlElement(name = "YFP_HM")
	private String yfpHm;

	/**
	 * 价税合计
	 */
	@XmlElement(name = "JSHJ")
	private String jshj;

	/**
	 * 合计金额
	 */
	@XmlElement(name = "HJJE")
	private String hjje;

	/**
	 * 合计税额
	 */
	@XmlElement(name = "HJSE")
	private String hjse;

	/**
	 * 备注
	 */
	@XmlElement(name = "BZ")
	private String bz;

	/**
	 * class属性
	 */
	@XmlAttribute(name = "class")
	private String classType = "COMMON_FPKJ_FPT";

	public String getFpqqlsh() {
		return fpqqlsh;
	}

	public void setFpqqlsh(String fpqqlsh) {
		this.fpqqlsh = fpqqlsh;
	}

	public String getKplx() {
		return kplx;
	}

	public void setKplx(String kplx) {
		this.kplx = kplx;
	}

	public String getXsfNsrsbh() {
		return xsfNsrsbh;
	}

	public void setXsfNsrsbh(String xsfNsrsbh) {
		this.xsfNsrsbh = xsfNsrsbh;
	}

	public String getXsfMc() {
		return xsfMc;
	}

	public void setXsfMc(String xsfMc) {
		this.xsfMc = xsfMc;
	}

	public String getXsfDzdh() {
		return xsfDzdh;
	}

	public void setXsfDzdh(String xsfDzdh) {
		this.xsfDzdh = xsfDzdh;
	}

	public String getXsfYhzh() {
		return xsfYhzh;
	}

	public void setXsfYhzh(String xsfYhzh) {
		this.xsfYhzh = xsfYhzh;
	}

	public String getGmfNsrsbh() {
		return gmfNsrsbh;
	}

	public void setGmfNsrsbh(String gmfNsrsbh) {
		this.gmfNsrsbh = gmfNsrsbh;
	}

	public String getGmfMc() {
		return gmfMc;
	}

	public void setGmfMc(String gmfMc) {
		this.gmfMc = gmfMc;
	}

	public String getGmfDzdh() {
		return gmfDzdh;
	}

	public void setGmfDzdh(String gmfDzdh) {
		this.gmfDzdh = gmfDzdh;
	}

	public String getGmfYhzh() {
		return gmfYhzh;
	}

	public void setGmfYhzh(String gmfYhzh) {
		this.gmfYhzh = gmfYhzh;
	}

	public String getKpr() {
		return kpr;
	}

	public void setKpr(String kpr) {
		this.kpr = kpr;
	}

	public String getSkr() {
		return skr;
	}

	public void setSkr(String skr) {
		this.skr = skr;
	}

	public String getFhr() {
		return fhr;
	}

	public void setFhr(String fhr) {
		this.fhr = fhr;
	}

	public String getYfpDm() {
		return yfpDm;
	}

	public void setYfpDm(String yfpDm) {
		this.yfpDm = yfpDm;
	}

	public String getYfpHm() {
		return yfpHm;
	}

	public void setYfpHm(String yfpHm) {
		this.yfpHm = yfpHm;
	}

	public String getJshj() {
		return jshj;
	}

	public void setJshj(String jshj) {
		this.jshj = jshj;
	}

	public String getHjje() {
		return hjje;
	}

	public void setHjje(String hjje) {
		this.hjje = hjje;
	}

	public String getHjse() {
		return hjse;
	}

	public void setHjse(String hjse) {
		this.hjse = hjse;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getBmbBbh() {
		return bmbBbh;
	}

	public void setBmbBbh(String bmbBbh) {
		this.bmbBbh = bmbBbh;
	}

	public String getZsfs() {
		return zsfs;
	}

	public void setZsfs(String zsfs) {
		this.zsfs = zsfs;
	}

	public String getTspz() {
		return tspz;
	}

	public void setTspz(String tspz) {
		this.tspz = tspz;
	}
}
