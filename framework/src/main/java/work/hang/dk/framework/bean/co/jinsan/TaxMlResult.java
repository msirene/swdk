package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

import java.math.BigDecimal;
import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
public class TaxMlResult extends BaseBean {

	private static final long serialVersionUID = -3234723061544661358L;

	private String zrrhybz;

	/**
	 * 纳税人状态代码
	 */
	private String nsrztDm;

	/**
	 * 起征点金额
	 */
	private Double qzdje;

	/**
	 * 已申报金额
	 */
	private Double ysbje;

	/**
	 * 纳税人税务登记信息
	 */
	private List<DjSwdjbxxVO> djSwdjbxxVOList;

	/**
	 * 发票票种核定信息
	 */
	private List<FPPzhdxxVO> fppzhdxxVOList;

	/**
	 * 纳税人资格信息
	 */
	private NsrzgxxVO nsrzgxxVO;

	/**
	 * 税（费）种认定信息表
	 */
	private List<RDSfzrdxxbVO> rdsfzrdxxbVOlist;

	/**
	 * 代开申请UUID
	 */
	private String dksquuid;

	/**
	 * 发票纳税人结存信息列表
	 */
	private List<FPFpNsrfpjcJcVO> fpfpnsrfpjcjcvoList;

	/**
	 * 发票代开申请列表
	 */
	private List<FPDkSqVO> fpdksqvoList;

	/**
	 * 发票代开申请税费明细列表
	 */
	private List<FPDkSfmxVO> fpdksfmxvoList;

	/**
	 * 返回编码
	 */
	private String returnCode;
	/**
	 * 返回消息
	 */
	private String returnMessage;
	/**
	 * 已使用的额度
	 */
	private BigDecimal usedAmount;

	public List<FPDkSfmxVO> getFpdksfmxvoList() {
		return fpdksfmxvoList;
	}

	public void setFpdksfmxvoList(List<FPDkSfmxVO> fpdksfmxvoList) {
		this.fpdksfmxvoList = fpdksfmxvoList;
	}

	public List<FPDkSqVO> getFpdksqvoList() {
		return fpdksqvoList;
	}

	public void setFpdksqvoList(List<FPDkSqVO> fpdksqvoList) {
		this.fpdksqvoList = fpdksqvoList;
	}

	/**
	 * @return the fpfpnsrfpjcjcvoList
	 */
	public List<FPFpNsrfpjcJcVO> getFpfpnsrfpjcjcvoList() {
		return fpfpnsrfpjcjcvoList;
	}

	/**
	 * @param fpfpnsrfpjcjcvoList the fpfpnsrfpjcjcvoList to set
	 */
	public void setFpfpnsrfpjcjcvoList(List<FPFpNsrfpjcJcVO> fpfpnsrfpjcjcvoList) {
		this.fpfpnsrfpjcjcvoList = fpfpnsrfpjcjcvoList;
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
	 * @return the rdsfzrdxxbVOlist
	 */
	public List<RDSfzrdxxbVO> getRdsfzrdxxbVOlist() {
		return rdsfzrdxxbVOlist;
	}

	/**
	 * @param rdsfzrdxxbVOlist the rdsfzrdxxbVOlist to set
	 */
	public void setRdsfzrdxxbVOlist(List<RDSfzrdxxbVO> rdsfzrdxxbVOlist) {
		this.rdsfzrdxxbVOlist = rdsfzrdxxbVOlist;
	}

	/**
	 * @return the fppzhdxxVOList
	 */
	public List<FPPzhdxxVO> getFppzhdxxVOList() {
		return fppzhdxxVOList;
	}

	/**
	 * @param fppzhdxxVOList the fppzhdxxVOList to set
	 */
	public void setFppzhdxxVOList(List<FPPzhdxxVO> fppzhdxxVOList) {
		this.fppzhdxxVOList = fppzhdxxVOList;
	}

	/**
	 * @return the nsrzgxxVO
	 */
	public NsrzgxxVO getNsrzgxxVO() {
		return nsrzgxxVO;
	}

	/**
	 * @param nsrzgxxVO the nsrzgxxVO to set
	 */
	public void setNsrzgxxVO(NsrzgxxVO nsrzgxxVO) {
		this.nsrzgxxVO = nsrzgxxVO;
	}

	/**
	 * @return the qzdje
	 */
	public Double getQzdje() {
		return qzdje;
	}

	/**
	 * @param qzdje the qzdje to set
	 */
	public void setQzdje(Double qzdje) {
		this.qzdje = qzdje;
	}

	/**
	 * @return the ysbje
	 */
	public Double getYsbje() {
		return ysbje;
	}

	/**
	 * @param ysbje the ysbje to set
	 */
	public void setYsbje(Double ysbje) {
		this.ysbje = ysbje;
	}


	/**
	 * @return the djSwdjbxxVOList
	 */
	public List<DjSwdjbxxVO> getDjSwdjbxxVOList() {
		return djSwdjbxxVOList;
	}

	/**
	 * @param djSwdjbxxVOList the djSwdjbxxVOList to set
	 */
	public void setDjSwdjbxxVOList(List<DjSwdjbxxVO> djSwdjbxxVOList) {
		this.djSwdjbxxVOList = djSwdjbxxVOList;
	}

	/**
	 * @return the nsrztDm
	 */
	public String getNsrztDm() {
		return nsrztDm;
	}

	/**
	 * @param nsrztDm the nsrztDm to set
	 */
	public void setNsrztDm(String nsrztDm) {
		this.nsrztDm = nsrztDm;
	}

	/**
	 * @return the zrrhybz
	 */
	public String getZrrhybz() {
		return zrrhybz;
	}

	/**
	 * @param zrrhybz the zrrhybz to set
	 */
	public void setZrrhybz(String zrrhybz) {
		this.zrrhybz = zrrhybz;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

	public BigDecimal getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(BigDecimal usedAmount) {
		this.usedAmount = usedAmount;
	}
}
