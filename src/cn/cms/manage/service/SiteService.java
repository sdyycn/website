package cn.cms.manage.service;

import cn.cms.dao.SiteDao;
import cn.cms.dao.entity.Site;

public class SiteService {
	private String errorMessage = null;
	private Object result = null;
	private SiteDao dao = null;
	public void setDao(SiteDao dao){
		this.dao = dao;
	}
	public SiteDao getDao(){
		return dao;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	public Object getResult(){
		return result;
	}
	
	public int setProperty(String key, String value, String description){
		return 0;
	}
	
	public int setProperty(String key, String value){
		try{
			Site a = dao.findByKey(key);
			a.setValue(value);
			dao.update(a);
		}catch (Exception e){
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public String getProperty(String key){
		try{
			Site a = dao.findByKey(key);
			return a.getValue();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
