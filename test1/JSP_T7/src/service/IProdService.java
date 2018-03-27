package service;

import java.util.List;
import bean.prod;

public interface IProdService {
	//查询列表方法
	public List<prod> list();
	
	//添加商品方法
	public boolean add(prod prod);
	
	//根据商品查找信息
	public prod selbyid(int id);
	
	//根据ID修改
	public boolean upd(prod prod);
}
