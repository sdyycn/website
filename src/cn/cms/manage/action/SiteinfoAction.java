package cn.cms.manage.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.cms.manage.service.SiteService;

import com.opensymphony.xwork2.ActionSupport;

public class SiteInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4147285892543328725L;
	
	private String siteName;
	private String siteTitle;
	private String siteKeys;
	private String siteDescription;
	private String siteCopyright;
	private String siteICP;
	private String siteBottom;
	
	private SiteService service;
	
	public SiteService getService() {
		return service;
	}
	public void setService(SiteService service) {
		this.service = service;
	}
	
	public void setSiteName(String siteName){
		this.siteName = siteName;
	}
	public String getSiteName(){
		return siteName;
	}
	
	public void setSiteTitle(String siteTitle){
		this.siteTitle = siteTitle;
	}
	public String getSiteTitle(){
		return siteTitle;
	}
	
	public void setSiteKeys(String siteKeys){
		this.siteKeys = siteKeys;
	}
	public String getSiteKeys(){
		return siteKeys;
	}
	
	public void setSiteDescrition(String siteDescription){
		this.siteDescription = siteDescription;
	}
	public String getSiteDescription(){
		return siteDescription;
	}
	
	public void setSiteCopyright(String siteCopyright){
		this.siteCopyright = siteCopyright;
	}
	public String getSiteCopyright(){
		return siteCopyright;
	}
	
	public void setSiteICP(String siteICP){
		this.siteICP = siteICP;
	}
	public String getSiteICP(){
		return siteICP;
	}
	
	public void setSiteBottom(String siteBottom){
		this.siteBottom = siteBottom;
	}
	public String getSiteBottom(){
		return siteBottom;
	}

	public String execute(){
		System.out.println("SiteInfoAction execute");
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(request.getParameter("m"));
		if ("save".equalsIgnoreCase(request.getParameter("m"))){
			System.out.println(siteName);
			System.out.println(siteCopyright);
			service.setProperty("site_name", siteName);
			service.setProperty("site_title", siteTitle);
			service.setProperty("site_keys", siteKeys);
			service.setProperty("site_description", siteDescription);
			service.setProperty("site_copyright", siteCopyright);
			service.setProperty("site_icp", siteICP);
			service.setProperty("site_bottom", siteBottom);
		} else {
			siteName = service.getProperty("site_name");
			siteTitle = service.getProperty("site_title");
			siteKeys = service.getProperty("site_keys");
			siteDescription = service.getProperty("site_description");
			siteCopyright = service.getProperty("site_copyright");
			siteICP = service.getProperty("site_icp");
			siteBottom = service.getProperty("site_Bottom");
		}
		return SUCCESS;
	}
}
