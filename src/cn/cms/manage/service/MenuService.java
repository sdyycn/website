package cn.cms.manage.service;

import cn.cms.dao.MenuDao;
import cn.cms.dao.entity.Menu;

public class MenuService {
	private String errorMessage = null;
	private Object result = null;
	private MenuDao dao = null;
	public void setDao(MenuDao dao){
		this.dao = dao;
	}
	public MenuDao getDao(){
		return dao;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	public Object getResult(){
		return result;
	}

	public int get(String uid){
		try{
			if (uid == null){
				result = dao.findAll();
			} else {
				result = dao.findById(uid);
			}
		} catch (Exception e){
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public int add(Menu a){
		try{
			dao.save(a);
		} catch(Exception e){
			e.printStackTrace();
			errorMessage = "menu DAO error!";
			return -1;
		}
		
		return 0;
	}
	
	public int modify(Menu a){
		try{
			dao.update(a);
		} catch (Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	public int delete(String uid){
		try{
			dao.delete(uid);
		} catch(Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
}
