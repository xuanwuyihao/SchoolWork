package com.p2p.pojo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 分页实体类
 * @author Administrator
 *
 */
@SuppressWarnings("rawtypes")
public class Page {

	private Integer fist;//第一个数
	private Integer tow;//第二个数
	private String title;//第一个条件
	private String people;//第二个条件
	private String htree;
	private String four;
	private String five;
	private String six;
	private BigDecimal money;
	
	

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getSix() {
		return six;
	}

	public void setSix(String six) {
		this.six = six;
	}

	public String getHtree() {
		return htree;
	}

	public void setHtree(String htree) {
		this.htree = htree;
	}

	public String getFour() {
		return four;
	}

	public void setFour(String four) {
		this.four = four;
	}

	public String getFive() {
		return five;
	}

	public void setFive(String five) {
		this.five = five;
	}

	private Integer cont;//总数
	
	public final static int PAGESIZE = 5; //默认显示的记录数 

    private int total; // 总记录 
    private List rows; //显示的记录  

    @JsonIgnore
    private int from;
    @JsonIgnore
    private int size;
	
	@JsonIgnore 
	private int nowpage;//当前页
	
	@JsonIgnore
	private int pagesize; // 每页显示的记录数 
	
    @JsonIgnore
	private Map<String, Object> condition;//查询条件
	
    @JsonIgnore
    private String sort = "seq";// 排序字段
    @JsonIgnore
    private String order = "asc";// asc，desc mybatis Order 关键字
    @JsonIgnore
    private String system_id;
    
	public Page() {
		super();
	}

	public Page(Integer fist, Integer tow, String title, String people, Integer cont, int total, List rows, int from,
			int size, int nowpage, int pagesize, Map<String, Object> condition, String sort, String order,
			String system_id) {
		super();
		this.fist = fist;
		this.tow = tow;
		this.title = title;
		this.people = people;
		this.cont = cont;
		this.total = total;
		this.rows = rows;
		this.from = from;
		this.size = size;
		this.nowpage = nowpage;
		this.pagesize = pagesize;
		this.condition = condition;
		this.sort = sort;
		this.order = order;
		this.system_id = system_id;
	}

	
	public Page(int nowpage,int pagesize) {
		
		//计算当前页
		if(nowpage < 0) {
			
			this.nowpage = 1;
		}else {
			
			//当前页
			this.nowpage = nowpage;
		}
		
		//记录每页显示的记录数
		if(pagesize < 0) {
			this.pagesize = PAGESIZE;
		}else {
			this.pagesize = pagesize;
		}
		
		
		//计算开始的记录和结束的记录
		this.from = (this.nowpage - 1) * this.pagesize;
		this.size = this.pagesize;
	}
	
	
	  // 构造方法
    public Page(int nowpage, int pagesize, String sort, String order, String system_id) {
        // 计算当前页  
        if (nowpage < 0) {
            this.nowpage = 1;
        } else {
            // 当前页
            this.nowpage = nowpage;
        }
        // 记录每页显示的记录数  
        if (pagesize < 0) {
            this.pagesize = PAGESIZE;
        } else {
            this.pagesize = pagesize;
        }
        // 计算开始的记录和结束的记录  
        this.from = (this.nowpage - 1) * this.pagesize;
        this.size = this.pagesize;
        // 排序字段，正序还是反序
        this.sort = sort;
        this.order = order;
        this.system_id = system_id;
    }
	
	@Override
	public String toString() {
		return "Page [fist=" + fist + ", tow=" + tow + ", title=" + title + ", people=" + people + ", cont=" + cont
				+ ", total=" + total + ", rows=" + rows + ", from=" + from + ", size=" + size + ", nowpage=" + nowpage
				+ ", pagesize=" + pagesize + ", condition=" + condition + ", sort=" + sort + ", order=" + order
				+ ", system_id=" + system_id + "]";
	}

	public Integer getFist() {
		return fist;
	}

	public void setFist(Integer fist) {
		this.fist = fist;
	}

	public Integer getTow() {
		return tow;
	}

	public void setTow(Integer tow) {
		this.tow = tow;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public Integer getCont() {
		return cont;
	}

	public void setCont(Integer cont) {
		this.cont = cont;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public Map<String, Object> getCondition() {
		return condition;
	}

	public void setCondition(Map<String, Object> condition) {
		this.condition = condition;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSystem_id() {
		return system_id;
	}

	public void setSystem_id(String system_id) {
		this.system_id = system_id;
	}


	
}
