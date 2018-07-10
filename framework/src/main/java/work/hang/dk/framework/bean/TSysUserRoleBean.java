package work.hang.dk.framework.bean;

import work.hang.dk.framework.entity.TSysUserRole;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class TSysUserRoleBean extends TSysUserRole {
	/**
	 * 所属税局名称
	 **/
	private String bureauName;
	private String item;
	private String commodity;
	private String amount;
	private String seal;
	private String taxplayer;
	private String register;
	private String invoice;
	private String role;
	private String user;

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
	 * @return the item
	 */
	private String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}


	/**
	 * @return the commodity
	 */
	private String getCommodity() {
		return commodity;
	}

	/**
	 * @param commodity the commodity to set
	 */
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	/**
	 * @return the amount
	 */
	private String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the seal
	 */
	private String getSeal() {
		return seal;
	}

	/**
	 * @param seal the seal to set
	 */
	public void setSeal(String seal) {
		this.seal = seal;
	}

	/**
	 * @return the taxplayer
	 */
	private String getTaxplayer() {
		return taxplayer;
	}

	/**
	 * @param taxplayer the taxplayer to set
	 */
	public void setTaxplayer(String taxplayer) {
		this.taxplayer = taxplayer;
	}


	/**
	 * @return the register
	 */
	private String getRegister() {
		return register;
	}

	/**
	 * @param register the register to set
	 */
	public void setRegister(String register) {
		this.register = register;
	}

	/**
	 * @return the invoice
	 */
	private String getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice the invoice to set
	 */
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	/**
	 * @return the role
	 */
	private String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the user
	 */
	private String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

}
