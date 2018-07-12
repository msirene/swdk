package work.hang.dk.framework.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/10
 */
@Component("redisService")
public class RedisService {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;

	public void del(String key) {
		redisTemplate.delete(key);
	}

	public boolean containsKey(String key) {
		return redisTemplate.hasKey(key);
	}

	@Resource(name = "redisTemplate")
	private ValueOperations<String, Object> valueOperations;

	public <T> Object get(String key) {
		return valueOperations.get(key);
	}

	public <T> void set(String key, T obj) {
		valueOperations.set(key, obj);
	}

	public <T> void set(String key, T obj, long empire) {
		valueOperations.set(key, obj, empire, TimeUnit.MILLISECONDS);
	}

	public long lpush(String listName, Object value) {
		return redisTemplate.opsForList().leftPush(listName, value);
	}

	public long lpushAll(String listName, List<?> value) {
		return redisTemplate.opsForList().leftPushAll(listName, value);
	}

	public Object rpop(String listName) {
		return redisTemplate.opsForList().rightPop(listName);
	}

	public long listSize(String listName) {
		return redisTemplate.opsForList().size(listName);
	}

	public Set<String> keys(String pattern) {
		return redisTemplate.keys(pattern);
	}
}
