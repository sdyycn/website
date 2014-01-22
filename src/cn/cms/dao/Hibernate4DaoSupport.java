package cn.cms.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate4DaoSupport implements IDao {

	public String table;
	public static final String UID = "uid";
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public Session getSession(){
	//	return sessionFactory.getCurrentSession();
		return sessionFactory.openSession();
	}

	public void save(Object a) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try {
			session = getSession();
			ts = session.beginTransaction();
			session.save(a);
			ts.commit();
		} catch (HibernateException e) {
			if (ts != null)
				ts.rollback();
			e.printStackTrace();
			throw e;
		} finally {
			session.close();
		}
	}

	public void update(Object a) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try {
			session = getSession();
			ts = session.beginTransaction();
			session.update(a);
			ts.commit();
		} catch (HibernateException e) {
			if (ts != null)
				ts.rollback();
			throw e;
		} finally {
			session.close();
		}
	}
	
	public void delete(Object a) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction ts = null;
		try {
			session = getSession();
			ts = session.beginTransaction();
			session.delete(a);
			ts.commit();
		} catch (HibernateException e) {
			if (ts != null)
				ts.rollback();
			throw e;
		} finally {
			session.close();
		}
	}
	@SuppressWarnings("rawtypes")
	public List find(String hql) {
		// TODO Auto-generated method stub
		
		return find(hql, (Object[]) null); 
	}
	
	@SuppressWarnings("rawtypes")
	public List find(String hql, Object value) {
		// TODO Auto-generated method stub
		
		return find(hql, new Object[]{value});
	}
	
	@SuppressWarnings("rawtypes")
	public List find(String hql, Object[] values) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction ts = null;
		Query query = null;
		try {
			session = getSession();
			ts = session.beginTransaction();
			query = session.createQuery(hql);
//			prepareQuery(query);
			if (values != null) {
				for (int i=0; i<values.length; i++){
					query.setParameter(i, values[i]);
				}
			}
			
			List l = query.list();
			if (l.size()>0)
				return l;
		} catch (HibernateException e) {
			if (ts != null)
				ts.rollback();
			throw e;
		} finally {
			session.close();
		}
		
		return null;
	}
}
