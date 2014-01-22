package cn.cms.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3203832588310578453L;
	private String title;
	private List<File> upload;
	private List<String> uploadContentType;
	private List<String> uploadFileName;
	private String savePath;
	
	private int maximumSize;
	private String allowedTypes;
	
	public void setMaximumSize(int maximumSize){
		this.maximumSize = maximumSize;
	}
	public int getMaximumSize(){
		return maximumSize;
	}
	
	public void setAllowedTypes(String allowedTypes){
		this.allowedTypes = allowedTypes;
	}
	public String getAllowedTypes(){
		return allowedTypes;
	}
	
	public void setSavePath(String path){
		this.savePath = path;
	}
	
	private String getSavePath() throws Exception {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	
	public void setUpload(List<File> upload){
		this.upload = upload;
	}
	public List<File> getUpload(){
		return upload;
	}
	
	public void setUploadContentType(List<String> uploadContentType){
		this.uploadContentType = uploadContentType;
	}
	public List<String> getUploadContentType(){
		return uploadContentType;
	}
	
	public void setUploadFileName(List<String> uploadFileName){
		this.uploadFileName = uploadFileName;
	}
	public List<String> getUploadFileName(){
		return uploadFileName;
	}
	
	@Override
	public String execute() throws Exception {
		List<File> files = getUpload();
		for (int i=0; i<files.size(); i++){
			FileOutputStream fos = new FileOutputStream(getSavePath()+ "\\" + getUploadFileName().get(i));
			FileInputStream fis = new FileInputStream(files.get(i));
		
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
		}
		
		return SUCCESS;
	}
}
