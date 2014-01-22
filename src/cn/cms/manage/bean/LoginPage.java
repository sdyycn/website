package cn.cms.manage.bean;

public class LoginPage {
	private String username = 	"用户名:";
	private String password = 	"密 码:";
	private String code 	=	"验证码:";
	private String login 	=  	"登      录";
	private String regist 	= 	"注      册";

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the regist
	 */
	public String getRegist() {
		return regist;
	}

	/**
	 * @param regist the regist to set
	 */
	public void setRegist(String regist) {
		this.regist = regist;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
//		return getText(username);
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
