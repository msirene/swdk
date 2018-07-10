package work.hang.dk.framework.bean;

import org.apache.commons.lang3.StringUtils;
import work.hang.dk.framework.bean.co.invoice.response.BusinessResponseCommonFpcx;
import work.hang.dk.framework.bean.co.invoice.response.BusinessResponseCommonFpkj;
import work.hang.dk.framework.bean.co.jinsan.FPFpNsrfpjcJcVO;
import work.hang.dk.framework.constant.CommonConstant;
import work.hang.dk.framework.constant.enums.InvoiceImageFlag;
import work.hang.dk.framework.constant.enums.InvoiceStatus;
import work.hang.dk.framework.entity.TInvoice;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TInvoiceBean extends TInvoice {

	private static final long serialVersionUID = -7287002716507884179L;
	/**
	 * 开票日期起(格式必须是：yyyy-MM-dd)
	 */
	private String kprqBegin;
	/**
	 * 开票日期止(格式必须是：yyyy-MM-dd)
	 */
	private String kprqEnd;
	/**
	 * 开票日期
	 */
	private String kprqStr;
	/**
	 * 是否返回发票文件
	 */
	private int sffhfpwj;
	/**
	 * 是否返回开票项目
	 */
	private int sffhkpxm;
	/**
	 * 开票项目
	 */
	private List<TInvoiceDetailBean> list;
	/**
	 * 发票文件信息
	 */
	private TPDFAndImageBean pdfAndImageBean;


	/**
	 * 销售方
	 */
	private TEnterpriseBean enterprise;

	private String role;
	/**
	 * 模糊查询条件 1:发票代码、发票号码 模糊
	 **/
	private String fuzzyQueryFlag;
	/**
	 * 开票结果
	 */
	private BusinessResponseCommonFpkj fpkjResult;
	/**
	 * 开票结果
	 */
	private BusinessResponseCommonFpcx fpcxResult;
	/**
	 * 伪ID或红字发票对应的蓝票ID
	 */
	private String fakeId;
	/**
	 * 原始数据
	 */
	private String originalData;

	/**
	 * 金三的参数*************************
	 */
	/**
	 * 代开申请UUID
	 */
	private String dksquuid;

	/**
	 * 发票结存List
	 */
	private List<FPFpNsrfpjcJcVO> fpjcList;

	/**
	 * 累计使用额度
	 */
	private BigDecimal used;

	/**
	 * 开票员名称
	 */
	private String userName;

	/**
	 * 邮箱地址
	 */
	private String email;

	/**
	 * @return the kprqBegin
	 */
	public String getKprqBegin() {
		return kprqBegin;
	}

	/**
	 * @param kprqBegin the kprqBegin to set
	 */
	public void setKprqBegin(String kprqBegin) {
		this.kprqBegin = kprqBegin;
	}

	/**
	 * @return the kprqEnd
	 */
	public String getKprqEnd() {
		return kprqEnd;
	}

	/**
	 * @param kprqEnd the kprqEnd to set
	 */
	public void setKprqEnd(String kprqEnd) {
		this.kprqEnd = kprqEnd;
	}

	/**
	 * @return the list
	 */
	public List<TInvoiceDetailBean> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<TInvoiceDetailBean> list) {
		this.list = list;
	}

//    public String getNsrjcuuid() {
//		return nsrjcuuid;
//	}
//
//	public void setNsrjcuuid(String nsrjcuuid) {
//		this.nsrjcuuid = trim(nsrjcuuid);
//	}
//
//	public String getFpzlDm() {
//		return fpzlDm;
//	}
//
//	public void setFpzlDm(String fpzlDm) {
//		this.fpzlDm = trim(fpzlDm);
//	}
//
//	public String getFpztDm() {
//		return fpztDm;
//	}
//
//	public void setFpztDm(String fpztDm) {
//		this.fpztDm = trim(fpztDm);
//	}
//
//	public String getFpqshm() {
//		return fpqshm;
//	}
//
//	public void setFpqshm(String fpqshm) {
//		this.fpqshm = trim(fpqshm);
//	}
//
//	public String getFpzzhm() {
//		return fpzzhm;
//	}
//
//	public void setFpzzhm(String fpzzhm) {
//		this.fpzzhm = trim(fpzzhm);
//	}

	public String getDksquuid() {
		return dksquuid;
	}

	public void setDksquuid(String dksquuid) {
		this.dksquuid = trim(dksquuid);
	}

	public BusinessResponseCommonFpkj getFpkjResult() {
		return fpkjResult;
	}

	public BusinessResponseCommonFpcx getFpcxResult() {
		return fpcxResult;
	}

	/**
	 * @return the enterprise
	 */
	public TEnterpriseBean getEnterprise() {
		return enterprise;
	}

	/**
	 * @param enterprise the enterprise to set
	 */
	public void setEnterprise(TEnterpriseBean enterprise) {
		this.enterprise = enterprise;
	}

	public String getKprqStr() {
		return kprqStr;
	}

	public void setKprqStr(String kprqStr) {
		this.kprqStr = trim(kprqStr);
	}

	/**
	 * @return the sffhfpwj
	 */
	public int getSffhfpwj() {
		return sffhfpwj;
	}

	/**
	 * @param sffhfpwj the sffhfpwj to set
	 */
	public void setSffhfpwj(int sffhfpwj) {
		this.sffhfpwj = sffhfpwj;
	}

	/**
	 * @return the sffhkpxm
	 */
	public int getSffhkpxm() {
		return sffhkpxm;
	}

	/**
	 * @param sffhkpxm the sffhkpxm to set
	 */
	public void setSffhkpxm(int sffhkpxm) {
		this.sffhkpxm = sffhkpxm;
	}

	public TPDFAndImageBean getPdfAndImageBean() {
		return pdfAndImageBean;
	}

	public void setPdfAndImageBean(TPDFAndImageBean pdfAndImageBean) {
		this.pdfAndImageBean = pdfAndImageBean;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = trim(role);
	}

	public String getFakeId() {
		return fakeId;
	}

	public void setFakeId(String fakeId) {
		this.fakeId = trim(fakeId);
	}

	public String getOriginalData() {
		return originalData;
	}

	public void setOriginalData(String originalData) {
		this.originalData = trim(originalData);
	}

	/**
	 * @return the fuzzyQueryFlag
	 */
	public String getFuzzyQueryFlag() {
		return fuzzyQueryFlag;
	}

	/**
	 * @param fuzzyQueryFlag the fuzzyQueryFlag to set
	 */
	public void setFuzzyQueryFlag(String fuzzyQueryFlag) {
		this.fuzzyQueryFlag = fuzzyQueryFlag;
	}

	public List<FPFpNsrfpjcJcVO> getFpjcList() {
		return fpjcList;
	}

	public void setFpjcList(List<FPFpNsrfpjcJcVO> fpjcList) {
		this.fpjcList = fpjcList;
	}

	public BusinessResponseCommonFpkj getInvoiceResult() {
		return fpkjResult;
	}

	public void setFpkjResult(BusinessResponseCommonFpkj result) {
		this.fpkjResult = result;
	}

	public void setFpcxResult(BusinessResponseCommonFpcx result) {
		this.fpcxResult = result;
	}

	public BigDecimal getUsed() {
		return used;
	}

	public void setUsed(BigDecimal used) {
		this.used = used;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = trim(userName);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = trim(email);
	}

	public void transferFpkjResultData() throws ParseException {
		if (null == this.fpkjResult) {
			return;
		}
		if (CommonConstant.INVOICE_SUCCESS.equals(this.fpkjResult.getFpkj().getReturnCode())) {
			// 发票请求流水号
			this.setFpqqlsh(this.fpkjResult.getFpkj().getFpqqlsh());
			// 税控设备编号
			this.setJqbh(this.fpkjResult.getFpkj().getJqbh());
			// 发票代码
			if (StringUtils.isEmpty(this.getFpDm())) {
				this.setFpDm(this.fpkjResult.getFpkj().getFpDm());
			}
			// 发票号码
			if (StringUtils.isEmpty(this.getFpHm())) {
				this.setFpHm(this.fpkjResult.getFpkj().getFpHm());
			}
			// 开票日期
			this.setKprq(new Timestamp(new SimpleDateFormat("yyyyMMddHHmmss").parse(this.fpkjResult.getFpkj().getKprq()).getTime()));
			// 发票密文
			this.setFpMw(this.fpkjResult.getFpkj().getFpMw());
			// 发票校验码
			this.setJym(this.fpkjResult.getFpkj().getJym());
			// 二维码
			this.setEwm(this.fpkjResult.getFpkj().getEwm());
			// 备注
			this.setResBz(this.fpkjResult.getFpkj().getBz());
			// 开票状态
			this.setStatus(InvoiceStatus.INVOICE_SUCCEED.getStatus());

			this.setImageFlag(InvoiceImageFlag.DOING.getStatus());
		} else {
			// 开票状态
			this.setStatus(InvoiceStatus.INVOICE_DEFEATED.getStatus());
		}
		this.setReturncode(this.fpkjResult.getFpkj().getReturnCode());
		this.setReturnmsg(this.fpkjResult.getFpkj().getReturnMsg());
	}

//	public void transferFpcxResultData() throws ParseException {
//		if (null == this.fpcxResult) {
//			return;
//		}
//		if (CommonConstant.INVOICE_SUCCESS.equals(this.fpcxResult.getFpcx().getReturnCode())) {
//			// 税控设备编号
//			this.setJqbh(this.fpcxResult.getFpcx().getJqbh());
//			// 发票代码
//			this.setFpDm(this.fpcxResult.getFpcx().getFpDm());
//			// 发票号码
//			this.setFpHm(this.fpcxResult.getFpcx().getFpHm());
//			// 开票日期
//			this.setKprq(new Timestamp(new SimpleDateFormat("yyyyMMddHHmmss").parse(this.fpcxResult.getFpcx().getKprq()).getTime()));
//			// 发票密文
//			this.setFpMw(this.fpcxResult.getFpcx().getFpMw());
//			// 发票校验码
//			this.setJym(this.fpcxResult.getFpcx().getJym());
//			// 二维码
//			this.setEwm(this.fpcxResult.getFpcx().getEwm());
//			// 备注
//			this.setResBz(this.fpcxResult.getFpcx().getBz());
//			// 开票状态
//			this.setStatus(InvoiceStatus.INVOICE_SUCCEED.getStatus());
//
//			this.setImageFlag(InvoiceImageFlag.DOING.getStatus());
//		} else {
//			// 开票状态
//			this.setStatus(InvoiceStatus.INVOICE_DEFEATED.getStatus());
//		}
//		this.setReturncode(this.fpcxResult.getFpcx().getReturnCode());
//		this.setReturnmsg(this.fpcxResult.getFpcx().getReturnMsg());
//	}

	public void fail(String returnCode, String returnMsg, String status) {
		// 显示给用户的信息
		this.setReturnmsg(returnMsg);
		// 系统提示写入数据库，供差错时使用
		this.setResBz(returnMsg);
		this.setReturncode(returnCode);
		this.setStatus(status);
	}
}
