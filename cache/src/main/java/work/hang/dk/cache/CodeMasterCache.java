package work.hang.dk.cache;

import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.bean.TCodeInvoiceItemBean;
import work.hang.dk.framework.exception.BusinessException;
import work.hang.dk.framework.exception.UnexpectedException;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 * 代码表相关的缓存操作
 * @author 六哥
 * @date 2018/7/17
 */
public interface CodeMasterCache {

	/**
	 *
	 * [概 要]获取原始的开票项目代码表信息（不包括'扩展的'开票项目）
	 * @param parameter
	 * @return RemoteParameter<TCodeInvoiceItemBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<TCodeInvoiceItemBean> getCodeItem(RemoteParameter<TCodeInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;

	/**
	 *
	 * [概 要]根据ID查询某一项开票项目
	 * @param parameter
	 * @return RemoteParameter<TCodeInvoiceItemBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<TCodeInvoiceItemBean> getPreferenceItemById(RemoteParameter<TCodeInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;

	/**
	 *
	 * [概 要]获取税局指定的开票项目（包括'扩展的'开票项目）<br/>
	 * 附带分页查询功能
	 * @param parameter
	 * @return RemoteParameter<TCodeInvoiceItemBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<TCodeInvoiceItemBean> getCodeItemByIsPreference(RemoteParameter<TCodeInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;

	/**
	 *
	 * [概 要]验证某项开票项目是否已经被税局取消
	 * @param parameter
	 * @return RemoteParameter<TCodeInvoiceItemBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<TCodeInvoiceItemBean> isValidPreferenceItem(RemoteParameter<TCodeInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;
//	/**
//	 *
//	 * [概 要]获取税局指定的常用服务项目
//	 * @param RemoteParameter<TCodeInvoiceItemBean> parameter
//	 * @return RemoteParameter<TPreferenceInvoiceItemBean>
//	 * @throws BusinessException
//	 * @throws UnexpectedException
//	 */
//	public RemoteParameter<TPreferenceInvoiceItemBean> getDefaultPreferenceItem(RemoteParameter<TPreferenceInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;
//	/**
//	 *
//	 * [概 要]获取税局指定的商品归集项目
//	 * @param RemoteParameter<TCodeInvoiceItemBean> parameter
//	 * @return RemoteParameter<TCodeInvoiceItemBean>
//	 * @throws BusinessException
//	 * @throws UnexpectedException
//	 */
//	public RemoteParameter<TCodeInvoiceItemBean> getCodeItemByIsCommodity(RemoteParameter<TCodeInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;
//	/**
//	 *
//	 * [概 要]根据税收编码/服务名称模糊查询服务项目
//	 * @param RemoteParameter<TCodeInvoiceItemBean> parameter
//	 * @return RemoteParameter<TCodeInvoiceItemBean>
//	 * @throws BusinessException
//	 * @throws UnexpectedException
//	 */
//	public RemoteParameter<TCodeInvoiceItemBean> getCodeItemByLike(RemoteParameter<TCodeInvoiceItemBean> parameter)throws BusinessException, UnexpectedException;
//	/**
//	 *
//	 * [概 要] 修改常用服务项目
//	 * @param RemoteParameter<TCodeInvoiceItemBean> parameter
//	 * @return RemoteParameter<TCodeInvoiceItemBean>
//	 * @throws BusinessException
//	 * @throws UnexpectedException
//	 */
//	public RemoteParameter<TCodeInvoiceItemBean> update(RemoteParameter<List<TCodeInvoiceItemBean>> parameter) throws BusinessException,UnexpectedException;
}
