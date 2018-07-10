package work.hang.dk.framework.bean.co.invoice.response;

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
@XmlType(propOrder = {"fpqqlsh", "jqbh", "fpDm", "fpHm", "kprq", "fpMw", "jym", "ewm", "bz", "returnCode", "returnMsg"})
public class ResponseCommonFpcx extends BaseBean {

	private static final long serialVersionUID = -5052746407896238806L;
	/**
	 * 发票请求流水号
	 */
	@XmlElement(name = "FPQQLSH")
	private String fpqqlsh;

	/**
	 * 税控设备编号
	 */
	@XmlElement(name = "JQBH")
	private String jqbh;//

	/**
	 * 发票代码
	 */
	@XmlElement(name = "FP_DM")
	private String fpDm;

	/**
	 * 发票号码
	 */
	@XmlElement(name = "FP_HM")
	private String fpHm;

	/**
	 * 开票日期
	 */
	@XmlElement(name = "KPRQ")
	private String kprq;

	/**
	 * 发票密文
	 */
	@XmlElement(name = "FP_MW")
	private String fpMw;

	/**
	 * 校验码
	 */
	@XmlElement(name = "JYM")
	private String jym;

	/**
	 * 二维码
	 */
	@XmlElement(name = "EWM")
	private String ewm;

	/**
	 * 备注
	 */
	@XmlElement(name = "BZ")
	private String bz;

	/**
	 * 返回代码
	 */
	@XmlElement(name = "RETURNCODE")
	private String returnCode;

	/**
	 * 返回信息
	 */
	@XmlElement(name = "RETURNMSG")
	private String returnMsg;

	@XmlAttribute(name = "class")
	private String classType = "RESPONSE_COMMON_FPCX";

	public String getFpqqlsh() {
		return fpqqlsh;
	}

	public void setFpqqlsh(String fpqqlsh) {
		this.fpqqlsh = fpqqlsh;
	}

	public String getJqbh() {
		return jqbh;
	}

	public void setJqbh(String jqbh) {
		this.jqbh = jqbh;
	}

	public String getFpDm() {
		return fpDm;
	}

	public void setFpDm(String fpDm) {
		this.fpDm = fpDm;
	}

	public String getFpHm() {
		return fpHm;
	}

	public void setFpHm(String fpHm) {
		this.fpHm = fpHm;
	}

	public String getKprq() {
		return kprq;
	}

	public void setKprq(String kprq) {
		this.kprq = kprq;
	}

	public String getFpMw() {
		return fpMw;
	}

	public void setFpMw(String fpMw) {
		this.fpMw = fpMw;
	}

	public String getJym() {
		return jym;
	}

	public void setJym(String jym) {
		this.jym = jym;
	}

	public String getEwm() {
		return ewm;
	}

	public void setEwm(String ewm) {
		this.ewm = ewm;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
}
