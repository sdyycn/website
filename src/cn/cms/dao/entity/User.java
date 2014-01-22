package cn.cms.dao.entity;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -380122877109530711L;
	private Integer id;
	private String uid;
	private String name;
	private String pwd;
	private Integer sex;
	private String email;
	private Integer type;
	private Integer status;
	private Date dateRegist;
	private Date dateChange;
	private String ipJoin;
	private Date dateLogin;
	private String ipLogin;
	private String qq;
	private String mobile;
	private String phone;
	private String address;
	private Integer age;
	private String school;
	private String department;
	private Integer timesLogin;
	private String company;
	private String fax;
	private String note;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String uid, String pwd, String email) {
		this.uid = uid;
		this.pwd = pwd;
		this.email = email;
	}

	/** full constructor */
	public User(String uid, String name, String pwd, Integer sex, String email,
			Integer type, Integer status, Date dateRegist, String ipJoin,
			Date dateLogin, String ipLogin, String qq, String mobile,
			String phone, String address, Integer age, String school,
			String department) {
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.email = email;
		this.type = type;
		this.status = status;
		this.dateRegist = dateRegist;
		this.ipJoin = ipJoin;
		this.dateLogin = dateLogin;
		this.ipLogin = ipLogin;
		this.qq = qq;
		this.mobile = mobile;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.school = school;
		this.department = department;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getDateRegist() {
		return this.dateRegist;
	}

	public void setDateRegist(Date dateRegist) {
		this.dateRegist = dateRegist;
	}
	
	public Date getDateChange() {
		return this.dateChange;
	}

	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}

	public String getIpJoin() {
		return this.ipJoin;
	}

	public void setIpJoin(String ipJoin) {
		this.ipJoin = ipJoin;
	}

	public Date getDateLogin() {
		return this.dateLogin;
	}

	public void setDateLogin(Date dateLogin) {
		this.dateLogin = dateLogin;
	}

	public String getIpLogin() {
		return this.ipLogin;
	}

	public void setIpLogin(String ipLogin) {
		this.ipLogin = ipLogin;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getTimesLogin() {
		return timesLogin;
	}

	public void setTimesLogin(Integer timesLogin) {
		this.timesLogin = timesLogin;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

}