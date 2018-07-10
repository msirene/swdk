package work.hang.dk.framework.bean.co.jinsan;

import work.hang.dk.framework.bean.BaseBean;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
public class FPPzhdxxVO extends BaseBean implements Comparable<FPPzhdxxVO> {

	private static final long serialVersionUID = -3778224569602792697L;

	/**
	 * 数据归属地区
	 */
	private String sjgsdq;

	/**
	 * 单份发票最高开票限额
	 */
	private String dffpzgkpxe;

	/**
	 * 单份发票最高开票限额代码
	 */
	private String dffpzgkpxeDm;

	/**
	 * 发票种类代码
	 */
	private String fpzlDm;

	/**
	 * 登记序号
	 */
	private String djxh;

	/**
	 * 有效期起
	 */
	private String yxqq;

	/**
	 * 持票最高数量
	 */
	private String cpzgsl;

	/**
	 * 委托代开标志
	 */
	private String wtdkbz;

	/**
	 * 每次最高购票数量
	 */
	private String mczggpsl;

	/**
	 * 每月最高购票数量
	 */
	private String myzggpsl;

	/**
	 * 发票购票方式代码
	 */
	private String fpgpfsDm;

	/**
	 * 录入人代码
	 */
	private String lrrDm;

	/**
	 * 票种清册UUID
	 */
	private String hdqcuuid;

	/**
	 * 修改人代码
	 */
	private String xgrDm;

	/**
	 * 税务机关代码
	 */
	private String swjgDm;

	/**
	 * 有效标志
	 */
	private String yxbz;

	/**
	 * 有效期止
	 */
	private String yxqz;

	/**
	 * 发票开具方式代码
	 */
	private String fpkjfsDm;

	/**
	 * 可领购数量
	 */
	private String klgsl;

	/**
	 * 发票类别名称
	 */
	private String fplbmc;

	/**
	 * jebDm
	 */
	private String jebDm;

	/**
	 * 发票类别代码
	 */
	private String fplbDm;

	/**
	 * 专票票种代码
	 */
	private String zppzDm;
	/**
	 * 发票种类名称
	 */
	private String fpzlmc;

	/**
	 * 计量单位代码
	 */
	private String jldwDm;

	/**
	 *
	 */
	private String defpxebz;

	/**
	 * 定额发票标志
	 */
	private String defpbz;

	/**
	 * 税控标志
	 */
	private String skbz;

	/**
	 * 特定行业代码
	 */
	private String tdhyDm;

	/**
	 * 核定日期
	 */
	private String hdrqxx;

	/**
	 * @return the klgsl
	 */
	public String getKlgsl() {
		return klgsl;
	}
	/**
	 * @param klgsl the klgsl to set
	 */
	public void setKlgsl(String klgsl) {
		this.klgsl = klgsl;
	}
	/**
	 * @return the fplbmc
	 */
	public String getFplbmc() {
		return fplbmc;
	}
	/**
	 * @param fplbmc the fplbmc to set
	 */
	public void setFplbmc(String fplbmc) {
		this.fplbmc = fplbmc;
	}
	/**
	 * @return the jebDm
	 */
	public String getJebDm() {
		return jebDm;
	}
	/**
	 * @param jebDm the jebDm to set
	 */
	public void setJebDm(String jebDm) {
		this.jebDm = jebDm;
	}
	/**
	 * @return the fplbDm
	 */
	public String getFplbDm() {
		return fplbDm;
	}
	/**
	 * @param fplbDm the fplbDm to set
	 */
	public void setFplbDm(String fplbDm) {
		this.fplbDm = fplbDm;
	}
	/**
	 * @return the zppzDm
	 */
	public String getZppzDm() {
		return zppzDm;
	}
	/**
	 * @param zppzDm the zppzDm to set
	 */
	public void setZppzDm(String zppzDm) {
		this.zppzDm = zppzDm;
	}
	/**
	 * @return the fpzlmc
	 */
	public String getFpzlmc() {
		return fpzlmc;
	}
	/**
	 * @param fpzlmc the fpzlmc to set
	 */
	public void setFpzlmc(String fpzlmc) {
		this.fpzlmc = fpzlmc;
	}
	/**
	 * @return the jldwDm
	 */
	public String getJldwDm() {
		return jldwDm;
	}
	/**
	 * @param jldwDm the jldwDm to set
	 */
	public void setJldwDm(String jldwDm) {
		this.jldwDm = jldwDm;
	}
	/**
	 * @return the defpxebz
	 */
	public String getDefpxebz() {
		return defpxebz;
	}
	/**
	 * @param defpxebz the defpxebz to set
	 */
	public void setDefpxebz(String defpxebz) {
		this.defpxebz = defpxebz;
	}
	/**
	 * @return the defpbz
	 */
	public String getDefpbz() {
		return defpbz;
	}
	/**
	 * @param defpbz the defpbz to set
	 */
	public void setDefpbz(String defpbz) {
		this.defpbz = defpbz;
	}
	/**
	 * @return the skbz
	 */
	public String getSkbz() {
		return skbz;
	}
	/**
	 * @param skbz the skbz to set
	 */
	public void setSkbz(String skbz) {
		this.skbz = skbz;
	}
	/**
	 * @return the tdhyDm
	 */
	public String getTdhyDm() {
		return tdhyDm;
	}
	/**
	 * @param tdhyDm the tdhyDm to set
	 */
	public void setTdhyDm(String tdhyDm) {
		this.tdhyDm = tdhyDm;
	}
	/**
	 * @return the hdrqxx
	 */
	public String getHdrqxx() {
		return hdrqxx;
	}
	/**
	 * @param hdrqxx the hdrqxx to set
	 */
	public void setHdrqxx(String hdrqxx) {
		this.hdrqxx = hdrqxx;
	}
	/**
	 * @return the sjgsdq
	 */
	public String getSjgsdq() {
		return sjgsdq;
	}
	/**
	 * @param sjgsdq the sjgsdq to set
	 */
	public void setSjgsdq(String sjgsdq) {
		this.sjgsdq = sjgsdq;
	}
	/**
	 * @return the dffpzgkpxe
	 */
	public String getDffpzgkpxe() {
		return dffpzgkpxe;
	}
	/**
	 * @param dffpzgkpxe the dffpzgkpxe to set
	 */
	public void setDffpzgkpxe(String dffpzgkpxe) {
		this.dffpzgkpxe = dffpzgkpxe;
	}
	/**
	 * @return the dffpzgkpxeDm
	 */
	public String getDffpzgkpxeDm() {
		return dffpzgkpxeDm;
	}
	/**
	 * @param dffpzgkpxeDm the dffpzgkpxeDm to set
	 */
	public void setDffpzgkpxeDm(String dffpzgkpxeDm) {
		this.dffpzgkpxeDm = dffpzgkpxeDm;
	}
	/**
	 * @return the fpzlDm
	 */
	public String getFpzlDm() {
		return fpzlDm;
	}
	/**
	 * @param fpzlDm the fpzlDm to set
	 */
	public void setFpzlDm(String fpzlDm) {
		this.fpzlDm = fpzlDm;
	}
	/**
	 * @return the djxh
	 */
	public String getDjxh() {
		return djxh;
	}
	/**
	 * @param djxh the djxh to set
	 */
	public void setDjxh(String djxh) {
		this.djxh = djxh;
	}
	/**
	 * @return the yxqq
	 */
	public String getYxqq() {
		return yxqq;
	}
	/**
	 * @param yxqq the yxqq to set
	 */
	public void setYxqq(String yxqq) {
		this.yxqq = yxqq;
	}
	/**
	 * @return the cpzgsl
	 */
	public String getCpzgsl() {
		return cpzgsl;
	}
	/**
	 * @param cpzgsl the cpzgsl to set
	 */
	public void setCpzgsl(String cpzgsl) {
		this.cpzgsl = cpzgsl;
	}
	/**
	 * @return the wtdkbz
	 */
	public String getWtdkbz() {
		return wtdkbz;
	}
	/**
	 * @param wtdkbz the wtdkbz to set
	 */
	public void setWtdkbz(String wtdkbz) {
		this.wtdkbz = wtdkbz;
	}
	/**
	 * @return the mczggpsl
	 */
	public String getMczggpsl() {
		return mczggpsl;
	}
	/**
	 * @param mczggpsl the mczggpsl to set
	 */
	public void setMczggpsl(String mczggpsl) {
		this.mczggpsl = mczggpsl;
	}
	/**
	 * @return the myzggpsl
	 */
	public String getMyzggpsl() {
		return myzggpsl;
	}
	/**
	 * @param myzggpsl the myzggpsl to set
	 */
	public void setMyzggpsl(String myzggpsl) {
		this.myzggpsl = myzggpsl;
	}
	/**
	 * @return the fpgpfsDm
	 */
	public String getFpgpfsDm() {
		return fpgpfsDm;
	}
	/**
	 * @param fpgpfsDm the fpgpfsDm to set
	 */
	public void setFpgpfsDm(String fpgpfsDm) {
		this.fpgpfsDm = fpgpfsDm;
	}
	/**
	 * @return the lrrDm
	 */
	public String getLrrDm() {
		return lrrDm;
	}
	/**
	 * @param lrrDm the lrrDm to set
	 */
	public void setLrrDm(String lrrDm) {
		this.lrrDm = lrrDm;
	}
	/**
	 * @return the hdqcuuid
	 */
	public String getHdqcuuid() {
		return hdqcuuid;
	}
	/**
	 * @param hdqcuuid the hdqcuuid to set
	 */
	public void setHdqcuuid(String hdqcuuid) {
		this.hdqcuuid = hdqcuuid;
	}
	/**
	 * @return the xgrDm
	 */
	public String getXgrDm() {
		return xgrDm;
	}
	/**
	 * @param xgrDm the xgrDm to set
	 */
	public void setXgrDm(String xgrDm) {
		this.xgrDm = xgrDm;
	}
	/**
	 * @return the swjgDm
	 */
	public String getSwjgDm() {
		return swjgDm;
	}
	/**
	 * @param swjgDm the swjgDm to set
	 */
	public void setSwjgDm(String swjgDm) {
		this.swjgDm = swjgDm;
	}
	/**
	 * @return the yxbz
	 */
	public String getYxbz() {
		return yxbz;
	}
	/**
	 * @param yxbz the yxbz to set
	 */
	public void setYxbz(String yxbz) {
		this.yxbz = yxbz;
	}
	/**
	 * @return the yxqz
	 */
	public String getYxqz() {
		return yxqz;
	}
	/**
	 * @param yxqz the yxqz to set
	 */
	public void setYxqz(String yxqz) {
		this.yxqz = yxqz;
	}
	/**
	 * @return the fpkjfsDm
	 */
	public String getFpkjfsDm() {
		return fpkjfsDm;
	}
	/**
	 * @param fpkjfsDm the fpkjfsDm to set
	 */
	public void setFpkjfsDm(String fpkjfsDm) {
		this.fpkjfsDm = fpkjfsDm;
	}


	@Override
	public int compareTo(FPPzhdxxVO o) {
		return o.getHdrqxx().compareTo(this.getHdrqxx());
	}
}
