package work.hang.dk.framework.entity;

import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TCodeInvoiceItem extends BaseEntity {

	private static final long serialVersionUID = 2195853422548159918L;

	/**
	 * 税收编码
	 **/
	private String id;
	/**
	 * 服务名称
	 **/
	private String fwmc;
	/**
	 * 说明
	 **/
	private String sm;
	/**
	 * 征收品目
	 **/
	private String zspm;
	/**
	 * 增值税税率(%)
	 **/
	private String zssl;
	/**
	 * 关键字
	 **/
	private String gjz;
	/**
	 * 父级标识
	 **/
	private Long fjbz;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;
	/**
	 * 是否有效
	 **/
	private String valid;
	/**
	 * 父级ID
	 **/
	private String fjid;
	/**
	 * 是否为常用项
	 **/
	private String preferenceFlag;
	/**
	 * 是否为商品项
	 **/
	private String commodityFlag;
	/**
	 * 系统扩展编号
	 **/
	private String baseId;
	/**
	 * 扩展编码
	 **/
	private String extendFlag;
	/**
	 * 简称
	 **/
	private String shortName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getFwmc() {
		return fwmc;
	}

	public void setFwmc(String fwmc) {
		this.fwmc = fwmc == null ? null : fwmc.trim();
	}

	public String getSm() {
		return sm;
	}

	public void setSm(String sm) {
		this.sm = sm == null ? null : sm.trim();
	}

	public String getZspm() {
		return zspm;
	}

	public void setZspm(String zspm) {
		this.zspm = zspm == null ? null : zspm.trim();
	}

	public String getZssl() {
		return zssl;
	}

	public void setZssl(String zssl) {
		this.zssl = zssl == null ? null : zssl.trim();
	}

	public String getGjz() {
		return gjz;
	}

	public void setGjz(String gjz) {
		this.gjz = gjz == null ? null : gjz.trim();
	}

	public Long getFjbz() {
		return fjbz;
	}

	public void setFjbz(Long fjbz) {
		this.fjbz = fjbz;
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

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid == null ? null : valid.trim();
	}

	public String getFjid() {
		return fjid;
	}

	public void setFjid(String fjid) {
		this.fjid = fjid == null ? null : fjid.trim();
	}

	/**
	 * @return the preferenceFlag
	 */
	public String getPreferenceFlag() {
		return preferenceFlag;
	}

	/**
	 * @param preferenceFlag the preferenceFlag to set
	 */
	public void setPreferenceFlag(String preferenceFlag) {
		this.preferenceFlag = trim(preferenceFlag);
	}

	public String getCommodityFlag() {
		return commodityFlag;
	}

	public void setCommodityFlag(String commodityFlag) {
		this.commodityFlag = trim(commodityFlag);
	}

	public String getBaseId() {
		return baseId;
	}

	public void setBaseId(String baseId) {
		this.baseId = trim(baseId);
	}

	public String getExtendFlag() {
		return extendFlag;
	}

	public void setExtendFlag(String extendFlag) {
		this.extendFlag = trim(extendFlag);
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = trim(shortName);
	}
}
