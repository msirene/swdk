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
public class TInvoiceDetail extends BaseEntity {

	private static final long serialVersionUID = 6904168914808674935L;

	/**
	 * 主键ID
	 **/
	private String id;
	/**
	 * 项目名称
	 **/
	private String xmmc;
	/**
	 * 项目金额
	 **/
	private BigDecimal xmje;
	/**
	 * 税率
	 **/
	private BigDecimal sl;
	/**
	 * 税额
	 **/
	private BigDecimal se;
	/**
	 * 规格型号
	 **/
	private String ggxh;
	/**
	 * 单位
	 **/
	private String dw;
	/**
	 * 项目数量
	 **/
	private BigDecimal xmsl;
	/**
	 * 项目单价
	 **/
	private BigDecimal xmdj;
	/**
	 * 发票ID
	 **/
	private String invoiceId;
	/**
	 * 开票项目ID
	 **/
	private String itemId;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc == null ? null : xmmc.trim();
	}

	public BigDecimal getXmje() {
		return xmje;
	}

	public void setXmje(BigDecimal xmje) {
		this.xmje = xmje;
	}

	public BigDecimal getSl() {
		return sl;
	}

	public void setSl(BigDecimal sl) {
		this.sl = sl;
	}

	public BigDecimal getSe() {
		return se;
	}

	public void setSe(BigDecimal se) {
		this.se = se;
	}

	public String getGgxh() {
		return ggxh;
	}

	public void setGgxh(String ggxh) {
		this.ggxh = ggxh == null ? null : ggxh.trim();
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw == null ? null : dw.trim();
	}

	public BigDecimal getXmsl() {
		return xmsl;
	}

	public void setXmsl(BigDecimal xmsl) {
		this.xmsl = xmsl;
	}

	public BigDecimal getXmdj() {
		return xmdj;
	}

	public void setXmdj(BigDecimal xmdj) {
		this.xmdj = xmdj;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId == null ? null : itemId.trim();
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
}
