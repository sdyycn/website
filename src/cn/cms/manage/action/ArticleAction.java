package cn.cms.manage.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import cn.cms.dao.entity.Article;
import cn.cms.manage.service.ArticleService;


import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7278940512154371857L;

	private String result;
	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}
	
	private Article article;
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	private ArticleService service;
	public ArticleService getService() {
		return service;
	}
	public void setService(ArticleService service) {
		this.service = service;
	}

	private List<Article> articles;
	
	public List<Article> getArticles(){
		return articles;
	}
	public void setArticles(List<Article> articles){
		this.articles = articles;
	}
	
	public String execute(){
		System.out.println("ArticleAction execute");
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String main(){
		System.out.println("ArticleAction main");
		
		if (service != null){
			service.get(null);
			articles = (List<Article>)service.getResult();
		}
		
		return SUCCESS;
	}
	
	public String add(){	// Add article
		System.out.println("ArticleAction publish");

		HttpServletRequest request = ServletActionContext.getRequest();
		String m = request.getParameter("m");
		if ("add".equalsIgnoreCase(m)){
			article.setContent(request.getParameter("content"));
			if (article.getTimePublish() == null){
				article.setTimePublish(new Date());
			}
			service.add(article);
			return SUCCESS;
		}
		
		article = null;

		return INPUT;
	}
	
	public String modify(){
		System.out.println("ArticleAction modify");
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!"modify".equalsIgnoreCase(request.getParameter("m"))){
			String id = request.getParameter("id");
			if (0 == service.get(id)){
				article = (Article)service.getResult();
			}
			return INPUT;
		} else {
			article.setTimeUpdate(new Date());
			int ret = service.modify(article);
			if (ret != 0){
				return INPUT;
			}
		}
		
		return SUCCESS;
	}
	
	public String delete(){
		System.out.println("ArticleAction delete");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		Map<String, String> map = new HashMap<String, String>();
		
		if (service.delete(id) != 0){
			map.put("code", "-1");
			map.put("status", "failed");
		} else {
			map.put("code", "1");
			map.put("status", "success");
			map.put("id", id);
		}

		JSONObject jo = JSONObject.fromObject(map);
		result = jo.toString(); 
		System.out.println(result);
		return SUCCESS;
	}
}
