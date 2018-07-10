package work.hang.dk.framework.entity;

import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TPDFAndImage extends BaseEntity {

	private static final long serialVersionUID = -257606991605144944L;

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 发票代码
	 */
	private String fpDm;

	/**
	 * 发票号码
	 */
	private String fpHm;

	/**
	 * 企业ID
	 **/
	private String enterpriseId;

	/**
	 * 状态（0-未完成，1-已完成, 2-失败）
	 */
	private String status;

	/**
	 * 创建时间
	 **/
	private Timestamp createTime;

	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;

	/**
	 * 税务机关代码
	 **/
	private String swjgdm;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = trim(id);
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
		this.fpDm = trim(fpDm);
	}

	/**
	 * @return the fpHm
	 */
	public String getFpHm() {
		return fpHm;
	}

	/**
	 * @param fpHm the fpHm to set
	 */
	public void setFpHm(String fpHm) {
		this.fpHm = trim(fpHm);
	}

	/**
	 * @return the enterpriseId
	 */
	public String getEnterpriseId() {
		return enterpriseId;
	}

	/**
	 * @param enterpriseId the enterpriseId to set
	 */
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = trim(enterpriseId);
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = trim(status);
	}

	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the modifyTime
	 */
	public Timestamp getModifyTime() {
		return modifyTime;
	}

	/**
	 * @param modifyTime the modifyTime to set
	 */
	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * @return the swjgdm
	 */
	public String getSwjgdm() {
		return swjgdm;
	}

	/**
	 * @param swjgdm the swjgdm to set
	 */
	public void setSwjgdm(String swjgdm) {
		this.swjgdm = swjgdm;
	}
}
