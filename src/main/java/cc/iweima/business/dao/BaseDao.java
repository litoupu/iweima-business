package cc.iweima.business.dao;

import java.util.List;

/**
 * 封装基本的增删改查方法的dao接口
 * 
 * @created 2014年12月8日
 * @author  chenshanfu
 */
public interface BaseDao<T> {
	
	 /**
	  * 插入一条记录，返回新增对象ID
	  * 
	  * @param obj
	  * @return
	  * @created 2014年12月8日
	  * @author  chenshanfu
	  */
	public Long insert(T obj) ;
	
	/**
	 * 根据ID删除一条对象
	 * 
	 * @param id
	 * @created 2014年12月8日
	 * @author  chenshanfu
	 */
	public void delete(Long id);
	
	/**
	 * 修改一条对象
	 * 
	 * @param obj
	 * @created 2014年12月8日
	 * @author  chenshanfu
	 */
	public void update(T obj) ;
	
	/**
	 * 根据ID查询一个对象
	 * 
	 * @param id
	 * @return
	 * @created 2014年12月8日
	 * @author  chenshanfu
	 */
	public T select(Long id) ;
	/**
	 * 
	 * 
	 * @return
	 * @created 2014年12月8日
	 * @author  chenshanfu
	 */
	public List<T> selectAll();
}
