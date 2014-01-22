package cn.cms.manage.service;

import cn.cms.dao.UserDao;
import cn.cms.dao.entity.User;

public class UserService {
	private String errorMessage = null;
	private Object result = null;
	
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	public Object getResult(){
		return result;
	}
	
	public int login(String uid, String pwd){
		if (dao == null){
			System.out.println("user == null.");
		}
		try{
			User a = dao.findByUidAndPwd(uid, pwd);
			result = a.getName();
		} catch (Exception e){
			e.printStackTrace();
			errorMessage = "find user error!";
			return -1;
		}
		return 0;
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
	
	public int add(User a){
		try{
			dao.save(a);
		} catch(Exception e){
			e.printStackTrace();
			errorMessage = "user DAO error!";
			return -1;
		}
		
		return 0;
	}
	
	public int modify(User a){
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
