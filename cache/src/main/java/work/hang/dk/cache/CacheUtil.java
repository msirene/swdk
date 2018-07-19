package work.hang.dk.cache;

import work.hang.dk.framework.bean.CacheBean;
import work.hang.dk.framework.bean.RemoteParameter;

import java.util.Map;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/17
 */
public final class CacheUtil {
	public static void cache(CommonCache commonCache, String sn, String key, Object value, Long expire) {
		CacheBean cache = new CacheBean();
		cache.setKey(key);
		cache.setValue(value);
		if (null != expire) {
			cache.setExpire(expire);
		}
		RemoteParameter<CacheBean> cacheParam = new RemoteParameter<>(sn, cache);
		commonCache.setCommonCache(cacheParam);
	}

	public static void del(CommonCache commonCache, String sn, String key) {
		CacheBean cache = new CacheBean();
		cache.setKey(key);
		RemoteParameter<CacheBean> cacheParam = new RemoteParameter<>(sn, cache);
		commonCache.deleteCommonCache(cacheParam);
	}

	public static boolean containsKey(CommonCache commonCache, String sn, String key) {
		CacheBean cache = new CacheBean();
		cache.setKey(key);
		RemoteParameter<CacheBean> cacheParam = new RemoteParameter<>(sn, cache);
		cacheParam = commonCache.containsKey(cacheParam);
		return cacheParam.isSuccess();
	}

	public static CacheBean get(CommonCache commonCache, String sn, String key) {
		return get(commonCache, sn, key, false);
	}

	public static CacheBean get(CommonCache commonCache, String sn, String key, boolean isDelete) {
		CacheBean cache = new CacheBean();
		cache.setKey(key);
		cache.setDelete(isDelete);
		RemoteParameter<CacheBean> cacheParam = new RemoteParameter<>(sn, cache);
		cacheParam = commonCache.getCommonCache(cacheParam);
		if (!cacheParam.isSuccess()) {
			return null;
		} else {
			return cacheParam.getData().get(0);
		}
	}

	public static CacheBean hget(CommonCache commonCache, String sn, String key, String hashKey) {
		CacheBean cache = new CacheBean();
		cache.setKey(key);
		cache.setHashKey(hashKey);
		RemoteParameter<CacheBean> cacheParam = new RemoteParameter<>(sn, cache);
		cacheParam = commonCache.hget(cacheParam);
		if (!cacheParam.isSuccess()) {
			return null;
		} else {
			return cacheParam.getData().get(0);
		}
	}

	public static void hset(CommonCache commonCache, String sn, String key, Map<String, Object> hashValue) {
		CacheBean cache = new CacheBean();
		cache.setKey(key);
		cache.setValue(hashValue);
		RemoteParameter<CacheBean> cacheParam = new RemoteParameter<>(sn, cache);
		commonCache.hset(cacheParam);
	}
}
