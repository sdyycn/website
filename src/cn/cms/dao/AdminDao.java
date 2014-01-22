package cn.cms.dao;

import java.util.List;

import cn.cms.dao.entity.Admin;

public class AdminDao extends Hibernate4DaoSupport {
	public static final String UID = "uid";
	
	public void save(Admin a){
		super.save(a);
	}
	
	public void update(Admin a){
		super.update(a);
	}
	
	public void delete(String uid){
		super.delete(findById(uid));
	}
	
	@SuppressWarnings("unchecked")
	public List<Admin> findAll(){
		return (List<Admin>)find("from Admin");
	}

	@SuppressWarnings("rawtypes")
	public Admin findById(String id){
		List l = find("from Admin a where a.uid=?", id);
		return (Admin)l.get(0);
	}
	
	@SuppressWarnings("rawtypes")
	public Admin findByUidAndPwd(String uid, String pwd){
		List l = find("from Admin a where a.uid=? and a.pwd=?", new String[]{uid, pwd});
		return (Admin)l.get(0);
	}
}
