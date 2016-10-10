package com.hzit.dao.entity;

/**
 * 
 * @author HOU
 */
public class Booknumber {
	/**
	 *  图书id
	 */
	private String bookid;
	/**
	 *  数量id
	 */
	private String id;
	/**
	 *  数量
	 */
	private Integer numt;
	/**
	 *  用户id
	 */
	private String userid;
	/**
	 * 图书id
	 * @param bookid
	 */
	public void setBookid(String bookid){
		this.bookid = bookid;
	}
	
    /**
     * 图书id
     * @return
     */	
    public String getBookid(){
    	return bookid;
    }
	/**
	 * 数量id
	 * @param id
	 */
	public void setId(String id){
		this.id = id;
	}
	
    /**
     * 数量id
     * @return
     */	
    public String getId(){
    	return id;
    }
	/**
	 * 数量
	 * @param numt
	 */
	public void setNumt(Integer numt){
		this.numt = numt;
	}
	
    /**
     * 数量
     * @return
     */	
    public Integer getNumt(){
    	return numt;
    }
	/**
	 * 用户id
	 * @param userid
	 */
	public void setUserid(String userid){
		this.userid = userid;
	}
	
    /**
     * 用户id
     * @return
     */	
    public String getUserid(){
    	return userid;
    }
}