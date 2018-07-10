package work.hang.dk.framework.generator;

import work.hang.dk.framework.bean.RemoteParameter;
import work.hang.dk.framework.exception.BusinessException;

import java.rmi.UnexpectedException;

/**
 * [概 要]
 * [环 境] JAVA 1.8
 *
 * @author 六哥
 * @date 2018/6/4
 */
public interface IdCacheInterface {
	/**
	 * 批量获取主键
	 *
	 * @param parameter
	 * @return RemoteParameter<Long>
	 * @throws BusinessException
	 * @throws UnexpectedException
	 */
	RemoteParameter<Long> getTablePrimaryKey(RemoteParameter<Long> parameter) throws BusinessException, UnexpectedException;
}
