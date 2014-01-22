package cn.cms.manage.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import cn.cms.dao.entity.Admin;
import cn.cms.manage.service.AdminService;
import cn.cms.util.MD5Util;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9169867082264862074L;
	
	private String result;
	
	private String pwd;
	private String pwd1;

	private Admin admin;
	
	private AdminService service;
	public AdminService getService() {
		return service;
	}
	public void setService(AdminService service) {
		this.service = service;
	}

	private List<Admin> admins;
	
	public List<Admin> getAdmins(){
		return admins;
	}
	public void setAdmins(List<Admin> admins){
		this.admins = admins;
	}
	
	public String getResult(){
		return result;
	}
	public void setResult(String result){
		this.result = result;
	}

	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd1() {
		return pwd1;
	}
	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String execute(){

		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String main(){
		if (service != null){
			service.get(null);
			admins = (List<Admin>)service.getResult();
		}
		
		return SUCCESS;
	}
	
	public String add(){
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!"add".equalsIgnoreCase(request.getParameter("m"))){
			admin = null;
			return INPUT;
		}

		if (pwd != null && !pwd.equals(pwd1)){
			System.out.println("pwd not match!"+pwd+" pwd1:"+pwd1);
			return INPUT;
		}

		admin.setPwd(MD5Util.string2MD5(pwd));
		admin.setDateRegist(new Date());
		admin.setDateChange(new Date());
		int ret = service.add(admin);
		if (ret != 0){
			System.out.println(service.getErrorMessage());
			return INPUT;
		}
		
		return SUCCESS;
	}
	
	public String modify(){
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!"modify".equalsIgnoreCase(request.getParameter("m"))){
			String uid = request.getParameter("uid");
			if (0 == service.get(uid)){
				admin = (Admin)service.getResult();
			}
			return INPUT;
		} else {
			if (pwd != null && pwd.equals(pwd1)){
				admin.setPwd(MD5Util.string2MD5(pwd));
			}
			admin.setDateChange(new Date());
			int ret = service.modify(admin);
			if (ret != 0){
				return INPUT;
			}
		}
		
		return SUCCESS;
	}
	
	public String delete(){
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
	
}
