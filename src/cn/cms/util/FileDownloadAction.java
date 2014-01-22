package cn.cms.util;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2333365996909201108L;

	private String inputPath;
	
	public void setInputPath(String value){
		inputPath = value;
	}
	
	public InputStream getTargetFile() throws Exception{
		return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
