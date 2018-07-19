package work.hang.dk.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.bean.TCodeInvoiceItemBean;
import work.hang.dk.framework.constant.CommonConstant;
import work.hang.dk.framework.exception.BusinessException;
import work.hang.dk.framework.exception.UnexpectedException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/17
 */
@Slf4j
@Service("codeMasterCache")
public class CodeMasterCacheImpl implements CodeMasterCache {

	//private Logger logger = LoggerFactory.getLogger(CommonCache.class);
	@Resource
	private RedisService redisService;

	@Override
	public RemoteParameter<TCodeInvoiceItemBean> getCodeItem(RemoteParameter<TCodeInvoiceItemBean> parameter) throws BusinessException, UnexpectedException {
		try {
			//Map<String, TCodeInvoiceItemBean> entityMap = redisService.get(CommonConstant.CODE_MASTER_ITEM_MAPPING);
			Map<String, TCodeInvoiceItemBean> entityMap = new HashMap<>(1);
			if (null == entityMap || entityMap.isEmpty()) {
				parameter.fail("");
				return parameter;
			}
			List<TCodeInvoiceItemBean> res = this.screen(entityMap, parameter.getParam());
			parameter.success("");
			parameter.addData(res);
			return parameter;
		} catch (Exception e) {
			log.error("获取服务项目时发生异常！", e);
			throw new UnexpectedException("获取服务项目时发生异常！", e);
		}
	}

	private List<TCodeInvoiceItemBean> screen(Map<String, TCodeInvoiceItemBean> rawMap, TCodeInvoiceItemBean parameter) {
		List<TCodeInvoiceItemBean> res = new ArrayList<>();
		if (parameter == null) {
			log.debug("fetch all");
			for (String key : rawMap.keySet()) {
				res.add(rawMap.get(key));
			}
			log.debug("number of records is : {}", res.size());
		} else {
			String id = parameter.getId();
			String name = parameter.getName();
			String baseId = parameter.getBaseId();
			log.debug("fetch by condition,id:{}-name:{}-baseId:{}", id, name, baseId);
			// 按ID查询
			if (StringUtils.isNotBlank(id)) {
				id = id.trim();
				for (String key : rawMap.keySet()) {
					if (Long.valueOf(CommonConstant.FLAG_ON).equals(rawMap.get(key).getFjbz())
							&& rawMap.get(key).getId().contains(id)) {
						res.add(rawMap.get(key));
					}
				}
			} else if (StringUtils.isNotBlank(name)) {
				// 按名称查询
				String[] conditions = name.trim().split(CommonConstant.BLANK);
				for (String key : rawMap.keySet()) {
					if (Long.valueOf(CommonConstant.FLAG_ON).equals(rawMap.get(key).getFjbz())
//							&& rawMap.get(key).getName().contains(name) 改为多条件的模糊查询
							&& this.contains(rawMap.get(key).getName(), conditions, 0)) {
						res.add(rawMap.get(key));
					}
				}
			} else if (StringUtils.isNotBlank(baseId)) {
				// 按baseId查
				for (String key : rawMap.keySet()) {
					if (Long.valueOf(CommonConstant.FLAG_ON).equals(rawMap.get(key).getFjbz())
							&& rawMap.get(key).getBaseId().equals(baseId)) {
						res.add(rawMap.get(key));
					}
				}
			} else {
				for (String key : rawMap.keySet()) {
					res.add(rawMap.get(key));
				}
			}
		}
		return res;
	}

	private List<TCodeInvoiceItemBean> paging(List<TCodeInvoiceItemBean> rawList, TCodeInvoiceItemBean parameter) {
		if (null != parameter
				&& null != parameter.getPageIndex()
				&& null != parameter.getPageSize()
				&& parameter.getPageIndex() >= 1
				&& parameter.getPageSize() >= 1) {
			int start = (parameter.getPageIndex() - 1) * parameter.getPageSize();
			int end = parameter.getPageIndex() * parameter.getPageSize();
			if (end > rawList.size()) {
				end = rawList.size();
			}
			log.debug("size:{},start:{},end:{}", rawList.size(), start, end);
			if (start > rawList.size()) {
				rawList.clear();
			} else {
				rawList = rawList.subList(start, end);
			}
		} else {
			// do nothing
			log.debug("no paging");
		}
		log.debug("date size:{}", rawList.size());
		return rawList;
	}

	@Override
	public RemoteParameter<TCodeInvoiceItemBean> getCodeItemByIsPreference(
			RemoteParameter<TCodeInvoiceItemBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			//Map<String, TCodeInvoiceItemBean> entityMap = redisService.get(CommonConstant.CODE_MASTER_PREFERENCE_ITEM_MAPPING);
			Map<String, TCodeInvoiceItemBean> entityMap = new HashMap<>(1);
			if (null == entityMap || entityMap.isEmpty()) {
				parameter.fail("");
				return parameter;
			}
			List<TCodeInvoiceItemBean> res = this.screen(entityMap, parameter.getParam());
			parameter.setTotalCount(res.size());
			parameter.setPageSize(parameter.getParam().getPageSize());
			res = this.paging(res, parameter.getParam());
			log.debug("after paging, data size is : {}", res.size());
			parameter.success("");
			parameter.addData(res);
			return parameter;
		} catch (Exception e) {
			log.error("获取常用服务项目时发生异常！", e);
			throw new UnexpectedException("获取常用服务项目时发生异常！", e);
		}
	}

	/**
	 * 判断是否包含全部查询条件
	 *
	 * @param target
	 * @param conditions
	 * @param index
	 * @return
	 */
	private boolean contains(String target, String[] conditions, int index) {
		if (index >= conditions.length) {
			return true;
		}
		if (CommonConstant.EMPTY.equals(conditions[index])) {
			return true;
		}
		if (target.contains(conditions[index])) {
			index++;
			// 递归
			return contains(target, conditions, index);
		} else {
			return false;
		}
	}

	@Override
	public RemoteParameter<TCodeInvoiceItemBean> getPreferenceItemById(RemoteParameter<TCodeInvoiceItemBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			//Map<String, TCodeInvoiceItemBean> entityMap = redisService.get(CommonConstant.CODE_MASTER_PREFERENCE_ITEM_MAPPING);
			Map<String, TCodeInvoiceItemBean> entityMap = new HashMap<>(1);
			if (null == entityMap || entityMap.isEmpty()) {
				parameter.fail("");
				return parameter;
			}
			TCodeInvoiceItemBean item = entityMap.get(parameter.getParam().getBaseId());
			if (null == item) {
				parameter.fail("");
				return parameter;
			}
			parameter.success("");
			parameter.addData(item);
			return parameter;
		} catch (Exception e) {
			log.error("获取服务项目时发生异常！", e);
			throw new UnexpectedException("获取服务项目时发生异常！", e);
		}
	}

	@Override
	public RemoteParameter<TCodeInvoiceItemBean> isValidPreferenceItem(
			RemoteParameter<TCodeInvoiceItemBean> parameter) throws BusinessException, UnexpectedException {
		try {
			//Map<String, TCodeInvoiceItemBean> entityMap = redisService.get(CommonConstant.CODE_MASTER_PREFERENCE_ITEM_MAPPING);
			Map<String, TCodeInvoiceItemBean> entityMap = new HashMap<>(1);
			if (null == entityMap || entityMap.isEmpty()) {
				parameter.fail("");
				return parameter;
			}
			boolean result = entityMap.containsKey(parameter.getParam().getBaseId());
			if (!result) {
				parameter.fail("");
			} else {
				parameter.success("");
			}
			return parameter;
		} catch (Exception e) {
			log.error("验证某项开票项目有效性时发生异常！", e);
			throw new UnexpectedException("验证某项开票项目有效性时发生异常！", e);
		}
	}
}
