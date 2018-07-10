package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlRootElement(name = "fpfpdksbdVO")
public class FPFpdksbdVO extends BaseBean {

	private static final long serialVersionUID = -1247681762526731828L;

	/**
	 * 发票代开申请VO
	 */
	@XmlElement(name="fpdkSqVO")
	private FPDkSqVO fpdkSqVO;

	/**
	 * 发票代开税费明细VO列表
	 */
	@XmlElementWrapper(name="fpdkSfmxGrid")
	@XmlElement(name="fpdkSfmxGridlb")
	private List<FPDkSfmxVO> fpdkSfmxGridlb;

	/**
	 * 发票代开已使用税款明细Grid
	 */
	@XmlElementWrapper(name="fpdkYsyskmxGrid")
	@XmlElement(name="fpdkYsyskmxGridlb")
	private List<FPDkYsyskmxVO> fpdkYsyskmxGridlb;

	/**
	 * 纳税人相关信息
	 */
	@XmlElement(name="fpnsrRelationVO")
	private FPNsrRelationVO fpnsrRelationVO;
	/**
	 * @return the fpdkSqVO
	 */
	public FPDkSqVO getFpdkSqVO() {
		return fpdkSqVO;
	}
	/**
	 * @param fpdkSqVO the fpdkSqVO to set
	 */
	public void setFpdkSqVO(FPDkSqVO fpdkSqVO) {
		this.fpdkSqVO = fpdkSqVO;
	}
	/**
	 * @return the fpdkSfmxGridlb
	 */
	public List<FPDkSfmxVO> getFpdkSfmxGridlb() {
		return fpdkSfmxGridlb;
	}
	/**
	 * @param fpdkSfmxGridlb the fpdkSfmxGridlb to set
	 */
	public void setFpdkSfmxGridlb(List<FPDkSfmxVO> fpdkSfmxGridlb) {
		this.fpdkSfmxGridlb = fpdkSfmxGridlb;
	}
	/**
	 * @return the fpdkYsyskmxGridlb
	 */
	public List<FPDkYsyskmxVO> getFpdkYsyskmxGridlb() {
		return fpdkYsyskmxGridlb;
	}
	/**
	 * @param fpdkYsyskmxGridlb the fpdkYsyskmxGridlb to set
	 */
	public void setFpdkYsyskmxGridlb(List<FPDkYsyskmxVO> fpdkYsyskmxGridlb) {
		this.fpdkYsyskmxGridlb = fpdkYsyskmxGridlb;
	}
	/**
	 * @return the fpnsrRelationVO
	 */
	public FPNsrRelationVO getFpnsrRelationVO() {
		return fpnsrRelationVO;
	}
	/**
	 * @param fpnsrRelationVO the fpnsrRelationVO to set
	 */
	public void setFpnsrRelationVO(FPNsrRelationVO fpnsrRelationVO) {
		this.fpnsrRelationVO = fpnsrRelationVO;
	}


}
