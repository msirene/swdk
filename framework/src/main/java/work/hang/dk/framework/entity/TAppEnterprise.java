package work.hang.dk.framework.entity;

import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TAppEnterprise extends BaseEntity {

	private static final long serialVersionUID = -2103913771777270794L;

	/**
	 * 企业Id
	 **/
	private String enterpriseId;
	/**
	 * 操作员Id
	 **/
	private String appUserId;
	/**
	 * 是否默认(0、是1、否)
	 **/
	private String defaultFlag;
	/**
	 * 是否授权开票:0、否 1、是
	 **/
	private String authorizedFlag;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = trim(enterpriseId);
	}

	public String getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(String appUserId) {
		this.appUserId = trim(appUserId);
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDefaultFlag() {
		return defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = trim(defaultFlag);
	}

	public String getAuthorizedFlag() {
		return authorizedFlag;
	}

	public void setAuthorizedFlag(String authorizedFlag) {
		this.authorizedFlag = trim(authorizedFlag);
	}
}
