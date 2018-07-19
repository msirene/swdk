package work.hang.dk.cache;

import work.hang.dk.framework.bean.CacheBean;
import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.exception.BusinessException;
import work.hang.dk.framework.exception.UnexpectedException;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 * 通用缓存操作
 * @author 六哥
 * @date 2018/7/17
 */
public interface CommonCache {
	/**
	 * [概 要] 缓存一条数据
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> setCommonCache(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 删除一条缓存数据
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> deleteCommonCache(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 获取一条缓存数据
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> getCommonCache(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 检查某个key是否存在
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> containsKey(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 联动请求入队列
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> push(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 更新过期时间
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> expire(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 发布主题
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> publish(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 获取缓存的一条hash数据
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> hget(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;

	/**
	 * [概 要] 缓存的一条hash数据
	 *
	 * @param parameter
	 * @return RemoteParameter<CacheBean>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<CacheBean> hset(RemoteParameter<CacheBean> parameter) throws BusinessException, UnexpectedException;
}
