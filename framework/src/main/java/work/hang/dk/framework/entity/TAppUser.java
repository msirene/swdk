package work.hang.dk.framework.entity;

import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TAppUser extends BaseEntity {

	private static final long serialVersionUID = 1363148349548265807L;

	/**
	 * 主键ID
	 **/
	private String id;
	/**
	 * 用户名
	 **/
	private String userName;
	/**
	 * 密码
	 **/
	private String password;
	/**
	 * 姓名
	 **/
	private String name;
	/**
	 * 角色 1、管理员 2、开票员
	 **/
	private String role;
	/**
	 * 删除标识：0、否 1、是
	 **/
	private String delFlag;
	/**
	 * 完成注册标识：0、否 1、是
	 **/
	private String completeFlag;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;
	/**
	 * 身份证
	 **/
	private String idCode;

	/**
	 * 注册方式
	 **/
	private String registerType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role == null ? null : role.trim();
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

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = trim(delFlag);
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = trim(idCode);
	}

	public String getCompleteFlag() {
		return completeFlag;
	}

	public void setCompleteFlag(String completeFlag) {
		this.completeFlag = trim(completeFlag);
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = trim(registerType);
	}
}
