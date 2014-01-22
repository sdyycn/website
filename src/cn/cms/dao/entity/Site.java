package cn.cms.dao.entity;



/**
 * Site entity. @author MyEclipse Persistence Tools
 */

public class Site  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -5321768450903042768L;
	private Integer id;
    private String name;
    private String value;
    private String description;


    // Constructors

    /** default constructor */
    public Site() {
    }

    
    /** full constructor */
    public Site(String name, String value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
   








}