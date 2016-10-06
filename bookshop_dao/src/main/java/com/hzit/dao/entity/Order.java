package com.hzit.dao.entity;

/**
 * 
 * @author qinguangfeng
 */
public class Order {
	/**
	 *  订单ID
	 */
	private String orderid;
	/**
	 *  图书ID
	 */
	private String bookid;
	/**
	 *  订单创建时间
	 */
	private String ordertime;
	/**
	 *  订单价格
	 */
	private Integer orderprice;
	/**
	 *  订单状态，付了还是没付
	 */
	private String orderstatu;
	/**
	 *  订单假删
	 */
	private String orderdelete;
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
	 * 订单创建时间
	 * @param ordertime
	 */
	public void setOrdertime(String ordertime){
		this.ordertime = ordertime;
	}
	
    /**
     * 订单创建时间
     * @return
     */	
    public String getOrdertime(){
    	return ordertime;
    }
	/**
	 * 订单价格
	 * @param orderprice
	 */
	public void setOrderprice(Integer orderprice){
		this.orderprice = orderprice;
	}
	
    /**
     * 订单价格
     * @return
     */	
    public Integer getOrderprice(){
    	return orderprice;
    }
	/**
	 * 订单状态，付了还是没付
	 * @param orderstatu
	 */
	public void setOrderstatu(String orderstatu){
		this.orderstatu = orderstatu;
	}
	
    /**
     * 订单状态，付了还是没付
     * @return
     */	
    public String getOrderstatu(){
    	return orderstatu;
    }
	/**
	 * 订单假删
	 * @param orderdelete
	 */
	public void setOrderdelete(String orderdelete){
		this.orderdelete = orderdelete;
	}
	
    /**
     * 订单假删
     * @return
     */	
    public String getOrderdelete(){
    	return orderdelete;
    }
}