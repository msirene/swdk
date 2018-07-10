package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TPreferenceInvoiceItem;

import java.util.List;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TPreferenceInvoiceItemBean extends TPreferenceInvoiceItem {
	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 操作标识 1:新增 | 0或无:删除
	 */
	private String operation;

	/**
	 * 开票项目名称
	 */
	private String itemName;

	/**
	 * 是否为有效开票项
	 **/
	private String preferenceFlag;

	/**
	 * 修改是的旧Oid
	 **/
	private String oldOid;

	private List<ItemBean> detail;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = trim(userId);
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = trim(operation);
	}

	public List<ItemBean> getDetail() {
		return detail;
	}

	public void setDetail(List<ItemBean> detail) {
		this.detail = detail;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = trim(itemName);
	}

	public String getPreferenceFlag() {
		return preferenceFlag;
	}

	public void setPreferenceFlag(String preferenceFlag) {
		this.preferenceFlag = trim(preferenceFlag);
	}

	public String getOldOid() {
		return oldOid;
	}

	public void setOldOid(String oldOid) {
		this.oldOid = trim(oldOid);
	}
}
