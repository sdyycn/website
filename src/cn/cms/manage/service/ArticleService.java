package cn.cms.manage.service;

import cn.cms.dao.ArticleDao;
import cn.cms.dao.entity.Article;

public class ArticleService {
	private String errorMessage = null;
	private Object result = null;
	private ArticleDao dao = null;
	public void setDao(ArticleDao dao){
		this.dao = dao;
	}
	public ArticleDao getDao(){
		return dao;
	}
	
	public String getErrorMessage(){
		return errorMessage;
	}
	public Object getResult(){
		return result;
	}
	
	public int get(String id){
		try{
			if (id == null){
				result = dao.findAll();
			} else {
				result = dao.findById(id);
			}
		} catch (Exception e){
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public int add(Article a){
		try{
			dao.save(a);
		} catch(Exception e){
			e.printStackTrace();
			errorMessage = "Article DAO error!";
			return -1;
		}
		
		return 0;
	}
	
	public int modify(Article a){
		try{
			dao.update(a);
		} catch (Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	public int delete(String id){
		try{
			dao.delete(id);
		} catch(Exception e){
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
}
