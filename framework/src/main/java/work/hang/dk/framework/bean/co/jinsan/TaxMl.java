package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "taxML")
public class TaxMl extends BaseBean {

	private static final long serialVersionUID = 6401967917990973218L;

	@XmlAttribute(name = "xmlmc")
	private String xmlmc;

	@XmlAttribute(name = "xmlbh")
	private String xmlbh;

	@XmlAttribute(name = "bbh")
	private String bbh;

	@XmlAttribute(name = "xmlns")
	private String xmlns;

	/**
	 * 身份证件号码
	 */
	@XmlElement(name = "sfzjhm")
	private String sfzjhm;
	/**
	 * 登记序号
	 */
	@XmlElement(name = "djxh")
	private String djxh;
	/**
	 * 法定代表人身份证件类型代码
	 */
	@XmlElement(name = "fddbrsfzjlxDm")
	private String fddbrsfzjlxDm;
	/**
	 * 法定代表人身份证号码
	 */
	@XmlElement(name = "fddbrsfzjhm")
	private String fddbrsfzjhm;
	/**
	 * 税务机关代码
	 */
	@XmlElement(name = "swjgDm")
	private String swjgDm;
	/**
	 * 流程实例id
	 */
	@XmlElement(name = "lcslid")
	private String lcslid;
	/**
	 * 代开申请uuid
	 */
	@XmlElement(name = "dksquuid")
	private String dksquuid;
	/**
	 * 发票代开申请VO
	 */
	@XmlElement(name = "fpdksqVO")
	private FPDkSqVO fpdksqVO;
	/**
	 * 开具发票信息VO
	 */
	@XmlElement(name = "fpdkKjfpxxVO")
	private FPDkFpkjxxVO fpdkKjfpxxVO;
	/**
	 * 开具发票信息VO
	 */
	@XmlElement(name = "fpkjxxVO")
	private FPDkFpkjxxVO fpkjxxVO;
	/**
	 * 代开发票类别
	 */
	@XmlElement(name = "dkfplbDm")
	private String dkfplbDm;
	/**
	 * 税务机关库房库存VO
	 */
	@XmlElement(name = "swjgkfkcVO")
	private FPFpSwjgkfkcVO swjgkfkcVO;

	@XmlElement(name = "kcxxVO")
	private FPSwjgkfkcVO kcxxVO;
	/**
	 * 纳税人结存VO列表
	 */
	@XmlElementWrapper(name = "nsrjcVOGrid")
	@XmlElement(name = "nsrjcVOGridlb")
	private List<FPNsrfpjcVO> nsrjcVOGrid;
	/**
	 * 税款所属期起
	 */
	@XmlElement(name = "skssqq")
	private String skssqq;
	/**
	 * 税款所属期止
	 */
	@XmlElement(name = "skssqz")
	private String skssqz;
	/**
	 * 税款所属期起
	 */
	@XmlElement(name = "ssqq")
	private String ssqq;
	/**
	 * 税款所属期止
	 */
	@XmlElement(name = "ssqz")
	private String ssqz;
	/**
	 * 征收项目代码
	 */
	@XmlElement(name = "zsxmDm")
	private String zsxmDm;
	/**
	 * 征收品目代码
	 */
	@XmlElement(name = "zspmDm")
	private String zspmDm;
	/**
	 * 主管税务所（科、分局）代码
	 */
	@XmlElement(name = "zgswskfjDm")
	private String zgswskfjDm;
	/**
	 * 征收代理方式代码
	 */
	@XmlElement(name = "zsdlfsDm")
	private String zsdlfsDm;
	/**
	 * 增值税普通发票代开申报单
	 */
	@XmlElement(name = "zzsptfpFpdksbdVO")
	private FPZzsptfpdksbdVO zzsptfpFpdksbdVO;
	/**
	 * 征收代理方x式代码
	 */
	@XmlElement(name = "tdzsbmbz")
	private String tdzsbmbz;

	/**
	 * @return the zzsptfpFpdksbdVO
	 */
	public FPZzsptfpdksbdVO getZzsptfpFpdksbdVO() {
		return zzsptfpFpdksbdVO;
	}

	/**
	 * @param zzsptfpFpdksbdVO the zzsptfpFpdksbdVO to set
	 */
	public void setZzsptfpFpdksbdVO(FPZzsptfpdksbdVO zzsptfpFpdksbdVO) {
		this.zzsptfpFpdksbdVO = zzsptfpFpdksbdVO;
	}

	/**
	 * @return the zsdlfsDm
	 */
	public String getZsdlfsDm() {
		return zsdlfsDm;
	}

	/**
	 * @param zsdlfsDm the zsdlfsDm to set
	 */
	public void setZsdlfsDm(String zsdlfsDm) {
		this.zsdlfsDm = zsdlfsDm;
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
	 * @return the ssqq
	 */
	public String getSsqq() {
		return ssqq;
	}

	/**
	 * @param ssqq the ssqq to set
	 */
	public void setSsqq(String ssqq) {
		this.ssqq = ssqq;
	}

	/**
	 * @return the ssqz
	 */
	public String getSsqz() {
		return ssqz;
	}

	/**
	 * @param ssqz the ssqz to set
	 */
	public void setSsqz(String ssqz) {
		this.ssqz = ssqz;
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
	 * @return the kcxxVO
	 */
	public FPSwjgkfkcVO getKcxxVO() {
		return kcxxVO;
	}

	/**
	 * @param kcxxVO the kcxxVO to set
	 */
	public void setKcxxVO(FPSwjgkfkcVO kcxxVO) {
		this.kcxxVO = kcxxVO;
	}

	/**
	 * @return the fpkjxxVO
	 */
	public FPDkFpkjxxVO getFpkjxxVO() {
		return fpkjxxVO;
	}

	/**
	 * @param fpkjxxVO the fpkjxxVO to set
	 */
	public void setFpkjxxVO(FPDkFpkjxxVO fpkjxxVO) {
		this.fpkjxxVO = fpkjxxVO;
	}

	/**
	 * @return the fpdksqVO
	 */
	public FPDkSqVO getFpdksqVO() {
		return fpdksqVO;
	}

	/**
	 * @param fpdksqVO the fpdksqVO to set
	 */
	public void setFpdksqVO(FPDkSqVO fpdksqVO) {
		this.fpdksqVO = fpdksqVO;
	}

	/**
	 * @return the fpdkKjfpxxVO
	 */
	public FPDkFpkjxxVO getFpdkKjfpxxVO() {
		return fpdkKjfpxxVO;
	}

	/**
	 * @param fpdkKjfpxxVO the fpdkKjfpxxVO to set
	 */
	public void setFpdkKjfpxxVO(FPDkFpkjxxVO fpdkKjfpxxVO) {
		this.fpdkKjfpxxVO = fpdkKjfpxxVO;
	}

	/**
	 * @return the swjgkfkcVO
	 */
	public FPFpSwjgkfkcVO getSwjgkfkcVO() {
		return swjgkfkcVO;
	}

	/**
	 * @param swjgkfkcVO the swjgkfkcVO to set
	 */
	public void setSwjgkfkcVO(FPFpSwjgkfkcVO swjgkfkcVO) {
		this.swjgkfkcVO = swjgkfkcVO;
	}

	/**
	 * @return the nsrjcVOGrid
	 */
	public List<FPNsrfpjcVO> getNsrjcVOGrid() {
		return nsrjcVOGrid;
	}

	/**
	 * @param nsrjcVOGrid the nsrjcVOGrid to set
	 */
	public void setNsrjcVOGrid(List<FPNsrfpjcVO> nsrjcVOGrid) {
		this.nsrjcVOGrid = nsrjcVOGrid;
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
	 * @return the lcslid
	 */
	public String getLcslid() {
		return lcslid;
	}

	/**
	 * @param lcslid the lcslid to set
	 */
	public void setLcslid(String lcslid) {
		this.lcslid = lcslid;
	}

	/**
	 * @return the fddbrsfzjlxDm
	 */
	public String getFddbrsfzjlxDm() {
		return fddbrsfzjlxDm;
	}

	/**
	 * @param fddbrsfzjlxDm the fddbrsfzjlxDm to set
	 */
	public void setFddbrsfzjlxDm(String fddbrsfzjlxDm) {
		this.fddbrsfzjlxDm = fddbrsfzjlxDm;
	}

	/**
	 * @return the fddbrsfzjhm
	 */
	public String getFddbrsfzjhm() {
		return fddbrsfzjhm;
	}

	/**
	 * @param fddbrsfzjhm the fddbrsfzjhm to set
	 */
	public void setFddbrsfzjhm(String fddbrsfzjhm) {
		this.fddbrsfzjhm = fddbrsfzjhm;
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
	 * @return the xmlns
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * @param xmlns the xmlns to set
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * @return the xmlmc
	 */
	public String getXmlmc() {
		return xmlmc;
	}

	/**
	 * @param xmlmc the xmlmc to set
	 */
	public void setXmlmc(String xmlmc) {
		this.xmlmc = xmlmc;
	}

	/**
	 * @return the xmlbh
	 */
	public String getXmlbh() {
		return xmlbh;
	}

	/**
	 * @param xmlbh the xmlbh to set
	 */
	public void setXmlbh(String xmlbh) {
		this.xmlbh = xmlbh;
	}

	/**
	 * @return the bbh
	 */
	public String getBbh() {
		return bbh;
	}

	/**
	 * @param bbh the bbh to set
	 */
	public void setBbh(String bbh) {
		this.bbh = bbh;
	}

	/**
	 * @return the sfzjhm
	 */
	public String getSfzjhm() {
		return sfzjhm;
	}

	/**
	 * @param sfzjhm the sfzjhm to set
	 */
	public void setSfzjhm(String sfzjhm) {
		this.sfzjhm = sfzjhm;
	}

	public String getTdzsbmbz() {
		return tdzsbmbz;
	}

	public void setTdzsbmbz(String tdzsbmbz) {
		this.tdzsbmbz = tdzsbmbz;
	}
}
