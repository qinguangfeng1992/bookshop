package com.hzit.dao.entity;

/**
 * 
 * @author qinguangfeng
 */
public class User {
	/**
	 *  用户ID
	 */
	private String userid;
	/**
	 *  用户名
	 */
	private String username;
	/**
	 *  用户密码
	 */
	private String userpwd;
	/**
	 * 用户ID
	 * @param userid
	 */
	public void setUserid(String userid){
		this.userid = userid;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public String getUserid(){
    	return userid;
    }
	/**
	 * 用户名
	 * @param username
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUsername(){
    	return username;
    }
	/**
	 * 用户密码
	 * @param userpwd
	 */
	public void setUserpwd(String userpwd){
		this.userpwd = userpwd;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getUserpwd(){
    	return userpwd;
    }
}