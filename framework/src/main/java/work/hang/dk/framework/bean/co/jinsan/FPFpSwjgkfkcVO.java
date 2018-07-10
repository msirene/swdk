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
@XmlRootElement(name = "FPFpSwjgkfkcVO")
public class FPFpSwjgkfkcVO extends BaseBean {

	private static final long serialVersionUID = 5030808609290900113L;

	/**
	 * 发票代码名称
	 */
	@XmlElement(name = "fpdmmc")
	private String fpdmm;

	/**
	 * 发票种类名称
	 */
	@XmlElement(name = "fpzlmc")
	private String fpzlmc;

	/**
	 * 换版缴销标志
	 */
	@XmlElement(name = "hbjxbz")
	private String hbjxbz;

	/**
	 * 换版缴销标志
	 */
	@XmlElement(name = "mxbfs")
	private String mxbfs;

	/**
	 * 每本份数
	 */
	@XmlElement(name = "mbfs")
	private String mbfs;

	/**
	 * 发票面额
	 */
	@XmlElement(name = "fpme")
	private String fpme;

	/**
	 * 票号长度
	 */
	@XmlElement(name = "phcd")
	private String phcd;

	/**
	 * 计量单位代码
	 */
	@XmlElement(name = "jldwDm")
	private String jldwDm;

	/**
	 * 发票进价
	 */
	@XmlElement(name = "fpjj")
	private String fpjj;

	/**
	 * 发票销价
	 */
	@XmlElement(name = "fpxj")
	private String fpxj;

	/**
	 * 库存份数
	 */
	@XmlElement(name = "kcfs")
	private String kcfs;

	/**
	 * @return the fpdmm
	 */
	public String getFpdmm() {
		return fpdmm;
	}

	/**
	 * @param fpdmm the fpdmm to set
	 */
	public void setFpdmm(String fpdmm) {
		this.fpdmm = fpdmm;
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
	 * @return the hbjxbz
	 */
	public String getHbjxbz() {
		return hbjxbz;
	}

	/**
	 * @param hbjxbz the hbjxbz to set
	 */
	public void setHbjxbz(String hbjxbz) {
		this.hbjxbz = hbjxbz;
	}

	/**
	 * @return the mxbfs
	 */
	public String getMxbfs() {
		return mxbfs;
	}

	/**
	 * @param mxbfs the mxbfs to set
	 */
	public void setMxbfs(String mxbfs) {
		this.mxbfs = mxbfs;
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
	 * @return the fpjj
	 */
	public String getFpjj() {
		return fpjj;
	}

	/**
	 * @param fpjj the fpjj to set
	 */
	public void setFpjj(String fpjj) {
		this.fpjj = fpjj;
	}

	/**
	 * @return the fpxj
	 */
	public String getFpxj() {
		return fpxj;
	}

	/**
	 * @param fpxj the fpxj to set
	 */
	public void setFpxj(String fpxj) {
		this.fpxj = fpxj;
	}

	/**
	 * @return the kcfs
	 */
	public String getKcfs() {
		return kcfs;
	}

	/**
	 * @param kcfs the kcfs to set
	 */
	public void setKcfs(String kcfs) {
		this.kcfs = kcfs;
	}

}
