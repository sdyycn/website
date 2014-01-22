package cn.cms.manage.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import cn.cms.dao.entity.User;
import cn.cms.manage.service.UserService;
import cn.cms.util.MD5Util;

import com.opensymphony.xwork2.ActionSupport;

public class MemberAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2589573824350727928L;
	
	private User user;
	private List<User> users;
	
	private String result;
	
	private String pwd;
	private String pwd1;
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the pwd1
	 */
	public String getPwd1() {
		return pwd1;
	}
	/**
	 * @param pwd1 the pwd1 to set
	 */
	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	private UserService service;
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	
	public List<User> getUsers(){
		return users;
	}
	public void setUsers(List<User> users){
		this.users = users;
	}
	
	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}

	public String execute(){
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String main(){
		if (service != null){
			service.get(null);
			users = (List<User>)service.getResult();
		}
		return SUCCESS;
	}
	
	public String add(){
		System.out.println("MemberAction add");
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!"add".equalsIgnoreCase(request.getParameter("m"))){
			System.out.println("222");
			System.out.println(request.getParameter("m"));
			user = null;
			return INPUT;
		}
		System.out.println("111");
		
		if (pwd != null && !pwd.equals(pwd1)){
			System.out.println("pwd not match!"+pwd+" pwd1:"+pwd1);
			return INPUT;
		}

		user.setPwd(MD5Util.string2MD5(pwd));
		user.setDateRegist(new Date());
		user.setDateChange(new Date());
		int ret = service.add(user);
		if (ret != 0){
			System.out.println(service.getErrorMessage());
			return INPUT;
		}
		
		return SUCCESS;
	}
	
	public String modify(){
		System.out.println("MemberAction modify");
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!"modify".equalsIgnoreCase(request.getParameter("m"))){
			String uid = request.getParameter("uid");
			if (0 == service.get(uid)){
				user = (User)service.getResult();
			}
			return INPUT;
		} else {
			if (pwd != null && pwd.equals(pwd1)){
				user.setPwd(MD5Util.string2MD5(pwd));
			}
			user.setDateChange(new Date());
			int ret = service.modify(user);
			if (ret != 0){
				return INPUT;
			}
		}
		
		return SUCCESS;
	}
	
	public String delete(){
		System.out.println("MemberAction delete");
		HttpServletRequest request = ServletActionContext.getRequest();
		String uid = request.getParameter("uid");
		Map<String, String> map = new HashMap<String, String>();
		
		if (service.delete(uid) != 0){
			map.put("code", "-1");
			map.put("status", "failed");
		} else {
			map.put("code", "1");
			map.put("status", "success");
			map.put("uid", uid);
		}

		JSONObject jo = JSONObject.fromObject(map);
		result = jo.toString(); 
		System.out.println(result);

/*		HttpServletResponse res = ServletActionContext.getResponse();
		try{
			res.getWriter().write(result);
			
		} catch (Exception e){
			e.printStackTrace();
		}
*/		
		return SUCCESS;
	}
	
	public String setting(){
		return INPUT;
	}

	
}
