package work.hang.dk.generator;

import org.springframework.stereotype.Service;
import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.constant.CommonConstant;
import work.hang.dk.framework.exception.BusinessException;
import work.hang.dk.framework.exception.UnexpectedException;
import work.hang.dk.framework.redis.RedisService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@Service("idCache")
public class IdCacheImpl implements IdCache {
	//private Logger logger = LoggerFactory.getLogger(IdCache.class);

	@Resource
	private RedisService redisService;

	private ReadWriteLock lock;

	public IdCacheImpl() {
		lock = new ReentrantReadWriteLock();
	}

	@Override
	public RemoteParameter<Long> getTablePrimaryKey(RemoteParameter<Long> parameter)
			throws BusinessException, UnexpectedException {
		try {
			lock.readLock().lock();
			long num = Long.valueOf(ResourceBundle.getBundle("it/config/common").getString("primary.key.consume.num"));
			List<Long> res = new ArrayList<>();
			//Long id = null;
			for (int i = 0; i < num; i++) {
				Long id = (Long) redisService.rpop(CommonConstant.PRIMARY_KEY_QUEUE);
				// 确保返回结果里面没有null
				if (id == null) {
					break;
				}
				res.add(id);
			}
			parameter.success("");
			parameter.setData(res);
		} catch (Exception e) {
			parameter.fail(e.getMessage());
			//logger.error("获取主键失败！", e);
		} finally {
			lock.readLock().unlock();
		}
		return parameter;
	}
}
