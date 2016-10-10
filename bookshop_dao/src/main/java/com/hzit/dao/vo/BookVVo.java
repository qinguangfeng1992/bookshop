package com.hzit.dao.vo;

/**
 * 
 * @author qinguangfeng
 */
public class BookVVo {
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

	public String getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(String booknumber) {
		this.booknumber = booknumber;
	}

	/**
	 * 数量
	 */
	private String booknumber;
	/**
	 * ID
	 * @param bookid
	 */
	public void setBookid(String bookid){
		this.bookid = bookid;
	}
	
    /**
     * ID
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
     */	
    public String getBooktypeid(){
    	return booktypeid;
    }
}