package work.hang.dk.framework.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TEnterprise extends BaseEntity {

	private static final long serialVersionUID = -1619511249590400302L;
	/**
	 * 主键ID
	 **/
	private String id;
	/**
	 * 企业名称
	 **/
	private String enterpriseName;
	/**
	 * 纳税人识别号
	 **/
	private String taxpayerNum;
	/**
	 * 登记序号
	 **/
	private String registerNum;
	/**
	 * 核定额度
	 **/
	private BigDecimal amount;
	/**
	 * 剩余核定额度
	 **/
	private BigDecimal remainAmount;
	/**
	 * 核定额度单位
	 **/
	private String amountUnit;
	/**
	 * 认证用户名手机号
	 **/
	private String legalPersonMobile;
	/**
	 * 认证用户名名称
	 **/
	private String legalPersonName;
	/**
	 * 认证用户身份证号
	 **/
	private String legalPersonIdCode;
	/**
	 * 地址
	 **/
	private String address;
	/**
	 * 电话
	 **/
	private String contacts;
	/**
	 * 开户行账号
	 **/
	private String bankAccount;
	/**
	 * 征收项目代码
	 **/
	private String zsxmDm;
	/**
	 * 征收品目代码
	 **/
	private String zspmDm;
	/**
	 * 征收率
	 **/
	private String zsl;
	/**
	 * 行业代码
	 **/
	private String hyDm;
	/**
	 * 课征主体登记类型代码
	 **/
	private String kzztdjlxDm;
	/**
	 * 街道乡镇代码
	 **/
	private String jdxzDm;
	/**
	 * 生产经营地址行政区划数字代码
	 **/
	private String scjydzxzqhszDm;
	/**
	 * 主管税务所（科、分局）代码
	 **/
	private String zgswskfjDm;
	/**
	 * 登记注册类型代码
	 **/
	private String djzclxDm;
	/**
	 * 企业法人ID
	 **/
	private String legalPersonId;
	/**
	 * 税局ID
	 **/
	private String bureauId;
	/**
	 * 注册标志
	 **/
	private String registerFlag;
	/**
	 * 开票ID
	 **/
	private String kpId;
	// 同步企业数据2 开始 陈誉天 2018-02-23
	/**
	 * 企业状态
	 **/
	private String status;
	// 同步企业数据2 结束 陈誉天 2018-02-23
	/**
	 * 企业状态信息
	 **/
	private String memo;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;

	private String showNum;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName == null ? null : enterpriseName
				.trim();
	}

	public String getTaxpayerNum() {
		return taxpayerNum;
	}

	public void setTaxpayerNum(String taxpayerNum) {
		this.taxpayerNum = taxpayerNum == null ? null : taxpayerNum.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount == null ? null : bankAccount.trim();
	}

	public String getBureauId() {
		return bureauId;
	}

	public void setBureauId(String bureauId) {
		this.bureauId = trim(bureauId);
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getLegalPersonId() {
		return legalPersonId;
	}

	public void setLegalPersonId(String legalPersonId) {
		this.legalPersonId = trim(legalPersonId);
	}

	public String getRegisterFlag() {
		return registerFlag;
	}

	public void setRegisterFlag(String registerFlag) {
		this.registerFlag = trim(registerFlag);
	}

	public String getLegalPersonMobile() {
		return legalPersonMobile;
	}

	public void setLegalPersonMobile(String legalPersonMobile) {
		this.legalPersonMobile = trim(legalPersonMobile);
	}

	public String getLegalPersonName() {
		return legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = trim(legalPersonName);
	}

	public String getLegalPersonIdCode() {
		return legalPersonIdCode;
	}

	public void setLegalPersonIdCode(String legalPersonIdCode) {
		this.legalPersonIdCode = trim(legalPersonIdCode);
	}

	public String getKpId() {
		return kpId;
	}

	public void setKpId(String kpId) {
		this.kpId = trim(kpId);
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRemainAmount() {
		return remainAmount;
	}

	public void setRemainAmount(BigDecimal remainAmount) {
		this.remainAmount = remainAmount;
	}

	public String getAmountUnit() {
		return amountUnit;
	}

	public void setAmountUnit(String amountUnit) {
		this.amountUnit = trim(amountUnit);
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = trim(memo);
	}

	public String getShowNum() {
		return showNum;
	}

	public void setShowNum(String showNum) {
		this.showNum = trim(showNum);
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = trim(registerNum);
	}

	public String getZsxmDm() {
		return zsxmDm;
	}

	public void setZsxmDm(String zsxmDm) {
		this.zsxmDm = trim(zsxmDm);
	}

	public String getZspmDm() {
		return zspmDm;
	}

	public void setZspmDm(String zspmDm) {
		this.zspmDm = trim(zspmDm);
	}

	public String getZsl() {
		return zsl;
	}

	public void setZsl(String zsl) {
		this.zsl = trim(zsl);
	}

	public String getHyDm() {
		return hyDm;
	}

	public void setHyDm(String hyDm) {
		this.hyDm = trim(hyDm);
	}

	public String getKzztdjlxDm() {
		return kzztdjlxDm;
	}

	public void setKzztdjlxDm(String kzztdjlxDm) {
		this.kzztdjlxDm = trim(kzztdjlxDm);
	}

	public String getJdxzDm() {
		return jdxzDm;
	}

	public void setJdxzDm(String jdxzDm) {
		this.jdxzDm = trim(jdxzDm);
	}

	public String getScjydzxzqhszDm() {
		return scjydzxzqhszDm;
	}

	public void setScjydzxzqhszDm(String scjydzxzqhszDm) {
		this.scjydzxzqhszDm = trim(scjydzxzqhszDm);
	}

	public String getZgswskfjDm() {
		return zgswskfjDm;
	}

	public void setZgswskfjDm(String zgswskfjDm) {
		this.zgswskfjDm = trim(zgswskfjDm);
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = trim(contacts);
	}

	public String getDjzclxDm() {
		return djzclxDm;
	}

	public void setDjzclxDm(String djzclxDm) {
		this.djzclxDm = trim(djzclxDm);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = trim(status);
	}
}
