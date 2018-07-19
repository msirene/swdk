package work.hang.dk.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import work.hang.dk.framework.bean.CacheBean;
import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.exception.BusinessException;
import work.hang.dk.framework.exception.UnexpectedException;
import work.hang.dk.framework.util.CommonUtil;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/17
 */
@Slf4j
@Service("commonCache")
public class CommonCacheImpl implements CommonCache {
	//private Logger logger = LoggerFactory.getLogger(CommonCache.class);

	@Resource
	private RedisService redisService;

	@Override
	public RemoteParameter<CacheBean> setCommonCache(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException {
		CacheBean bean = parameter.getParam();
		try {
			if (bean.getExpire() != null && bean.getExpire().intValue() > 0) {
				redisService.set(bean.getKey(), bean.getValue(), bean.getExpire());
			} else {
				redisService.set(bean.getKey(), bean.getValue());
			}
			parameter.success("");
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("缓存一条数据失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> getCommonCache(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			CacheBean bean = parameter.getParam();
			Object value = redisService.get(bean.getKey());
			if (null == value) {
				log.debug(CommonUtil.appendSerialNumber(parameter, "key:%s NOT found", bean.getKey()));
				parameter.fail("");
			} else {
				log.debug(CommonUtil.appendSerialNumber(parameter, "key:%s found", bean.getKey()));
				parameter.success("");
				bean.setValue(value);
				bean.setExpire(redisService.getExpire(bean.getKey()));
				parameter.addData(bean);
				if (bean.isDelete()) {
					redisService.del(bean.getKey());
				}
			}
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("获取缓存数据失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> push(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			redisService.lpush(parameter.getParam().getKey(), parameter.getParam().getValue());
			parameter.success("");
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("缓存交付请求失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> deleteCommonCache(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			redisService.del(parameter.getParam().getKey());
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("删除缓存数据失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> containsKey(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			boolean b = redisService.containsKey(parameter.getParam().getKey());
			if (!b) {
				parameter.fail("key not existed");
			}
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("检查数据是否存在失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> expire(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			CacheBean bean = parameter.getParam();
			if (bean.getExpire() != null && bean.getExpire().intValue() > 0) {
				boolean b = redisService.expire(bean.getKey(), bean.getExpire());
				if (!b) {
					parameter.fail("update expire failed");
				}
			} else {
				parameter.fail("invalid time duration");
			}
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("更新过期时间失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> publish(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			redisService.publishMessage(parameter.getParam().getKey(), (Serializable) parameter.getParam().getValue());
			parameter.success("");
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("发布主题失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public RemoteParameter<CacheBean> hget(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		try {
			CacheBean bean = parameter.getParam();
			Object value = null;
			if (StringUtils.isEmpty(bean.getHashKey())) {
				//value = redisService.hget(bean.getKey());
			} else {
				value = redisService.hget(bean.getKey(), bean.getHashKey());
			}
			if (null == value) {
				log.debug(CommonUtil.appendSerialNumber(parameter, "key:%s-hashKey:%s NOT found", bean.getKey(), bean.getHashKey()));
				parameter.fail("");
			} else {
				log.debug(CommonUtil.appendSerialNumber(parameter, "key:%s-hashKey:%s found", bean.getKey(), bean.getHashKey()));
				parameter.success("");
				bean.setValue(value);
				parameter.addData(bean);
			}
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("获取数据失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}

	@Override
	public RemoteParameter<CacheBean> hset(RemoteParameter<CacheBean> parameter)
			throws BusinessException, UnexpectedException {
		CacheBean bean = parameter.getParam();
		try {
			//redisService.hset(bean.getKey(), (Map<String, Object>) bean.getValue());
			parameter.success("");
			return parameter;
		} catch (Exception e) {
			UnexpectedException ex = new UnexpectedException("缓存一条hash数据失败！", e);
			log.error(CommonUtil.appendSerialNumber(parameter, ex.getMessage()), ex);
			throw ex;
		}
	}
}
