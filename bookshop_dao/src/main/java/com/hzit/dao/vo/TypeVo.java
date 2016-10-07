package com.hzit.dao.vo;

/**
 * 
 * @author qinguangfeng
 */
public class TypeVo {
	/**
	 *  图书类型ID
	 */
	private String booktypeid;
	/**
	 *  图书类型的名字
	 */
	private String typename;
	/**
	 *  
	 */
	private String parenttypeid;
	/**
	 * 图书类型ID
	 * @param booktypeid
	 */
	public void setBooktypeid(String booktypeid){
		this.booktypeid = booktypeid;
	}
	
    /**
     * 图书类型ID
     * @return String
     */	
    public String getBooktypeid(){
    	return booktypeid;
    }
	/**
	 * 图书类型的名字
	 * @param typename
	 */
	public void setTypename(String typename){
		this.typename = typename;
	}
	
    /**
     * 图书类型的名字
     * @return String
     */	
    public String getTypename(){
    	return typename;
    }
	/**
	 * 
	 * @param parenttypeid
	 */
	public void setParenttypeid(String parenttypeid){
		this.parenttypeid = parenttypeid;
	}
	
    /**
     * 
     * @return String
     */	
    public String getParenttypeid(){
    	return parenttypeid;
    }
}