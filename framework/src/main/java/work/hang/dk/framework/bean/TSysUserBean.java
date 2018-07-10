package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TSysUser;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TSysUserBean extends TSysUser {
	/**
	 * 角色名称
	 **/
	private String roleName;
	/**
	 * 税局名称
	 **/
	private String bureauName;

	private TSysUserRoleBean sysUserRoleBean;
	/**
	 * 所属税局
	 */
	private TTaxBureauBean taxBureau;

	/**
	 * 旧密码
	 */
	private String oldPassword;

	public TTaxBureauBean getTaxBureau() {
		return taxBureau;
	}

	public void setTaxBureau(TTaxBureauBean taxBureau) {
		this.taxBureau = taxBureau;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the bureauName
	 */
	public String getBureauName() {
		return bureauName;
	}

	/**
	 * @param bureauName the bureauName to set
	 */
	public void setBureauName(String bureauName) {
		this.bureauName = bureauName;
	}

	/**
	 * @return the sysUserRoleBean
	 */
	public TSysUserRoleBean getSysUserRoleBean() {
		return sysUserRoleBean;
	}

	/**
	 * @param sysUserRoleBean the sysUserRoleBean to set
	 */
	public void setSysUserRoleBean(TSysUserRoleBean sysUserRoleBean) {
		this.sysUserRoleBean = sysUserRoleBean;
	}


}
