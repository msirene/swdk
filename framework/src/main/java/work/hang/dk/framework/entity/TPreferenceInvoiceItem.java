package work.hang.dk.framework.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public class TPreferenceInvoiceItem extends BaseEntity {

	private static final long serialVersionUID = 2050285822193326428L;

	/**
	 * ID
	 **/
	private String id;
	/**
	 * 开票项目ID
	 **/
	private String itemId;
	/**
	 * 商品OID
	 **/
	private String oid;
	/**
	 * 企业ID
	 **/
	private String enterpriseId;
	/**
	 * 税率
	 **/
	private BigDecimal sl;
	/**
	 * 商品名称
	 **/
	private String commodityName;
	/**
	 * 开票项目类型
	 **/
	private String itemType;
	/**
	 * 规格型号
	 **/
	private String specification;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId == null ? null : itemId.trim();
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getSl() {
		return sl;
	}

	public void setSl(BigDecimal sl) {
		this.sl = sl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = trim(id);
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = trim(oid);
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = trim(commodityName);
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = trim(itemType);
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = trim(specification);
	}
}
