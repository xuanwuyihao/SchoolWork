package service;

import java.util.List;



import bean.Businessbean;
import bean.Order;
import bean.Product;
import bean.Yzm;

public interface Businessservice {
	
	//商家登录
	public Businessbean businesslogin(Businessbean business);
	
	//商家注册
	public boolean bzhce(Businessbean b);
	
	//个人中心
	public Businessbean bcenter(String bacc);
	
	//修改商家资料
	public boolean updbusiness(Businessbean bacc);
	
	//修改商家资料-密码
	public boolean updpwd(Businessbean bpwd);
	
	//修改商家资料-上传营业执照等
	public boolean upyyzz(Businessbean b);
	
	//团购信息
	public Product selcommodity(int pid);
	
	//查询商品图库信息
	public List selimgs(int pid);
	
	//查看店铺信息
	public Businessbean selbusiness(int bid);
	
	//查询商品信息
	public List selprodlist(int bid);
	
	//查询图片
	public String selimg(int prodid);
	
	//添加团购
	public boolean prodadd(Product prod);
	
	//查询保存团购ID
	public int selmaxprodid();
	
	//重新保存图片
	public boolean saveimg(int pid,String lsrc);
	
	//查询商家信息
	public List selprodlistbybid(int bid);
	
	//搜索
	public List prodlist(String keyword);
	
	//修改商品资料
	public boolean updcommodity(Product prod);
	
	//查询商品信息
	public Product selprod(int pid);
	
	//查询商家信息
	public Businessbean selbusinesslist(int bid);
	
	//验证码
	public boolean bupdorders(String yzm);
	
	//获取验证码
	public Order seloidbybid(String yzm);
	
	//新增验证表
	public boolean addyzb(Yzm yzb);
	
	//查询商品详情
	public Product selprodbyid(int pid);
	
	//删除商品
	public boolean delprodbyid(int pid);
	
	
}
