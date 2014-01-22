package cn.cms.dao.entity;

import java.util.Date;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -534651414836399603L;
	private Integer id;
	private String uid;
	private String name;
	private String pwd;
	private String email;
	private Integer type;
	private Integer gid;
	private Integer status;
	private String qq;
	private String mobile;
	private String phone;
	private String address;
	private Date dateRegist;
	private Date dateChange;
	private String description;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String uid, String name, String pwd, String email,
			Integer type, Integer gid, Integer status, String qq,
			String mobile, String phone, String address, Date dateRegist,
			Date dateChange, String description) {
		this.uid = uid;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.type = type;
		this.gid = gid;
		this.status = status;
		this.qq = qq;
		this.mobile = mobile;
		this.phone = phone;
		this.address = address;
		this.dateRegist = dateRegist;
		this.dateChange = dateChange;
		this.description = description;
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

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}