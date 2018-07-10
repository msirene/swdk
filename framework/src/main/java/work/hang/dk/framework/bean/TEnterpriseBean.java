package work.hang.dk.framework.bean;

import org.apache.commons.lang3.StringUtils;
import work.hang.dk.framework.constant.CommonConstant;
import work.hang.dk.framework.constant.enums.EnterpriseStatus;
import work.hang.dk.framework.entity.TEnterprise;

import java.util.Map;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TEnterpriseBean extends TEnterprise implements Comparable<TEnterpriseBean> {
	private static final long serialVersionUID = -5222417809743560595L;
	/**
	 * 用户角色
	 */
	private String role;
	/**
	 * app用户ID
	 **/
	private String appUserId;
	/**
	 * 用户名
	 **/
	private String userName;
	/**
	 * 实名认证系统的密码
	 **/
	private String taxpayerPassword;

	/**
	 * 图形验证码
	 **/
	private String verificationCode;

	/**
	 * 默认标志
	 */
	private String defaultFlag;

	/**
	 * 是否是注册流程
	 **/
	private String isRegister;

	/**
	 * 代开点信息
	 */
	private TTaxBureauBean taxBureauBean;

	/**
	 * 代开点税务机关代码
	 */
	private String agentTaxCode;

//    /**
//     * 代开点税局信息
//     */
//    private TTaxBureauBean simulationTaxBureauBean;

	private Map<String, String> kpIdMap;

	/**
	 * 是否是新获取的企业数据
	 */
	private boolean isNewbee;

	/**
	 * 纳税人状态代码
	 */
	private String nsrztDm;

	private boolean isChanged = false;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = trim(role);
	}

	public String getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(String appUserId) {
		this.appUserId = trim(appUserId);
	}

	public String getTaxpayerPassword() {
		return taxpayerPassword;
	}

	public void setTaxpayerPassword(String taxpayerPassword) {
		this.taxpayerPassword = trim(taxpayerPassword);
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = trim(verificationCode);
	}

	public String getDefaultFlag() {
		return defaultFlag;
	}

	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = trim(defaultFlag);
	}

	public Map<String, String> getKpIdMap() {
		return kpIdMap;
	}

	public void setKpIdMap(Map<String, String> kpIdMap) {
		this.kpIdMap = kpIdMap;
	}

	public String getIsRegister() {
		return isRegister;
	}

	public void setIsRegister(String isRegister) {
		this.isRegister = trim(isRegister);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = trim(userName);
	}

	public TTaxBureauBean getTaxBureauBean() {
		return taxBureauBean;
	}

	public void setTaxBureauBean(TTaxBureauBean taxBureauBean) {
		this.taxBureauBean = taxBureauBean;
	}

	public boolean isNewbee() {
		return isNewbee;
	}

	public void setNewbee(boolean isNewbee) {
		this.isNewbee = isNewbee;
	}

	public String getBureauName() {
		return taxBureauBean == null ? "" : taxBureauBean.getBureauName();
	}

	public String getNsrztDm() {
		return nsrztDm;
	}

	public void setNsrztDm(String nsrztDm) {
		this.nsrztDm = trim(nsrztDm);
	}

//	public TTaxBureauBean getSimulationTaxBureauBean() {
//		return simulationTaxBureauBean;
//	}
//
//	public void setSimulationTaxBureauBean(TTaxBureauBean simulationTaxBureauBean) {
//		this.simulationTaxBureauBean = simulationTaxBureauBean;
//	}

	public String getPriority() {
		int priority = 0;
		if (CommonConstant.FLAG_ON.equals(this.getRegisterFlag())) {
			priority = priority + 2;
		}
		if (StringUtils.isEmpty(this.getMemo())) {
			priority++;
		}
		return String.valueOf(priority);
	}

	public void setAgentCode(Map<String, String> agentMap) {
		if (agentMap.containsKey(this.getZgswskfjDm())) {
			agentTaxCode = agentMap.get(this.getZgswskfjDm());
		} else if (agentMap.containsKey(this.getBureauId())) {
			agentTaxCode = agentMap.get(this.getBureauId());
		}
	}

	public void setBureau(Map<String, TTaxBureauBean> bureauMap) {
		this.taxBureauBean = bureauMap.get(this.agentTaxCode);
	}

	public String getAgentTaxCode() {
		return agentTaxCode;
	}

	public void setAgentTaxCode(String agentTaxCode) {
		this.agentTaxCode = agentTaxCode;
	}

	@Override
	public int compareTo(TEnterpriseBean o) {
		return o.getPriority().compareTo(this.getPriority());
	}

	// 同步企业数据2 开始 陈誉天 2018-02-23

	/**
	 * 变更4项基本信息（不会出现等于null的情况）
	 *
	 * @param o
	 */
	private void changeBaseAttr(TEnterpriseBean o) {
		// 税号
		if (!this.getTaxpayerNum().equals(o.getTaxpayerNum())) {
			this.setTaxpayerNum(o.getTaxpayerNum());
			isChanged = true;
		}

		// 企业名称
		if (!this.getEnterpriseName().equals(o.getEnterpriseName())) {
			this.setEnterpriseName(o.getEnterpriseName());
			isChanged = true;
		}

		// 课征主体登记类型代码
		if (!this.getKzztdjlxDm().equals(o.getKzztdjlxDm())) {
			this.setKzztdjlxDm(o.getKzztdjlxDm());
			isChanged = true;
		}

		// 登记注册类型代码
		if (!this.getDjzclxDm().equals(o.getDjzclxDm())) {
			this.setDjzclxDm(o.getDjzclxDm());
			isChanged = true;
		}
	}

	/**
	 * 变更5项扩展信息（会出现等于null的情况）
	 *
	 * @param o
	 * @param isReverse 是否反转 (因为状态为1的bean，5项扩展属性有可能为null)
	 */
	private void changeExtendedAttr(TEnterpriseBean o, boolean isReverse) {
		TEnterpriseBean original = this;
		TEnterpriseBean target = o;
		if (isReverse) {
			original = o;
			target = this;
		}

		// 核定额度单位
		if (!original.getAmountUnit().equals(target.getAmountUnit())) {
			this.setAmountUnit(o.getAmountUnit());
			isChanged = true;
		}

		// 征收项目代码
		if (!original.getZsxmDm().equals(target.getZsxmDm())) {
			this.setZsxmDm(o.getZsxmDm());
			isChanged = true;
		}

		// 征收品目代码
		if (!original.getZspmDm().equals(target.getZspmDm())) {
			this.setZspmDm(o.getZspmDm());
			isChanged = true;
		}

		// 征收率
		if (!original.getZsl().equals(target.getZsl())) {
			this.setZsl(o.getZsl());
			isChanged = true;
		}

		// 行业代码
		if (!original.getHyDm().equals(target.getHyDm())) {
			this.setHyDm(o.getHyDm());
			isChanged = true;
		}
	}

	/**
	 * 变更状态
	 *
	 * @param o
	 */
	private void changeMemo(TEnterpriseBean o) {
		this.setStatus(o.getStatus());
		this.setMemo(o.getMemo());
		isChanged = true;
	}

	// 同步企业数据 开始 陈誉天 2018-02-07
	public boolean isChanged(TEnterpriseBean o) {
		// 状态:0:正常 → 2:同步失败
		// 只修改STATUS和MEMO
		if (EnterpriseStatus.OK.match(this.getStatus())
				&& EnterpriseStatus.ERROR.match(o.getStatus())) {
			this.changeMemo(o);
		} else if (EnterpriseStatus.OK.match(this.getStatus())
				&& EnterpriseStatus.OK.match(o.getStatus())) {
			// 状态:0:正常 → 0:正常
			// 只修改发生变化的字段
			this.changeBaseAttr(o);
			this.changeExtendedAttr(o, false);
		} else if (EnterpriseStatus.OK.match(this.getStatus())
				&& EnterpriseStatus.NG.match(o.getStatus())) {
			// 状态:0:正常 → 1:异常
			// 修改STATUS、MEMO 以及 发生变化的字段
			this.changeMemo(o);
			this.changeBaseAttr(o);
			this.changeExtendedAttr(o, false);
		} else if (EnterpriseStatus.NG.match(this.getStatus())
				&& EnterpriseStatus.OK.match(o.getStatus())) {
			// 状态:1:异常 → 0:正常
			// 修改STATUS、MEMO 以及 发生变化的字段，反转判定
			this.changeMemo(o);
			this.changeBaseAttr(o);
			this.changeExtendedAttr(o, true);
		} else if (EnterpriseStatus.NG.match(this.getStatus())
				&& EnterpriseStatus.NG.match(o.getStatus())) {
			// 状态:1:异常 → 1:异常
			// memo发生变化时修改memo属性
			if (!this.getMemo().equals(o.getMemo())) {
				this.setMemo(o.getMemo());
				this.isChanged = true;
			}
		} else if (EnterpriseStatus.NG.match(this.getStatus())
				&& EnterpriseStatus.ERROR.match(o.getStatus())) {
			// 状态:1:异常 → 2:同步失败
			// 只修改STATUS和MEMO
			this.changeMemo(o);
		} else if (EnterpriseStatus.ERROR.match(this.getStatus())
				&& EnterpriseStatus.ERROR.match(o.getStatus())) {
			// 状态:2:同步失败 → 2:同步失败
			// do nothing
		} else if (EnterpriseStatus.ERROR.match(this.getStatus())
				&& EnterpriseStatus.NG.match(o.getStatus())) {
			// 状态:2:同步失败 → 1:异常
			// 只修改STATUS和MEMO
			this.changeMemo(o);
		} else if (EnterpriseStatus.ERROR.match(this.getStatus())
				&& EnterpriseStatus.OK.match(o.getStatus())) {
			// 状态:2:同步失败 → 0:正常
			// 修改STATUS、MEMO 以及 发生变化的字段，反转判定
			this.changeMemo(o);
			this.changeBaseAttr(o);
			this.changeExtendedAttr(o, true);
		}
		return this.isChanged;
	}
	// 同步企业数据 结束 陈誉天 2018-02-07
	// 同步企业数据2 结束 陈誉天 2018-02-23
}
