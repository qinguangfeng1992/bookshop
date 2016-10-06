package com.hzit.dao.entity;

/**
 * 
 * @author qinguangfeng
 */
public class Type {
	/**
	 *  图书类型ID
	 */
	private String booktypeid;
	/**
	 *  图书类型的名字
	 */
	private String bookname;
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
     * @return
     */	
    public String getBooktypeid(){
    	return booktypeid;
    }
	/**
	 * 图书类型的名字
	 * @param bookname
	 */
	public void setBookname(String bookname){
		this.bookname = bookname;
	}
	
    /**
     * 图书类型的名字
     * @return
     */	
    public String getBookname(){
    	return bookname;
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
     * @return
     */	
    public String getParenttypeid(){
    	return parenttypeid;
    }
}