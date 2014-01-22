package cn.cms.manage.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class EnvironmentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7699618346068681814L;

	private String serverName;
	private int serverPort;
	private String serverPath;
	
	private String serverOS;
	private String serverArch;
	private String serverInfo;
	private String serverJRE;
	
	private String remoteIP;
	private String browser;
	private String agent;
	
	private String jspVersion;
	private String serverTime;
	
	private long freeMemory;
	private long totalMemory;
	private long usedMemory;
	private long maxMemory;
	private long useableMemory;
	
	public void setServerName(String serverName){
		this.serverName = serverName;
	}
	public String getServerName(){
		return serverName;
	}
	
	public void setServerArch(String serverArch){
		this.serverArch = serverArch;
	}
	public String getServerArch(){
		return serverArch;
	}
	
	public void setServerPort(int serverPort){
		this.serverPort = serverPort;
	}
	public int getServerPort(){
		return serverPort;
	}
	
	public void setServerPath(String serverPath){
		this.serverPath = serverPath;
	}
	public String getServerPath(){
		return serverPath;
	}
	
	public void setServerTime(String serverTime){
		this.serverTime = serverTime;
	}
	public String getServerTime(){
		return serverTime;
	}
	
	public void setServerOS(String serverOS){
		this.serverOS = serverOS;
	}
	public String getServerOS(){
		return serverOS;
	}
	
	public void setServerInfo(String serverInfo){
		this.serverInfo = serverInfo;
	}
	public String getServerInfo(){
		return serverInfo;
	}
	
	public void setServerJRE(String serverJRE){
		this.serverJRE = serverJRE;
	}
	public String getServerJRE(){
		return serverJRE;
	}
	
	public void setJspVersion(String jspVersion){
		this.jspVersion = jspVersion;
	}
	public String getJspVersion(){
		return jspVersion;
	}
	
	public void setRemoteIP(String remoteIP){
		this.remoteIP = remoteIP;
	}
	public String getRemoteIP(){
		return remoteIP;
	}
	
	public void setFreeMemory(long freeMemory){
		this.freeMemory = freeMemory;
	}
	public long getFreeMemory(){
		return freeMemory;
	}
	
	public void setMaxMemory(long maxMemory){
		this.maxMemory = maxMemory;
	}
	public long getMaxMemory(){
		return maxMemory;
	}
	
	public void setUseableMemory(long useableMemory){
		this.useableMemory = useableMemory;
	}
	public long getUseableMemory(){
		return useableMemory;
	}
	
	public void setUsedMemory(long usedMemory){
		this.usedMemory = usedMemory;
	}
	public long getUsedMemory(){
		return usedMemory;
	}
	
	public void setTotalMemory(long totalMemory){
		this.totalMemory = totalMemory;
	}
	public long getTotalMemory(){
		return totalMemory;
	}
	
	
	/**
	 * @return the browser
	 */
	public String getBrowser() {
		return browser;
	}
	/**
	 * @param browser the browser to set
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	/**
	 * @return the agent
	 */
	public String getAgent() {
		return agent;
	}
	/**
	 * @param agent the agent to set
	 */
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		serverName = request.getServerName();
		serverPort = request.getServerPort();

		remoteIP = request.getRemoteAddr();
		
		ServletContext ctx = ServletActionContext.getServletContext();
		serverPath = ctx.getRealPath("/");
		serverInfo = ctx.getServerInfo();
		serverJRE = System.getProperty("java.version");
		serverOS = System.getProperty("os.name") + "[" + System.getProperty("os.version") + "]";
		serverArch = System.getProperty("os.arch");
		jspVersion = String.valueOf(ctx.getMajorVersion()) + "." + String.valueOf(ctx.getMinorVersion());

		serverTime = new java.util.Date().toString();
			
		// Memory
		Runtime runtime = Runtime.getRuntime();
		long free = runtime.freeMemory();

		long m = 1024*1024;
		freeMemory = free/m;
        long total = runtime.totalMemory();
        totalMemory = total/m;
        usedMemory = (total - free)/m;
        long max = runtime.maxMemory();
        maxMemory = max/m;
        useableMemory = (max - total + free)/m;
        
        browser = request.getHeader("User-Agent");
        
		return SUCCESS;
	}
}
