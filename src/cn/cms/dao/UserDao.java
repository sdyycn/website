package cn.cms.dao;

import java.util.List;

import cn.cms.dao.entity.User;

public class UserDao extends Hibernate4DaoSupport {
	public static final String UID = "uid";
	
	public void save(User a){
		super.save(a);
	}
	
	public void update(User a){
		super.update(a);
	}
	
	public void delete(String uid){
		super.delete(findById(uid));
	}
	
	@SuppressWarnings("unchecked")
	public List<User> findAll(){
		return (List<User>)find("from User");
	}

	@SuppressWarnings("rawtypes")
	public User findById(String id){
		List l = find("from User a where a.uid=?", id);
		return (User)l.get(0);
	}
	
	@SuppressWarnings("rawtypes")
	public User findByUidAndPwd(String uid, String pwd){
		List l = find("from User a where a.uid=? and a.pwd=?", new String[]{uid, pwd});
		return (User)l.get(0);
	}
}
