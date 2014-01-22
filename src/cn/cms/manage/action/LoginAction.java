package cn.cms.manage.action;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.cms.manage.service.AdminService;
import cn.cms.util.MD5Util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8472563399978245405L;
	
	private AdminService service;
	
	private String uid;
	private String pwd;
	private String code;
	
	public String getPwd(){
		return pwd;
	}
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code = code;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public AdminService getService() {
		return service;
	}
	public void setService(AdminService service) {
		this.service = service;
	}
	
	public String logout(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("uid", null);
		session.put("login", null);
		session.put("rand", null);
		System.out.println("=======logout");
		return LOGIN;
	}
	
	public void PageRefresh(){
		HttpServletResponse response = ServletActionContext.getResponse();  
		//清除登陆页面缓存  
		response.setHeader("Pragma","No-cache");   
		response.setHeader("Cache-Control","no-cache");  
		response.setHeader("Cache-Control", "no-store");  
		response.setDateHeader("Expires", 0);  
	}
	
	@Override
	public String execute() throws Exception{
//		PageRefresh();
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		String rand = (String)session.get("rand");
		String login = (String)session.get("login");
		if (login!=null && login.toUpperCase() == "TRUE"){
			return SUCCESS;
		}
		session.put("rand", null);
		
		if (code.equalsIgnoreCase(rand)){
			int ret = service.login(uid, MD5Util.string2MD5(pwd));
			if (ret != 0){
				addActionError("数据库出错,请联系管理员!");
			} else {
				String username = (String)service.getResult();
				if (!"".equals(username)){
					session.put("uid", uid);
					session.put("user", username);
					session.put("login", "TRUE");
					return SUCCESS;
				} else {
					session.put("login", null);
					addActionError("用户名/密码不匹配!");
				}
			}
		} else {
			session.put("login", null);
			addActionError("验证码错误,请重新输入!");
		}
		return INPUT;
	}
}
