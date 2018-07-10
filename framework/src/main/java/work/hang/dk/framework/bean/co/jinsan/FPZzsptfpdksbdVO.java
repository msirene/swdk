package work.hang.dk.framework.bean.co.jinsan;

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
@XmlRootElement(name = "zzsptfpFpdksbdVO")
public class FPZzsptfpdksbdVO extends FPFpdksbdVO {

	private static final long serialVersionUID = 3567395064161694393L;

	/**
	 * 代开增值税普通发票VO
	 */
	@XmlElement(name = "fpdkZzsptfpVO")
	private FPDkZzsptfpVO fpdkZzsptfpVO;
	/**
	 * 代开增值税普通发票货劳明细VO列表
	 */
	@XmlElementWrapper(name = "fpdkZzsptfpHlmxGrid")
	@XmlElement(name = "fpdkZzsptfpHlmxGridlb")
	private List<FPDkZzsptfpHlmxVO> fpdkZzsptfpHlmxGridlb;

	/**
	 * 货物运输业增值税发票运输信息
	 */
	@XmlElement(name = "fpdkHwyszzsfpysxxVO")
	private FPDkHwyszzsfpYsxxVO fpdkHwyszzsfpysxxVO;

	/**
	 * 货物运输业增值税发票车辆信息列表
	 */
	@XmlElementWrapper(name = "fpdkHwyszzsfpclmxGrid")
	@XmlElement(name = "fpdkHwyszzsfpclmxGridlb")
	private List<FPDkHwyszzsfpClmxVO> fpdkHwyszzsfpclmxGridlb;

	/**
	 * @return the fpdkZzsptfpHlmxGridlb
	 */
	public List<FPDkZzsptfpHlmxVO> getFpdkZzsptfpHlmxGridlb() {
		return fpdkZzsptfpHlmxGridlb;
	}

	/**
	 * @param fpdkZzsptfpHlmxGridlb the fpdkZzsptfpHlmxGridlb to set
	 */
	public void setFpdkZzsptfpHlmxGridlb(List<FPDkZzsptfpHlmxVO> fpdkZzsptfpHlmxGridlb) {
		this.fpdkZzsptfpHlmxGridlb = fpdkZzsptfpHlmxGridlb;
	}

	/**
	 * @return the fpdkZzsptfpVO
	 */
	public FPDkZzsptfpVO getFpdkZzsptfpVO() {
		return fpdkZzsptfpVO;
	}

	/**
	 * @param fpdkZzsptfpVO the fpdkZzsptfpVO to set
	 */
	public void setFpdkZzsptfpVO(FPDkZzsptfpVO fpdkZzsptfpVO) {
		this.fpdkZzsptfpVO = fpdkZzsptfpVO;
	}

	/**
	 * @return the fpdkHwyszzsfpysxxVO
	 */
	public FPDkHwyszzsfpYsxxVO getFpdkHwyszzsfpysxxVO() {
		return fpdkHwyszzsfpysxxVO;
	}

	/**
	 * @param fpdkHwyszzsfpysxxVO the fpdkHwyszzsfpysxxVO to set
	 */
	public void setFpdkHwyszzsfpysxxVO(FPDkHwyszzsfpYsxxVO fpdkHwyszzsfpysxxVO) {
		this.fpdkHwyszzsfpysxxVO = fpdkHwyszzsfpysxxVO;
	}

	/**
	 * @return the fpdkHwyszzsfpclmxGridlb
	 */
	public List<FPDkHwyszzsfpClmxVO> getFpdkHwyszzsfpclmxGridlb() {
		return fpdkHwyszzsfpclmxGridlb;
	}

	/**
	 * @param fpdkHwyszzsfpclmxGridlb the fpdkHwyszzsfpclmxGridlb to set
	 */
	public void setFpdkHwyszzsfpclmxGridlb(List<FPDkHwyszzsfpClmxVO> fpdkHwyszzsfpclmxGridlb) {
		this.fpdkHwyszzsfpclmxGridlb = fpdkHwyszzsfpclmxGridlb;
	}

}
