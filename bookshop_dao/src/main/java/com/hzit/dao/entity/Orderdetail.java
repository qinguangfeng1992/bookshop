package com.hzit.dao.entity;

/**
 * 
 * @author HOU
 */
public class Orderdetail {
	/**
	 *  订单详细信息的ID
	 */
	private String orderdatailid;
	/**
	 *  购买的数量
	 */
	private String num;
	/**
	 *  图书ID
	 */
	private String bookid;
	/**
	 *  订单ID
	 */
	private String orderid;
	/**
	 *  用户id
	 */
	private String userid;
	/**
	 * 订单详细信息的ID
	 * @param orderdatailid
	 */
	public void setOrderdatailid(String orderdatailid){
		this.orderdatailid = orderdatailid;
	}
	
    /**
     * 订单详细信息的ID
     * @return
     */	
    public String getOrderdatailid(){
    	return orderdatailid;
    }
	/**
	 * 购买的数量
	 * @param num
	 */
	public void setNum(String num){
		this.num = num;
	}
	
    /**
     * 购买的数量
     * @return
     */	
    public String getNum(){
    	return num;
    }
	/**
	 * 图书ID
	 * @param bookid
	 */
	public void setBookid(String bookid){
		this.bookid = bookid;
	}
	
    /**
     * 图书ID
     * @return
     */	
    public String getBookid(){
    	return bookid;
    }
	/**
	 * 订单ID
	 * @param orderid
	 */
	public void setOrderid(String orderid){
		this.orderid = orderid;
	}
	
    /**
     * 订单ID
     * @return
     */	
    public String getOrderid(){
    	return orderid;
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