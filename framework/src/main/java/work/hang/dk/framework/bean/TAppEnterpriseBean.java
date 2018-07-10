package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TAppEnterprise;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TAppEnterpriseBean extends TAppEnterprise {
	private static final long serialVersionUID = -8533668545044495177L;
	/**
	 * 用户名
	 **/
	private String userName;
	/**
	 * 密码
	 **/
	private String password;
	/**
	 * 法人名称名
	 **/
	private String name;
	/**
	 * 是否是注册流程
	 **/
	private String isRegister;
	/**
	 * 纳税人识别号
	 **/
	private String taxpayerNum;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = trim(userName);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = trim(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = trim(name);
	}

	public String getIsRegister() {
		return isRegister;
	}

	public void setIsRegister(String isRegister) {
		this.isRegister = trim(isRegister);
	}

	public String getTaxpayerNum() {
		return taxpayerNum;
	}

	public void setTaxpayerNum(String taxpayerNum) {
		this.taxpayerNum = trim(taxpayerNum);
	}
}
