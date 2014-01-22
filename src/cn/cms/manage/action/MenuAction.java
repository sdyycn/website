package cn.cms.manage.action;

import java.util.List;

import cn.cms.dao.entity.Menu;
import cn.cms.manage.service.MenuService;

import com.opensymphony.xwork2.ActionSupport;

public class MenuAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1181053679306890734L;

	private MenuService service;
	public MenuService getService() {
		return service;
	}
	public void setService(MenuService service) {
		this.service = service;
	}
	
	private List<Menu> menus;
	public List<Menu> getMenus(){
		return menus;
	}
	public void setMenus(List<Menu> menus){
		this.menus = menus;
	}

	public String execute(){
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String main(){
		if (service != null){
			if (0 == service.get(null)){
				menus = (List<Menu>)service.getResult();
			}
		}
		return SUCCESS;
	}
	
	public String add(){
		return SUCCESS;
	}
	
	public String modify(){
		return SUCCESS;
	}
	
	public String delete(){
		return SUCCESS;
	}
}
