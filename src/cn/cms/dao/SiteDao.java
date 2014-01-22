package cn.cms.dao;

import java.util.List;

import cn.cms.dao.entity.Site;

public class SiteDao extends Hibernate4DaoSupport {
	public static final String UID = "uid";
	
	public void save(Site a){
		super.save(a);
	}
	
	public void update(Site a){
		super.update(a);
	}
	
	public void delete(String key){
		super.delete(findByKey(key));
	}
	
//	@SuppressWarnings("unchecked")
//	public List<Site> findAll(){
//		return (List<Site>)find("from Site");
//	}

	@SuppressWarnings("rawtypes")
	public Site findByKey(String key){
		List l = find("from Site a where a.name=?", key);
		return (Site)l.get(0);
	}
}
