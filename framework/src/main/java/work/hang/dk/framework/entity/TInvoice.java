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
public class TInvoice extends BaseEntity {

	private static final long serialVersionUID = 1777174665657334181L;
	/**
	 * 主键ID
	 **/
	private String id;
	/**
	 * 购买方名称
	 **/
	private String gmfMc;
	/**
	 * 购买方纳税人识别号
	 **/
	private String gmfNsrsbh;
	/**
	 * 购买方地址电话
	 **/
	private String gmfDzdh;
	/**
	 * 购买方开户行账号
	 **/
	private String gmfYhzh;
	/**
	 * 合计金额
	 **/
	private BigDecimal hjje;
	/**
	 * 合计税额
	 **/
	private BigDecimal hjse;
	/**
	 * 收款人
	 **/
	private String skr;
	/**
	 * 复核人
	 **/
	private String fhr;
	/**
	 * 开票人
	 **/
	private String kpr;
	/**
	 * 企业ID
	 **/
	private String enterpriseId;
	/**
	 * 开具状态 0-正在开票 、1-开票成功 、2-开票失败、 3-取消开票
	 */
	private String status;
	/**
	 * 发票类型（1-手动，2-非手动）
	 **/
	private String type;
	/**
	 * 开票类型（0蓝字发票，1红字发票）
	 **/
	private String kplx;
	/**
	 * 创建时间
	 **/
	private Timestamp createTime;
	/**
	 * 修改时间
	 **/
	private Timestamp modifyTime;
	/**
	 * 微信OPENID
	 **/
	private String wechatOpenid;
	/**
	 * 微信UNIONID
	 **/
	private String wechatUnionid;
	/**
	 * 发票请求流水号
	 **/
	private String fpqqlsh;
	/**
	 * 税控设备编号
	 **/
	private String jqbh;
	/**
	 * 发票代码
	 **/
	private String fpDm;
	/**
	 * 发票号码
	 **/
	private String fpHm;
	/**
	 * 开票日期
	 **/
	private Timestamp kprq;
	/**
	 * 发票密文
	 **/
	private String fpMw;
	/**
	 * 校验码
	 **/
	private String jym;
	/**
	 * 二维码
	 **/
	private String ewm;
	/**
	 * 返回代码
	 **/
	private String returncode;
	/**
	 * 返回信息
	 **/
	private String returnmsg;
	/**
	 * 销售方纳税人识别号
	 **/
	private String xsfNsrsbh;
	/**
	 * 销售方名称
	 **/
	private String xsfMc;
	/**
	 * 销售方地址、电话
	 **/
	private String xsfDzdh;
	/**
	 * 销售方银行账号
	 **/
	private String xsfYhzh;
	/**
	 * 原发票代码
	 **/
	private String yfpDm;
	/**
	 * 原发票号码
	 **/
	private String yfpHm;
	/**
	 * 价税合计
	 **/
	private BigDecimal jshj;
	/**
	 * 备注
	 **/
	private String bz;
	/**
	 * 备注
	 **/
	private String resBz;
	/**
	 * 是否开具红字发票
	 **/
	private String sfkjhzfp;
	/**
	 * 开票用户id
	 **/
	private String userId;
	/**
	 * 税务机关代码
	 */
	private String swjgdm;
	/**
	 * PDF、预览图生成标识
	 */
	private String imageFlag;
	private String sendType;
	private String mailFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGmfMc() {
		return gmfMc;
	}

	public void setGmfMc(String gmfMc) {
		this.gmfMc = gmfMc == null ? null : gmfMc.trim();
	}

	public String getGmfNsrsbh() {
		return gmfNsrsbh;
	}

	public void setGmfNsrsbh(String gmfNsrsbh) {
		this.gmfNsrsbh = gmfNsrsbh == null ? null : gmfNsrsbh.trim();
	}

	public String getGmfDzdh() {
		return gmfDzdh;
	}

	public void setGmfDzdh(String gmfDzdh) {
		this.gmfDzdh = gmfDzdh == null ? null : gmfDzdh.trim();
	}

	public String getGmfYhzh() {
		return gmfYhzh;
	}

	public void setGmfYhzh(String gmfYhzh) {
		this.gmfYhzh = gmfYhzh == null ? null : gmfYhzh.trim();
	}

	public BigDecimal getHjje() {
		return hjje;
	}

	public void setHjje(BigDecimal hjje) {
		this.hjje = hjje;
	}

	public BigDecimal getHjse() {
		return hjse;
	}

	public void setHjse(BigDecimal hjse) {
		this.hjse = hjse;
	}

	public String getSkr() {
		return skr;
	}

	public void setSkr(String skr) {
		this.skr = skr == null ? null : skr.trim();
	}

	public String getFhr() {
		return fhr;
	}

	public void setFhr(String fhr) {
		this.fhr = fhr == null ? null : fhr.trim();
	}

	public String getKpr() {
		return kpr;
	}

	public void setKpr(String kpr) {
		this.kpr = kpr == null ? null : kpr.trim();
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = trim(enterpriseId);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * @return the kplx
	 */
	public String getKplx() {
		return kplx;
	}

	/**
	 * @param kplx the kplx to set
	 */
	public void setKplx(String kplx) {
		this.kplx = kplx;
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

	public String getWechatOpenid() {
		return wechatOpenid;
	}

	public void setWechatOpenid(String wechatOpenid) {
		this.wechatOpenid = trim(wechatOpenid);
	}

	/**
	 * @return the wechatUnionid
	 */
	public String getWechatUnionid() {
		return wechatUnionid;
	}

	/**
	 * @param wechatUnionid the wechatUnionid to set
	 */
	public void setWechatUnionid(String wechatUnionid) {
		this.wechatUnionid = trim(wechatUnionid);
	}

	/**
	 * @return the fpqqlsh
	 */
	public String getFpqqlsh() {
		return fpqqlsh;
	}

	/**
	 * @param fpqqlsh the fpqqlsh to set
	 */
	public void setFpqqlsh(String fpqqlsh) {
		this.fpqqlsh = trim(fpqqlsh);
	}

	/**
	 * @return the jqbh
	 */
	public String getJqbh() {
		return jqbh;
	}

	/**
	 * @param jqbh the jqbh to set
	 */
	public void setJqbh(String jqbh) {
		this.jqbh = trim(jqbh);
	}

	/**
	 * @return the fpDm
	 */
	public String getFpDm() {
		return fpDm;
	}

	/**
	 * @param fpDm the fpDm to set
	 */
	public void setFpDm(String fpDm) {
		this.fpDm = trim(fpDm);
	}

	/**
	 * @return the fpHm
	 */
	public String getFpHm() {
		return fpHm;
	}

	/**
	 * @param fpHm the fpHm to set
	 */
	public void setFpHm(String fpHm) {
		this.fpHm = trim(fpHm);
	}

	/**
	 * @return the kprq
	 */
	public Timestamp getKprq() {
		return kprq;
	}

	/**
	 * @param kprq the kprq to set
	 */
	public void setKprq(Timestamp kprq) {
		this.kprq = kprq;
	}

	/**
	 * @return the fpMw
	 */
	public String getFpMw() {
		return fpMw;
	}

	/**
	 * @param fpMw the fpMw to set
	 */
	public void setFpMw(String fpMw) {
		this.fpMw = trim(fpMw);
	}

	/**
	 * @return the jym
	 */
	public String getJym() {
		return jym;
	}

	/**
	 * @param jym the jym to set
	 */
	public void setJym(String jym) {
		this.jym = trim(jym);
	}

	/**
	 * @return the ewm
	 */
	public String getEwm() {
		return ewm;
	}

	/**
	 * @param ewm the ewm to set
	 */
	public void setEwm(String ewm) {
		this.ewm = trim(ewm);
	}

	/**
	 * @return the returncode
	 */
	public String getReturncode() {
		return returncode;
	}

	/**
	 * @param returncode the returncode to set
	 */
	public void setReturncode(String returncode) {
		this.returncode = trim(returncode);
	}

	/**
	 * @return the returnmsg
	 */
	public String getReturnmsg() {
		return returnmsg;
	}

	/**
	 * @param returnmsg the returnmsg to set
	 */
	public void setReturnmsg(String returnmsg) {
		this.returnmsg = trim(returnmsg);
	}

	/**
	 * @return the xsfNsrsbh
	 */
	public String getXsfNsrsbh() {
		return xsfNsrsbh;
	}

	/**
	 * @param xsfNsrsbh the xsfNsrsbh to set
	 */
	public void setXsfNsrsbh(String xsfNsrsbh) {
		this.xsfNsrsbh = trim(xsfNsrsbh);
	}

	/**
	 * @return the xsfMc
	 */
	public String getXsfMc() {
		return xsfMc;
	}

	/**
	 * @param xsfMc the xsfMc to set
	 */
	public void setXsfMc(String xsfMc) {
		this.xsfMc = trim(xsfMc);
	}

	/**
	 * @return the xsfDzdh
	 */
	public String getXsfDzdh() {
		return xsfDzdh;
	}

	/**
	 * @param xsfDzdh the xsfDzdh to set
	 */
	public void setXsfDzdh(String xsfDzdh) {
		this.xsfDzdh = trim(xsfDzdh);
	}

	/**
	 * @return the xsfYhzh
	 */
	public String getXsfYhzh() {
		return xsfYhzh;
	}

	/**
	 * @param xsfYhzh the xsfYhzh to set
	 */
	public void setXsfYhzh(String xsfYhzh) {
		this.xsfYhzh = trim(xsfYhzh);
	}

	/**
	 * @return the yfpDm
	 */
	public String getYfpDm() {
		return yfpDm;
	}

	/**
	 * @param yfpDm the yfpDm to set
	 */
	public void setYfpDm(String yfpDm) {
		this.yfpDm = trim(yfpDm);
	}

	/**
	 * @return the yfpHm
	 */
	public String getYfpHm() {
		return yfpHm;
	}

	/**
	 * @param yfpHm the yfpHm to set
	 */
	public void setYfpHm(String yfpHm) {
		this.yfpHm = trim(yfpHm);
	}

	/**
	 * @return the jshj
	 */
	public BigDecimal getJshj() {
		return jshj;
	}

	/**
	 * @param jshj the jshj to set
	 */
	public void setJshj(BigDecimal jshj) {
		this.jshj = jshj;
	}

	/**
	 * @return the bz
	 */
	public String getBz() {
		return bz;
	}

	/**
	 * @param bz the bz to set
	 */
	public void setBz(String bz) {
		this.bz = trim(bz);
	}

	/**
	 * @return the sfkjhzfp
	 */
	public String getSfkjhzfp() {
		return sfkjhzfp;
	}

	/**
	 * @param sfkjhzfp the sfkjhzfp to set
	 */
	public void setSfkjhzfp(String sfkjhzfp) {
		this.sfkjhzfp = sfkjhzfp;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = trim(userId);
	}

	/**
	 * @return the swjgdm
	 */
	public String getSwjgdm() {
		return swjgdm;
	}

	/**
	 * @param swjgdm the swjgdm to set
	 */
	public void setSwjgdm(String swjgdm) {
		this.swjgdm = swjgdm;
	}

	public String getResBz() {
		return resBz;
	}

	public void setResBz(String resBz) {
		this.resBz = trim(resBz);
	}

	public String getImageFlag() {
		return imageFlag;
	}

	public void setImageFlag(String imageFlag) {
		this.imageFlag = trim(imageFlag);
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = trim(sendType);
	}

	public String getMailFlag() {
		return mailFlag;
	}

	public void setMailFlag(String mailFlag) {
		this.mailFlag = trim(mailFlag);
	}
}
