package cn.cms.dao.entity;

import java.util.Date;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3632786735463581908L;
	private Integer id;
	private String title;
	private Integer type;
	private String author;
	private Date timePublish;
	private Date timeUpdate;
	private String content;
	private String summary;
	private String source;
	private String k;
	private String attachment;
	private Integer model;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(String title, Integer type, String author, Date timePublish,
			Date timeUpdate, String content, String summary, String source) {
		this.title = title;
		this.type = type;
		this.author = author;
		this.timePublish = timePublish;
		this.timeUpdate = timeUpdate;
		this.content = content;
		this.summary = summary;
		this.source = source;
	}

	/** full constructor */
	public Article(String title, Integer type, String author, Date timePublish,
			Date timeUpdate, String content, String summary, String source,
			String k, String attachment, Integer model) {
		this.title = title;
		this.type = type;
		this.author = author;
		this.timePublish = timePublish;
		this.timeUpdate = timeUpdate;
		this.content = content;
		this.summary = summary;
		this.source = source;
		this.k = k;
		this.attachment = attachment;
		this.model = model;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getTimePublish() {
		return this.timePublish;
	}

	public void setTimePublish(Date timePublish) {
		this.timePublish = timePublish;
	}

	public Date getTimeUpdate() {
		return this.timeUpdate;
	}

	public void setTimeUpdate(Date timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getK() {
		return this.k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public Integer getModel() {
		return this.model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

}