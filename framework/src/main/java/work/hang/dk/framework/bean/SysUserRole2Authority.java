package work.hang.dk.framework.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import work.hang.dk.framework.util.CommonUtil;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public class SysUserRole2Authority implements Serializable {
	private static final long serialVersionUID = 3843564396008838064L;
	private TSysUserRoleBean sysRole;
	private Item item;
	private Commodity commodity;
	private Amount amount;
	private Seal seal;
	private Taxplayer taxplayer;
	private Register register;
	private Invoice invoice;
	private Role role;
	private User user;

	public void init(TSysUserRoleBean obj) {
		if (null == obj || StringUtils.isBlank(obj.getAuthority())) {
			this.sysRole = new TSysUserRoleBean();
		} else {
			try {
				this.sysRole = new ObjectMapper().readValue(obj.getAuthority(), TSysUserRoleBean.class);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//this.item = new Item(sysRole.getItem());
		//this.commodity = new Commodity(sysRole.getCommodity());
		//this.amount = new Amount(sysRole.getAmount());
		//this.seal = new Seal(sysRole.getSeal());
		//this.taxplayer = new Taxplayer(sysRole.getTaxplayer());
		//this.invoice = new Invoice(sysRole.getInvoice());
		//this.role = new Role(sysRole.getRole());
		//this.user = new User(sysRole.getUser());
		//this.register = new Register(sysRole.getRegister());
	}

	/**
	 * @return the sysRole
	 */
	public TSysUserRoleBean getSysRole() {
		return sysRole;
	}

	/**
	 * @param sysRole the sysRole to set
	 */
	public void setSysRole(TSysUserRoleBean sysRole) {
		this.sysRole = sysRole;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the commodity
	 */
	public Commodity getCommodity() {
		return commodity;
	}

	/**
	 * @param commodity the commodity to set
	 */
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	/**
	 * @return the amount
	 */
	public Amount getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	/**
	 * @return the seal
	 */
	public Seal getSeal() {
		return seal;
	}

	/**
	 * @param seal the seal to set
	 */
	public void setSeal(Seal seal) {
		this.seal = seal;
	}

	/**
	 * @return the taxplayer
	 */
	public Taxplayer getTaxplayer() {
		return taxplayer;
	}

	/**
	 * @param taxplayer the taxplayer to set
	 */
	public void setTaxplayer(Taxplayer taxplayer) {
		this.taxplayer = taxplayer;
	}


	/**
	 * @return the register
	 */
	public Register getRegister() {
		return register;
	}

	/**
	 * @param register the register to set
	 */
	public void setRegister(Register register) {
		this.register = register;
	}

	/**
	 * @return the invoice
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice the invoice to set
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}


	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}


	public class Item implements Serializable {
		private static final long serialVersionUID = -2536283869722093131L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 新增
		 */
		private boolean insert;

		private Item(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}
	}

	public class Commodity implements Serializable {
		private static final long serialVersionUID = -3840329542889853633L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 新增
		 */
		private boolean insert;

		private Commodity(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}

	}

	public class Amount implements Serializable {
		private static final long serialVersionUID = 5747141321245238450L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 新增
		 */
		private boolean insert;

		private Amount(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}
	}

	public class Seal implements Serializable {

		private static final long serialVersionUID = -1908436909571632140L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 新增
		 */
		private boolean insert;

		private boolean detail;

		private boolean update;

		private boolean delete;

		private Seal(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
			this.detail = CommonUtil.checkAuthorityItem(authorityBin, 2);
			this.update = CommonUtil.checkAuthorityItem(authorityBin, 3);
			this.delete = CommonUtil.checkAuthorityItem(authorityBin, 4);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}

		/**
		 * @return the detail
		 */
		public boolean isDetail() {
			return detail;
		}

		/**
		 * @param detail the detail to set
		 */
		public void setDetail(boolean detail) {
			this.detail = detail;
		}

		/**
		 * @return the update
		 */
		public boolean isUpdate() {
			return update;
		}

		/**
		 * @param update the update to set
		 */
		public void setUpdate(boolean update) {
			this.update = update;
		}

		/**
		 * @return the delete
		 */
		public boolean isDelete() {
			return delete;
		}

		/**
		 * @param delete the delete to set
		 */
		public void setDelete(boolean delete) {
			this.delete = delete;
		}

	}

	public class Taxplayer implements Serializable {
		private static final long serialVersionUID = 2517980630428289021L;
		/**
		 * 页面访问权限
		 */
		private boolean access;

		private Taxplayer(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}
	}

	public class Register implements Serializable {
		private static final long serialVersionUID = 2212788729677461935L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 添加
		 */
		private boolean insert = true;

		private Register(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}


	}

	public class Invoice implements Serializable {
		private static final long serialVersionUID = -3785270771094652899L;
		/**
		 * 页面访问权限
		 */
		private boolean access;

		private Invoice(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

	}

	public class Role implements Serializable {
		private static final long serialVersionUID = -2982856150710399077L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 添加权限
		 */
		private boolean insert;
		/**
		 * 修改权限
		 */
		private boolean update;
		/**
		 * 删除权限
		 */
		private boolean delete;
		/**
		 * 用户权限
		 */
		private boolean user;
		/**
		 * 权限修改权限
		 */
		private boolean author;

		private Role(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
			this.update = CommonUtil.checkAuthorityItem(authorityBin, 2);
			this.delete = CommonUtil.checkAuthorityItem(authorityBin, 3);
			this.user = CommonUtil.checkAuthorityItem(authorityBin, 4);
			this.author = CommonUtil.checkAuthorityItem(authorityBin, 5);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}

		/**
		 * @return the update
		 */
		public boolean isUpdate() {
			return update;
		}

		/**
		 * @param update the update to set
		 */
		public void setUpdate(boolean update) {
			this.update = update;
		}

		/**
		 * @return the delete
		 */
		public boolean isDelete() {
			return delete;
		}

		/**
		 * @param delete the delete to set
		 */
		public void setDelete(boolean delete) {
			this.delete = delete;
		}

		/**
		 * @return the user
		 */
		public boolean isUser() {
			return user;
		}

		/**
		 * @param user the user to set
		 */
		public void setUser(boolean user) {
			this.user = user;
		}

		/**
		 * @return the author
		 */
		public boolean isAuthor() {
			return author;
		}

		/**
		 * @param author the author to set
		 */
		public void setAuthor(boolean author) {
			this.author = author;
		}
	}

	public class User implements Serializable {
		private static final long serialVersionUID = -7761740437128732974L;
		/**
		 * 页面访问权限
		 */
		private boolean access;
		/**
		 * 添加权限
		 */
		private boolean insert;
		/**
		 * 修改权限
		 */
		private boolean update;
		/**
		 * 禁/启用权限
		 */
		private boolean enabled;
		/**
		 * 删除权限
		 */
		private boolean delete;

		private User(String authority) {
			if (StringUtils.isBlank(authority)) {
				this.access = false;
				return;
			}
			BigInteger authorityBin = new BigInteger(authority, 2);
			this.access = CommonUtil.checkAuthorityItem(authorityBin, 0);
			this.insert = CommonUtil.checkAuthorityItem(authorityBin, 1);
			this.update = CommonUtil.checkAuthorityItem(authorityBin, 2);
			this.enabled = CommonUtil.checkAuthorityItem(authorityBin, 3);
			this.delete = CommonUtil.checkAuthorityItem(authorityBin, 4);
		}

		/**
		 * @return the access
		 */
		public boolean isAccess() {
			return access;
		}

		/**
		 * @param access the access to set
		 */
		public void setAccess(boolean access) {
			this.access = access;
		}

		/**
		 * @return the insert
		 */
		public boolean isInsert() {
			return insert;
		}

		/**
		 * @param insert the insert to set
		 */
		public void setInsert(boolean insert) {
			this.insert = insert;
		}

		/**
		 * @return the update
		 */
		public boolean isUpdate() {
			return update;
		}

		/**
		 * @param update the update to set
		 */
		public void setUpdate(boolean update) {
			this.update = update;
		}

		/**
		 * @return the enabled
		 */
		public boolean isEnabled() {
			return enabled;
		}

		/**
		 * @param enabled the enabled to set
		 */
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		/**
		 * @return the delete
		 */
		public boolean isDelete() {
			return delete;
		}

		/**
		 * @param delete the delete to set
		 */
		public void setDelete(boolean delete) {
			this.delete = delete;
		}
	}
}
