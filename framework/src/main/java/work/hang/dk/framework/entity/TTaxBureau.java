package work.hang.dk.framework.entity;

import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TTaxBureau extends BaseEntity {
	private static final long serialVersionUID = -5602525474170957603L;

	/**
	 * 税局名称
	 **/
	private String bureauName;
	/**
	 * 上级税务机关代码
	 **/
	private String parentCode;
	/**
	 * 税务代开码
	 **/
	private String taxCode;
	/**
	 * 地址电话
	 **/
	private String address;
	/**
	 * 开户银行及账户
	 **/
	private String bankAccount;
	/**
	 * 机关等级 00:总局 11:省级 31:地市级 41:县区级 51:乡镇级
	 **/
	private String organLevel;
	/**
	 * 税号
	 **/
	private String nsrsbh;
	/**
	 * 税务专用章
	 */
	private byte[] sealContent;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;
	/**
	 * 发票最大限额
	 **/
	private String quota;

	public String getBureauName() {
		return bureauName;
	}

	public void setBureauName(String bureauName) {
		this.bureauName = trim(bureauName);
	}

	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * @param taxCode the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the bankAccount
	 */
	public String getBankAccount() {
		return bankAccount;
	}

	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * @return the organLevel
	 */
	public String getOrganLevel() {
		return organLevel;
	}

	/**
	 * @param organLevel the organLevel to set
	 */
	public void setOrganLevel(String organLevel) {
		this.organLevel = organLevel;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
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

	public byte[] getSealContent() {
		return sealContent;
	}

	public void setSealContent(byte[] sealContent) {
		this.sealContent = sealContent;
	}

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}
}
