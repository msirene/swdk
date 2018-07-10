package work.hang.dk.framework.constant;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/12
 */
public final class CommonConstant {
	public static final String HYPHEN = "-";
	public static final String UNDERLINE = "_";
	public static final String DOT = ".";
	public static final String COMMA = ",";
	public static final String SEMICOLON = ";";
	public static final String BLANK = " ";
	public static final String EMPTY = "";

	public static final String CHARSET = "UTF-8";
	public static final String SIGN_TYPE = "md5";
	public static final String DATA_TYPE = "xml";

	public static final String FLAG_ON = "1";
	public static final String FLAG_OFF = "0";

	public static final String FLAG_YES = "Y";
	public static final String FLAG_NO = "N";

	/**
	 *
	 */
	public static final String PREFERENCE_ITEM_ERROR_PATTERN = "、[%s]";

	/**
	 * 开具发票的返回代码（成功）
	 */
	public static final String INVOICE_SUCCESS = "0000";
	/**
	 * 开具发票时验证未通过
	 */
	public static final String INVOICE_DENIED = "9900";
	/**
	 * 开具发票时发生异常
	 */
	public static final String INVOICE_SYSTEM_ERROR = "9901";

	/**
	 * 缓存数据库表的主键的队列名
	 */
	public static final String PRIMARY_KEY_QUEUE = "primary_key_queue";
	///**
	// * 缓存服务项目数据
	// */
	/**
	 * 管理页面左侧菜单栏的数据
	 * class:Map<String, TCodeInvoiceItemBean>
	 */
	public static final String CODE_MASTER_ITEM_MAPPING = "code_master_item_mapping";
	/**
	 * 税局指定的所有开票项目
	 * class:Map<String, TCodeInvoiceItemBean>
	 */
	public static final String CODE_MASTER_PREFERENCE_ITEM_MAPPING = "code_master_preference_item_mapping";
	// class:Map<String, TCodeInvoiceItemBean>
//    public static final String CODE_MASTER_COMMODITY_ITEM_MAPPING="code_master_commodity_item_mapping";
//    /**
//     * APP端使用的开票项目数据
//     * class:List<TPreferenceInvoiceItemBean>
//     */
//    public static final String CODE_MASTER_DEFAULT_PREFERENCE_ITEM_MAPPING="code_master_default_preference_item_mapping";
	/**
	 * 缓存企业发票限额-月限/日限
	 */
	public static final String AMOUNT_MAPPING = "amount_mapping";
	/**
	 * 缓存发票抬头数据
	 */
	public static final String PREFIX_ORIGINAL_INVOICE = "original_invoice_%s";
	/**
	 * 开票临时token<br/>
	 * class:String<br/>
	 * P0:用户ID
	 */
	public static final String PREFIX_INVOICE_TOKEN = "invoice_token_%s";
	/**
	 * 缓存推送给电票系统的数据<br/>
	 * class:AppMessageBean<br/>
	 * P0:发票ID
	 */
	public static final String PREFIX_INVOICE = "invoice_%s";
	/**
	 * APP SOFT TOKEN<br/>
	 * class:String<br/>
	 * P0:UserId
	 */
	public static final String PREFIX_APP_SOFT_TOKEN = "app_soft_token_%s";
	/**
	 * 和税局的实名认证、征收系统进行通信的请求和结果
	 * class:CooperationBean
	 */
	public static final String COOPERATION_REQUEST_QUEUE = "cooperation_request_queue";
	public static final String COOPERATION_RESULT_TOPIC_REGISTRATION = "cooperation_result_topic_registration";
	public static final String COOPERATION_RESULT_TOPIC_ENT = "cooperation_result_topic_ent";
	public static final String COOPERATION_RESULT_TOPIC_AMOUNT = "cooperation_result_topic_amount";
	public static final String COOPERATION_RESULT_TOPIC_INVOICE = "cooperation_result_topic_invoice";
	public static final String COOPERATION_RESULT_TOPIC_SYNCHRONIZE_STATUS = "cooperation_result_topic_synchronize_status";

	/**
	 * 操作开票信息的主题<br/>
	 * class:String
	 */
	public static final String INVOICE_TITLE_TOPIC = "invoice_title_topic";

	/**
	 * 缓存注册中的所有用户名<br/>
	 * P0:用户名<br/>
	 * class:String
	 */
	public static final String PREFIX_TEMPORARY_USER_NAME = "temporary_user_name_%s";

	/**
	 * 注册流程的中间数据<br/>
	 * P0:身份证号码<br/>
	 * class:RegistrationDataBean
	 */
	public static final String PREFIX_REGISTRATION_DATA = "registration_data_%s";

	/**
	 * 企业的剩余开票额度<br/>
	 * class:String<br/>
	 * P0:企业税号<br/>
	 * P1:0→页面的请求|1→开具发票时的请求
	 */
	public static final String PREFIX_REMAIN_AMOUNT = "remain_amount_%s_%s";

	/**
	 * 税局信息(完整数据)<br/>
	 * class:TTaxBureauBean
	 * P0:税务代开码
	 */
	public static final String PREFIX_TAX_BUREAU = "tax_bureau_%s";

	/**
	 * 税局税务机关代码→代开点税务机关代码
	 * class:Map(税局税务机关代码(String),代开点税务机关代码(String))
	 */
	public static final String TAX_AGENT_MAP = "tax_agent_map";

	/**
	 * 税局信息(不包含：签章、电子证书等信息)<br/>
	 * class:Map(税局ID(String),TTaxBureauBean)
	 */
	public static final String TAX_BUREAU_MAP = "tax_bureau_map";

	/**
	 * 临时的dummy数据:企业剩余额度<br/>
	 * P0:企业税号<br/>
	 * class:String
	 */
	public static final String PREFIX_DUMMY_ENT_AMOUNT = "dummy_ent_amount_%s";

	/**
	 * 同步企业状态<br/>
	 * P0:企业法人ID
	 */
	public static final String PREFIX_REFRESH_ENT_STATUS = "refresh_ent_status_%s";
	public static final String PREFIX_REFRESH_ENT_STATUS_START = "refresh_ent_status_start_%s";


	// 同步企业数据2 开始 陈誉天 2018-02-28
	/**
	 * 验证企业状态<br/>
	 * P0:企业ID
	 */
	public static final String PREFIX_LASTEST_ENT_STATUS = "lastest_ent_status_%s";
	// 同步企业数据2 结束 陈誉天 2018-02-28

	/**
	 * 企业ID→发票抬头列表
	 * class:Map(税局税务机关代码(String),List(TInvoiceBean))
	 */
	public static final String INVOICE_TITLE_MAP = "invoice_title_map";

	// No.35 发票查询增加显示发票“开票员” 开始 陈誉天 2018-02-28
	/**
	 * 企业ID→邮箱地址
	 * class:Map(企业ID(String),邮箱地址List(String))
	 */
	public static final String INVOICE_EMAIL_MAP = "invoice_email_map";
	// No.35 发票查询增加显示发票“开票员” 结束 陈誉天 2018-02-28
}
