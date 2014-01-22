package cn.cms.dao;

import java.util.List;

import cn.cms.dao.entity.Article;

public class ArticleDao extends Hibernate4DaoSupport {
	public static final String ID = "id";
	
	public void save(Article a){
		super.save(a);
	}
	
	public void update(Article a){
		super.update(a);
	}
	
	public void delete(String id){
		super.delete(findById(id));
	}
	
	@SuppressWarnings("unchecked")
	public List<Article> findAll(){
		return (List<Article>)find("from Article");
	}

	@SuppressWarnings("rawtypes")
	public Article findById(String id){
		List l = find("from Article a where a.id=?", Integer.valueOf(id));
		return (Article)l.get(0);
	}
	
}
