package cn.cms.dao.entity;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4240407833769253325L;
	private Integer id;
	private String mid;
	private String name;
	private Integer type;
	private Integer no;
	private Integer privilege;
	private Integer pid;
	private Integer status;
	private String directory;
	private Integer key;
	private String description;

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** minimal constructor */
	public Menu(String mid, String name, Integer key) {
		this.mid = mid;
		this.name = name;
		this.key = key;
	}

	/** full constructor */
	public Menu(String mid, String name, Integer type, Integer no,
			Integer privilege, Integer pid, Integer status, String directory,
			Integer key, String description) {
		this.mid = mid;
		this.name = name;
		this.type = type;
		this.no = no;
		this.privilege = privilege;
		this.pid = pid;
		this.status = status;
		this.directory = directory;
		this.key = key;
		this.description = description;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMid() {
		return this.mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Integer getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDirectory() {
		return this.directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public Integer getKey() {
		return this.key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}