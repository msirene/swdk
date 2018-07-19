package work.hang.dk.cache;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/7/17
 */
@Component("redisService")
public class RedisService<T> {

	@Resource
	private RedisTemplate<String, T> redisTemplate;

	@Resource(name = "redisTemplate")
	private ListOperations<String, T> listOperations;

	@Resource(name = "redisTemplate")
	private ValueOperations<String, T> valueOperations;

	@Resource(name = "redisTemplate")
	private HashOperations<String, String, T> hashOperations;

	public void del(String key) {
		redisTemplate.delete(key);
	}

	public boolean containsKey(String key) {
		return redisTemplate.hasKey(key);
	}

	public boolean expire(String key, long timeout) {
		return redisTemplate.expire(key, timeout, TimeUnit.MILLISECONDS);
	}

	public long getExpire(String key) {
		return redisTemplate.getExpire(key, TimeUnit.MILLISECONDS);
	}

//	public Set<String> keys(String pattern) {
//	    Set<String> keys = redisTemplate.keys(pattern);
//	    return keys;
//	}

	public void publishMessage(String channel, Serializable message) {
		redisTemplate.convertAndSend(channel, message);
	}

	public Object get(String key) {
		return valueOperations.get(key);
	}

	public void set(String key, T obj) {
		valueOperations.set(key, obj);
	}

	public void set(String key, T obj, long timeout) {
		valueOperations.set(key, obj, timeout, TimeUnit.MILLISECONDS);
	}

	public long lpush(String listName, T value) {
		return listOperations.leftPush(listName, value);
	}

	public long lpushAll(String listName, T... value) {
		return listOperations.leftPushAll(listName, value);
	}

	public Object rpop(String listName) {
		return listOperations.rightPop(listName);
	}

	public long listSize(String listName) {
		return listOperations.size(listName);
	}

	//public <T> void hset(String key, Map<String, Object> map) {
	//	hashOperations.putAll(key, map);
	//}

	public T hget(String key, Object hashKey) {
		//HV get(H var1, Object var2);
		return hashOperations.get(key, hashKey);
	}

	public Map<String, T> hget(String key) {
		return hashOperations.entries(key);
	}
}
