package work.hang.dk.framework.bean.co.jinsan;

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
@XmlRootElement(name = "fpswjgkfkcVO")
public class FPSwjgkfkcVO extends FPFpSwjgkfkcVO {

	private static final long serialVersionUID = -3269142585528137995L;

	/**
	 * 发票种类代码
	 */
	@XmlElement(name = "fpzlDm")
	private String fpzlDm;

	/**
	 * 数据归属地区
	 */
	@XmlElement(name = "sjgsdq")
	private String sjgsdq;

	/**
	 * 发票库房代码
	 */
	@XmlElement(name = "fpkfDm")
	private String fpkfDm;

	/**
	 * 发票终止号码
	 */
	@XmlElement(name = "fpzzhm")
	private String fpzzhm;

	/**
	 * 箱终止号码
	 */
	@XmlElement(name = "xzzhm")
	private String xzzhm;

	/**
	 * 箱起始号码
	 */
	@XmlElement(name = "xqshm")
	private String xqshm;

	/**
	 * 发票代码
	 */
	@XmlElement(name = "fpDm")
	private String fpDm;

	/**
	 * 发票起始号码
	 */
	@XmlElement(name = "fpqshm")
	private String fpqshm;

	/**
	 * 本数
	 */
	@XmlElement(name = "bs")
	private String bs;

	/**
	 * 箱数
	 */
	@XmlElement(name = "xs")
	private String xs;

	/**
	 * 库房库存UUID
	 */
	@XmlElement(name = "kfkcuuid")
	private String kfkcuuid;
	/**
	 * 录入人代码
	 */
	@XmlElement(name = "lrrDm")
	private String lrrDm;

	/**
	 * 发票状态代码
	 */
	@XmlElement(name = "fpztDm")
	private String fpztDm;

	/**
	 * 修改人代码
	 */
	@XmlElement(name = "xgrDm")
	private String xgrDm;

	/**
	 * 税务机关代码
	 */
	@XmlElement(name = "swjgDm")
	private String swjgDm;

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
	 * @return the xzzhm
	 */
	public String getXzzhm() {
		return xzzhm;
	}

	/**
	 * @param xzzhm the xzzhm to set
	 */
	public void setXzzhm(String xzzhm) {
		this.xzzhm = xzzhm;
	}

	/**
	 * @return the xqshm
	 */
	public String getXqshm() {
		return xqshm;
	}

	/**
	 * @param xqshm the xqshm to set
	 */
	public void setXqshm(String xqshm) {
		this.xqshm = xqshm;
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
	 * @return the bs
	 */
	public String getBs() {
		return bs;
	}

	/**
	 * @param bs the bs to set
	 */
	public void setBs(String bs) {
		this.bs = bs;
	}

	/**
	 * @return the xs
	 */
	public String getXs() {
		return xs;
	}

	/**
	 * @param xs the xs to set
	 */
	public void setXs(String xs) {
		this.xs = xs;
	}

	/**
	 * @return the kfkcuuid
	 */
	public String getKfkcuuid() {
		return kfkcuuid;
	}

	/**
	 * @param kfkcuuid the kfkcuuid to set
	 */
	public void setKfkcuuid(String kfkcuuid) {
		this.kfkcuuid = kfkcuuid;
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

}

