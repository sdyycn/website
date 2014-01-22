package cn.cms.dao;

import java.util.List;

public interface IDao {
	void save(Object a);
	void update(Object a);
	void delete(Object a);
	
	@SuppressWarnings("rawtypes")
	List find(String hql);
	@SuppressWarnings("rawtypes")
	List find(String hql, Object value);
	@SuppressWarnings("rawtypes")
	List find(String hql, Object[] values);
}
