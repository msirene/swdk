package work.hang.dk.framework.bean.co.invoice.request;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlType(propOrder={"fphxz","spbm","yhzcbs","lslbs","xmmc","ggxh","dw","xmsl","xmdj","xmje","sl","se"})
public class CommonFpkjXmxx extends BaseBean {

	/**
	 * 发票行性质
	 */
	@XmlElement(name = "FPHXZ")
	private String fphxz;

	/**
	 * 商品编码
	 */
	@XmlElement(name = "SPBM")
	private String spbm;

	/**
	 * 优惠政策标识
	 */
	@XmlElement(name = "YHZCBS")
	private String yhzcbs;

	/**
	 * 零税率标识
	 */
	@XmlElement(name = "LSLBS")
	private String lslbs;

	/**
	 * 项目名称
	 */
	@XmlElement(name = "XMMC")
	private String xmmc;

	/**
	 * 规格型号
	 */
	@XmlElement(name = "GGXH")
	private String ggxh;

	/**
	 * 单位
	 */
	@XmlElement(name = "DW")
	private String dw;

	/**
	 * 项目数量
	 */
	@XmlElement(name = "XMSL")
	private String xmsl;

	/**
	 * 项目单价
	 */
	@XmlElement(name = "XMDJ")
	private String xmdj;

	/**
	 * 项目金额
	 */
	@XmlElement(name = "XMJE")
	private String xmje;

	/**
	 * 税率
	 */
	@XmlElement(name = "SL")
	private String sl;

	/**
	 * 税额
	 */
	@XmlElement(name = "SE")
	private String se;

	public String getFphxz() {
		return fphxz;
	}

	public void setFphxz(String fphxz) {
		this.fphxz = fphxz;
	}

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getGgxh() {
		return ggxh;
	}

	public void setGgxh(String ggxh) {
		this.ggxh = ggxh;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getXmsl() {
		return xmsl;
	}

	public void setXmsl(String xmsl) {
		this.xmsl = xmsl;
	}

	public String getXmdj() {
		return xmdj;
	}

	public void setXmdj(String xmdj) {
		this.xmdj = xmdj;
	}

	public String getXmje() {
		return xmje;
	}

	public void setXmje(String xmje) {
		this.xmje = xmje;
	}

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getSe() {
		return se;
	}

	public void setSe(String se) {
		this.se = se;
	}

	public String getSpbm() {
		return spbm;
	}

	public void setSpbm(String spbm) {
		this.spbm = spbm;
	}

	public String getYhzcbs() {
		return yhzcbs;
	}

	public void setYhzcbs(String yhzcbs) {
		this.yhzcbs = yhzcbs;
	}

	public String getLslbs() {
		return lslbs;
	}

	public void setLslbs(String lslbs) {
		this.lslbs = lslbs;
	}
}
