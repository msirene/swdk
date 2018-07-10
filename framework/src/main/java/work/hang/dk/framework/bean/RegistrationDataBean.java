package work.hang.dk.framework.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class RegistrationDataBean extends BaseBean {
	/**
	 * 该用户名下的企业
	 */
	private List<TEnterpriseBean> enterprises = null;

	/**
	 * 等待获取企业数据 1:获取中 | 0:获取结束
	 */
	private String waiting4Enterprise = null;

	/**
	 * 默认企业的ID
	 */
	private String defaultEnterpriseId = null;

	/**
	 * 企业ID↔开票码
	 */
	private Map<String, String> kpIdMap = null;

	/**
	 * 企业ID↔ShowNum
	 */
	private Map<String, String> showNumMap = null;

	/**
	 * 用户信息
	 */
	private TAppUserBean user = null;

	/**
	 * 等待获取用户数据 1:获取中 | 0:获取结束
	 */
	private String waiting4User = null;

	/**
	 * 机器编码
	 */
	private String appSoftToken = null;

	public List<TEnterpriseBean> getEnterprises() {
		return enterprises;
	}

	public void setEnterprises(List<TEnterpriseBean> enterprises) {
		this.enterprises = enterprises;
	}

	public TAppUserBean getUser() {
		return user;
	}

	public void setUser(TAppUserBean user) {
		this.user = user;
	}

	public String getDefaultEnterpriseId() {
		return defaultEnterpriseId;
	}

	public void setDefaultEnterpriseId(String defaultEnterpriseId) {
		this.defaultEnterpriseId = defaultEnterpriseId;
	}

	public Map<String, String> getKpIdMap() {
		return kpIdMap;
	}

	public void setKpId(String key, String value) {
		if (kpIdMap == null) {
			kpIdMap = new HashMap<>(10);
		}
		kpIdMap.put(key, value);
	}

	public void delKpId(String key) {
		if (kpIdMap == null) {
			return;
		}
		kpIdMap.remove(key);
	}

	public Map<String, String> getShowNumMap() {
		return showNumMap;
	}

	public void setShowNum(String key, String value) {
		if (showNumMap == null) {
			showNumMap = new HashMap<>(10);
		}
		showNumMap.put(key, value);
	}

	public void delShowNum(String key) {
		if (showNumMap == null) {
			return;
		}
		showNumMap.remove(key);
	}

	public String getAppSoftToken() {
		return appSoftToken;
	}

	public void setAppSoftToken(String appSoftToken) {
		this.appSoftToken = appSoftToken;
	}

	public String getWaiting4Enterprise() {
		return waiting4Enterprise;
	}

	public void setWaiting4Enterprise(String waiting4Enterprise) {
		this.waiting4Enterprise = waiting4Enterprise;
	}

	public String getWaiting4User() {
		return waiting4User;
	}

	public void setWaiting4User(String waiting4User) {
		this.waiting4User = waiting4User;
	}
}
