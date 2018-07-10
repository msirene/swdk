package work.hang.dk.framework.entity;

import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TSysUserRole extends BaseEntity {

	private static final long serialVersionUID = 593150370763435300L;

	/**
	 * 主键ID
	 **/
	private String id;
	/**
	 * 角色名称
	 **/
	private String roleName;
	/**
	 * 角色权限
	 **/
	private String authority;
	/**
	 * 角色描述
	 **/
	private String remark;
	/**
	 * 所属税局ID
	 **/
	private String bureauId;
	/**
	 * 是否删除标识 0否1是
	 **/
	private String delFlag;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}


	/**
	 * @return the delFlag
	 */
	public String getDelFlag() {
		return delFlag;
	}

	/**
	 * @param delFlag the delFlag to set
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	/**
	 * @return the bureauId
	 */
	public String getBureauId() {
		return bureauId;
	}

	/**
	 * @param bureauId the bureauId to set
	 */
	public void setBureauId(String bureauId) {
		this.bureauId = bureauId;
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
}
