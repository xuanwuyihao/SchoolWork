package serviceImpl;

import java.util.List;

import bean.Assess;
import bean.Browse;
import bean.Businessbean;
import bean.Collects;
import bean.Order;
import bean.Product;
import bean.Userbean;

public interface Onshopimpl {

   //商品展示
   public List prodshow(int currpage,int pagecount,String keyword);
   
   //搜索商品条数
   public int prodrows(String keyword);
	
   //图片查询
	public String selimg(int prodid);

	//根据ID查商品信息
	public Product selprodbyid(int pid);
	
	//根据用户ID查询订单信息
	public int seloidbyuid(int uid);
	
	//根据ID查图库信息
	public List  selimgsbyid(int pid );
	
	//根据ID查商家信息
	public Businessbean selbusinessbyid(int bid);
	
	//根据ID修改用户订单状态
	public  Boolean updorderstate(int oid,int state);
	
	//生成验证码
	public  Boolean updyzmbyoid(int oid,String yzm);
	
	//查看收藏
	public List selcollectbyuid(int uid);
	
	//查询订单验证码
	public String selyzm(int oid);
	
	//查看订单详情
	public List  selorderbyuid(int uid);
	
	//收藏
	public  Boolean savecollect(Collects co);
	
	//足迹
	public Boolean  savebrowse(Browse bro);  
	
	//用户登入
	public Userbean  login(Userbean user);
	   
    //用户注册
    public Boolean enroll(Userbean users);
	
    //账单保存
    public Boolean orders(Order orders);
    
    //评价保存
    public Boolean saveassess(Assess ass);
    
    //查询用户评价
    public Assess selassess(int pid);
    
   //根据用户账号获取用户信息
	public Userbean selbyacc( String acount);
	
   //用户信息展示（修改）
   public Boolean  upinfo(Userbean us);
   
   //用户密码修改
   public Boolean  inpwd(Userbean p);
   
 //充值
   public boolean urcharge(Userbean users);
   
}
