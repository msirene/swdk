package work.hang.dk.framework.constant.enums;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public enum ServiceXmlCategory {
	/**
	 * 根据登记序号获取纳税人状态<br/>
	 * 纳税人状态:3、非正常户（或已注销）
	 */
	SWZJ_HXZG_DJ_CXNSRZTBYDHXH(
			"根据登记序号获取纳税人状态",
			"TaxMLBw_HXZG_DJ_00205_Request_V1.0",
			"SWZJ.HXZG.DJ.CXNSRZTBYDHXH",
			"HXZG_DJ_00205",
			"HXZGDJ00205Request"),

	/**
	 * 税费种认定信息查询
	 */
	SWZJ_HXZG_RD_CXSFZRDXX(
			"税费种认定信息查询",
			"TaxMLBw_HXZG_RD_00073_Request_V1.0",
			"SWZJ.HXZG.RD.CXSFZRDXX",
			"HXZG_RD_00073",
			"HXZGRD00073Request"),

	/**
	 * 校验并提取纳税人基本信息、资格信息、已有票种核定信息、已有购票人信息，初始化发票票种核定申请业务<br/>
	 * 1、一般纳税人<br/>
	 * 2、双定户<br/>
	 * 4、增值税普通发票票种核定<br/>
	 * 5、普通发票票种核定<br/>
	 * 6、定额票票种核定
	 */
	SWZJ_HXZG_FP_CSHPZHDSQ(
			"校验并提取纳税人基本信息、资格信息、已有票种核定信息、已有购票人信息，初始化发票票种核定申请业务",
			"TaxMLBw_HXZG_FP_00000_Request_V1.0",
			"SWZJ.HXZG.FP.CSHPZHDSQ",
			"HXZG_DJ_00000",
			"HXZGFP00000Request"),

	/**
	 * 根据证件号码、证件种类获取对应法定代表人的纳税人信息
	 */
	SWZJ_HXZG_DJ_CXNSRXXSFZJHM(
			"根据证件号码、证件种类获取对应法定代表人的纳税人信息",
			"TaxMLBw_HXZG_DJ_00225_Request_V1.0",
			"SWZJ.HXZG.DJ.CXNSRXXSFZJHM",
			"HXZG_DJ_00225",
			"HXZGDJ00225Request"),

	/**
	 * 获取自然人实名核验信息
	 */
	C00_QT_PDJH_HQZRRSMRZXX(
			"获取自然人实名核验信息",
			"TaxMLBw_HXZG_GXRXX_00013_Request_V1.0",
			"C00.QT.PDJH.HQZRRSMRZXX",
			"HXZG_GXRXX_00013",
			"HXZGDJ00013Request"),

	/**
	 * 保存增值税普通发票代开申请
	 */
	SWZJ_HXZG_FP_BCDKSQZZSPTFP(
			"保存增值税普通发票代开申请",
			"TaxMLBw_HXZG_FP_15155_Request_V1.0",
			"SWZJ.HXZG.FP.BCDKSQZZSPTFP",
			"HXZG_FP_15155",
			"HXZGFP15155Request"),

	/**
	 * 获取发票结存
	 */
	SWZJ_HXZG_FP_CXNSRFPJC(
			"根据登记序号等条件查询纳税人发票结存",
			"TaxMLBw_HXZG_FP_00279_Request_V1.0",
			"SWZJ.HXZG.FP.CXNSRFPJC",
			"HXZG_FP_00279",
			"HXZGFP00279Request"),

	/**
	 * 获取发票结存
	 */
	SWZJ_HXZG_FP_KJDKFP(
			"保存发票代开开具信息",
			"TaxMLBw_HXZG_FP_10013_Request_V1.0",
			"SWZJ.HXZG.FP.KJDKFP",
			"HXZG_FP_10013",
			"HXZGFP10013Request"),

	/**
	 * 根据登记序号查询发票代开相关数据
	 */
	SWZJ_HXZG_FP_HQFPDKSJ(
			"根据登记序号查询发票代开相关数据",
			"TaxMLBw_HXZG_FP_15001_Request_V1.0",
			"SWZJ.HXZG.FP.HQFPDKSJ",
			"HXZG_FP_15001",
			"HXZGFP15001Request"),

	/**
	 * 根据代开申请唯一标识作废代开申请信息
	 */
	SWZJ_HXZG_FP_ZFDKSQ(
			"根据代开申请唯一标识作废代开申请信息",
			"TaxMLBw_HXZG_FP_10011_Request_V1.0",
			"SWZJ.HXZG.FP.ZFDKSQ",
			"HXZG_FP_10011",
			"HXZGFP10011Request");

	private String xmlmc;

	private String xmlbh;

	/**
	 * 集成服务ID
	 */
	private String tranId;

	/**
	 * XSD报文文件序号
	 */
	private String xsdId;

	private String xsiType;

	ServiceXmlCategory(String xmlmc, String xmlbh, String tranId, String xsdId, String xsiType) {
		this.xmlmc = xmlmc;
		this.xmlbh = xmlbh;
		this.tranId = tranId;
		this.xsdId = xsdId;
		this.xsiType = xsiType;
	}

	public String getXmlmc() {
		return xmlmc;
	}

	public String getXmlbh() {
		return xmlbh;
	}

	public String getTranId() {
		return tranId;
	}

	public String getXsdId() {
		return xsdId;
	}

	public String getXsiType() {
		return xsiType;
	}

	@Override
	public String toString() {
		return String.format("tranId:%s,xsdId:%s", tranId, xsdId);
	}
}
