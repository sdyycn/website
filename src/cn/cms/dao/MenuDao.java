package cn.cms.dao;

import java.util.List;

import cn.cms.dao.entity.Menu;

public class MenuDao extends Hibernate4DaoSupport {
	public static final String MID = "mid";
	
	public void save(Menu a){
		super.save(a);
	}
	
	public void update(Menu a){
		super.update(a);
	}
	
	public void delete(String uid){
		super.delete(findById(uid));
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu> findAll(){
		return (List<Menu>)find("from Menu");
	}

	@SuppressWarnings("rawtypes")
	public Menu findById(String id){
		List l = find("from Menu a where a.mid=?", id);
		return (Menu)l.get(0);
	}
	
	@SuppressWarnings("rawtypes")
	public Menu findByUidAndPwd(String uid, String pwd){
		List l = find("from Admin a where a.uid=? and a.pwd=?", new String[]{uid, pwd});
		return (Menu)l.get(0);
	}
}
