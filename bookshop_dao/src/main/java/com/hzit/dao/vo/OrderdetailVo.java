package com.hzit.dao.vo;

/**
 * 
 * @author qinguangfeng
 */
public class OrderdetailVo {
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
	 * 订单详细信息的ID
	 * @param orderdatailid
	 */
	public void setOrderdatailid(String orderdatailid){
		this.orderdatailid = orderdatailid;
	}
	
    /**
     * 订单详细信息的ID
     * @return String
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
     * @return String
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
     * @return String
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
     * @return String
     */	
    public String getOrderid(){
    	return orderid;
    }
}