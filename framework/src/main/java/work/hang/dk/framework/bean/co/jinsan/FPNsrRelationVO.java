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
@XmlRootElement(name = "fpnsrrelationvo")
public class FPNsrRelationVO extends BaseBean {

	private static final long serialVersionUID = -7504294110995789480L;

	/**
	 * 登记序号
	 */
	@XmlElement(name = "djxh")
	private String djxh;

	/**
	 * 纳税人识别号
	 */
	@XmlElement(name = "nsrsbh")
	private String nsrsbh;

	/**
	 * 纳税人名称
	 */
	@XmlElement(name = "nsrmc")
	private String nsrmc;

	/**
	 * 自然人标识
	 */
	@XmlElement(name = "zrrbz")
	private String zrrbz;

	/**
	 * 地址
	 */
	@XmlElement(name = "dz")
	private String dz;

	/**
	 * 联系电话
	 */
	@XmlElement(name = "lxdh")
	private String lxdh;

	/**
	 * 行政区划
	 */
	@XmlElement(name = "scjydzxzqhszDm")
	private String scjydzxzqhszDm;

	/**
	 * 街道乡镇
	 */
	@XmlElement(name = "jdxzDm")
	private String jdxzDm;

	/**
	 * 主管税务所（科、分局）代码
	 */
	@XmlElement(name = "zgswskfjDm")
	private String zgswskfjDm;

	/**
	 * 发票代开类型
	 */
	@XmlElement(name = "kplxDm")
	private String kplxDm;

	/**
	 * 办税服务厅标识
	 */
	@XmlElement(name = "bsfwtbz")
	private String bsfwtbz;

	/**
	 * 解锁标识
	 */
	@XmlElement(name = "jsbz")
	private String jsbz;

	/**
	 * 登记注册类型
	 */
	@XmlElement(name = "djzclxDm")
	private String djzclxDm;

	/**
	 * 银行账号
	 */
	@XmlElement(name = "yhzh")
	private String yhzh;

	/**
	 * 银行营业网点名称
	 */
	@XmlElement(name = "yhyywdmc")
	private String yhyywdmc;

	/**
	 * 备注
	 */
	@XmlElement(name = "bz")
	private String bz;

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
	 * @return the nsrsbh
	 */
	public String getNsrsbh() {
		return nsrsbh;
	}

	/**
	 * @param nsrsbh the nsrsbh to set
	 */
	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	/**
	 * @return the nsrmc
	 */
	public String getNsrmc() {
		return nsrmc;
	}

	/**
	 * @param nsrmc the nsrmc to set
	 */
	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
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
	 * @return the dz
	 */
	public String getDz() {
		return dz;
	}

	/**
	 * @param dz the dz to set
	 */
	public void setDz(String dz) {
		this.dz = dz;
	}

	/**
	 * @return the lxdh
	 */
	public String getLxdh() {
		return lxdh;
	}

	/**
	 * @param lxdh the lxdh to set
	 */
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	/**
	 * @return the scjydzxzqhszDm
	 */
	public String getScjydzxzqhszDm() {
		return scjydzxzqhszDm;
	}

	/**
	 * @param scjydzxzqhszDm the scjydzxzqhszDm to set
	 */
	public void setScjydzxzqhszDm(String scjydzxzqhszDm) {
		this.scjydzxzqhszDm = scjydzxzqhszDm;
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
	 * @return the bsfwtbz
	 */
	public String getBsfwtbz() {
		return bsfwtbz;
	}

	/**
	 * @param bsfwtbz the bsfwtbz to set
	 */
	public void setBsfwtbz(String bsfwtbz) {
		this.bsfwtbz = bsfwtbz;
	}

	/**
	 * @return the jsbz
	 */
	public String getJsbz() {
		return jsbz;
	}

	/**
	 * @param jsbz the jsbz to set
	 */
	public void setJsbz(String jsbz) {
		this.jsbz = jsbz;
	}

	/**
	 * @return the djzclxDm
	 */
	public String getDjzclxDm() {
		return djzclxDm;
	}

	/**
	 * @param djzclxDm the djzclxDm to set
	 */
	public void setDjzclxDm(String djzclxDm) {
		this.djzclxDm = djzclxDm;
	}

	/**
	 * @return the yhzh
	 */
	public String getYhzh() {
		return yhzh;
	}

	/**
	 * @param yhzh the yhzh to set
	 */
	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}

	/**
	 * @return the yhyywdmc
	 */
	public String getYhyywdmc() {
		return yhyywdmc;
	}

	/**
	 * @param yhyywdmc the yhyywdmc to set
	 */
	public void setYhyywdmc(String yhyywdmc) {
		this.yhyywdmc = yhyywdmc;
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

}
