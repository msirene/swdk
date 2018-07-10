package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TAppUser;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TAppUserBean extends TAppUser {
	private static final long serialVersionUID = 5285092844157642067L;
	/**
	 * 存在没有生成开票码的企业
	 */
	private boolean isNoneToken = false;

	/**
	 * 企业Id
	 **/
	private String enterpriseId;

	/**
	 * 企业名称
	 **/
	private String enterpriseName;

	/**
	 * 旧密码
	 */
	private String oldPassword;

	/**
	 * 机器编码
	 */
	private String appSoftToken;

	/**
	 * 查询管理员
	 */
	private String managerFlag;

	/**
	 * 操作机器编码 null:存 | 非null:取
	 */
	private String appSoftTokenFlag;

	/**
	 * 开票ID
	 **/
	private String kpId;

	/**
	 * 是否授权开票:0、否 1、是
	 **/
	private String authorizedFlag;

	/**
	 * 是否返还开票权限给管理员
	 **/
	private String returnFlag;

	private String partial;

	/**
	 * 登录后生产的身份验证码
	 */
	private String token;

	/**
	 * 注册流程的缓存数据
	 */
	private RegistrationDataBean registrationData;

	/**
	 * 是否实名认证:0、否 1、是
	 **/
	private String registedFlag;

	/**
	 * 法人名下的企业数量
	 */
	private int enterpriseCount = 0;

	/**
	 * 其他用户的ID
	 */
	private String otherUserId;

	public boolean isNoneToken() {
		return isNoneToken;
	}

	public void setNoneToken(boolean isNoneToken) {
		this.isNoneToken = isNoneToken;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = trim(oldPassword);
	}

	public String getAppSoftToken() {
		return appSoftToken;
	}

	public void setAppSoftToken(String appSoftToken) {
		this.appSoftToken = trim(appSoftToken);
	}

	public String getManagerFlag() {
		return managerFlag;
	}

	public void setManagerFlag(String managerFlag) {
		this.managerFlag = trim(managerFlag);
	}

	public String getAppSoftTokenFlag() {
		return appSoftTokenFlag;
	}

	public void setAppSoftTokenFlag(String appSoftTokenFlag) {
		this.appSoftTokenFlag = trim(appSoftTokenFlag);
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = trim(enterpriseName);
	}

	public String getKpId() {
		return kpId;
	}

	public void setKpId(String kpId) {
		this.kpId = trim(kpId);
	}

	public String getAuthorizedFlag() {
		return authorizedFlag;
	}

	public void setAuthorizedFlag(String authorizedFlag) {
		this.authorizedFlag = trim(authorizedFlag);
	}

	public String getReturnFlag() {
		return returnFlag;
	}

	public void setReturnFlag(String returnFlag) {
		this.returnFlag = trim(returnFlag);
	}

	public RegistrationDataBean getRegistrationData() {
		return registrationData;
	}

	public void setRegistrationData(RegistrationDataBean registrationData) {
		this.registrationData = registrationData;
	}

	public String getPartial() {
		return partial;
	}

	public void setPartial(String partial) {
		this.partial = trim(partial);
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRegistedFlag() {
		return registedFlag;
	}

	public void setRegistedFlag(String registedFlag) {
		this.registedFlag = trim(registedFlag);
	}

	public int getEnterpriseCount() {
		return enterpriseCount;
	}

	public void setEnterpriseCount(int enterpriseCount) {
		this.enterpriseCount = enterpriseCount;
	}

	public String getOtherUserId() {
		return otherUserId;
	}

	public void setOtherUserId(String otherUserId) {
		this.otherUserId = trim(otherUserId);
	}
}
