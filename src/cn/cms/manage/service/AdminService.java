package cn.cms.manage.service;

import cn.cms.dao.AdminDao;
import cn.cms.dao.entity.Admin;

public class AdminService {
	private String errorMessage = null;
	private Object result = null;
	private AdminDao dao = null;
	public void setDao(AdminDao dao){
		this.dao = dao;
	}
	public AdminDao getDao(){
		return dao;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	public Object getResult(){
		return result;
	}
	
	public int login(String uid, String pwd){
		if (dao == null){
			System.out.println("adminDao == null.");
		}
		try{
			Admin a = dao.findByUidAndPwd(uid, pwd);
			result = a.getName();
		} catch (Exception e){
			e.printStackTrace();
			errorMessage = "find user error!";
			return -1;
		}
		return 0;
	}
	
	public int addAdminTest(String uid, String pwd, String email){
		try{
			Admin a = new Admin();
			a.setName(uid);
			a.setPwd(pwd);
			a.setEmail(email);
			a.setGid(1);
			a.setDescription("测试添加用户!");
			dao.save(a);
			result = a.getUid();
		} catch (Exception e){
			e.printStackTrace();
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
	
	public int add(Admin a){
		try{
			dao.save(a);
		} catch(Exception e){
			e.printStackTrace();
			errorMessage = "admin DAO error!";
			return -1;
		}
		
		return 0;
	}
	
	public int modify(Admin a){
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
