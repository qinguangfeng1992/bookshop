package com.hzit.dao.vo;

/**
 * 
 * @author qinguangfeng
 */
public class BookVo {
	/**
	 *  ID
	 */
	private String bookid;
	/**
	 *  书名
	 */
	private String bookname;
	/**
	 *  书的图片地址
	 */
	private String bookurl;
	/**
	 *  书的
	 */
	private Integer bookprice;
	/**
	 *  书的库存
	 */
	private String bookstore;
	/**
	 *  假删除
	 */
	private String bookdelete;
	/**
	 *  图书作者
	 */
	private String bookauthor;
	/**
	 *  出版时间
	 */
	private String booktime;
	/**
	 *  图书类别ID
	 */
	private String booktypeid;

	/**
	 *  图书表的图书类型的名字
	 */
	private String typename;

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	/**
	 * ID
	 * @param bookid
	 */
	public void setBookid(String bookid){
		this.bookid = bookid;
	}
	
    /**
     * ID
     * @return String
     */	
    public String getBookid(){
    	return bookid;
    }
	/**
	 * 书名
	 * @param bookname
	 */
	public void setBookname(String bookname){
		this.bookname = bookname;
	}
	
    /**
     * 书名
     * @return String
     */	
    public String getBookname(){
    	return bookname;
    }
	/**
	 * 书的图片地址
	 * @param bookurl
	 */
	public void setBookurl(String bookurl){
		this.bookurl = bookurl;
	}
	
    /**
     * 书的图片地址
     * @return String
     */	
    public String getBookurl(){
    	return bookurl;
    }
	/**
	 * 书的
	 * @param bookprice
	 */
	public void setBookprice(Integer bookprice){
		this.bookprice = bookprice;
	}
	
    /**
     * 书的
     * @return Integer
     */	
    public Integer getBookprice(){
    	return bookprice;
    }
	/**
	 * 书的库存
	 * @param bookstore
	 */
	public void setBookstore(String bookstore){
		this.bookstore = bookstore;
	}
	
    /**
     * 书的库存
     * @return String
     */	
    public String getBookstore(){
    	return bookstore;
    }
	/**
	 * 假删除
	 * @param bookdelete
	 */
	public void setBookdelete(String bookdelete){
		this.bookdelete = bookdelete;
	}
	
    /**
     * 假删除
     * @return String
     */	
    public String getBookdelete(){
    	return bookdelete;
    }
	/**
	 * 图书作者
	 * @param bookauthor
	 */
	public void setBookauthor(String bookauthor){
		this.bookauthor = bookauthor;
	}
	
    /**
     * 图书作者
     * @return String
     */	
    public String getBookauthor(){
    	return bookauthor;
    }
	/**
	 * 出版时间
	 * @param booktime
	 */
	public void setBooktime(String booktime){
		this.booktime = booktime;
	}
	
    /**
     * 出版时间
     * @return String
     */	
    public String getBooktime(){
    	return booktime;
    }
	/**
	 * 图书类别ID
	 * @param booktypeid
	 */
	public void setBooktypeid(String booktypeid){
		this.booktypeid = booktypeid;
	}
	
    /**
     * 图书类别ID
     * @return String
     */	
    public String getBooktypeid(){
    	return booktypeid;
    }
}