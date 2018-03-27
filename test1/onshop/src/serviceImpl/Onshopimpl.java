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

   //��Ʒչʾ
   public List prodshow(int currpage,int pagecount,String keyword);
   
   //������Ʒ����
   public int prodrows(String keyword);
	
   //ͼƬ��ѯ
	public String selimg(int prodid);

	//����ID����Ʒ��Ϣ
	public Product selprodbyid(int pid);
	
	//�����û�ID��ѯ������Ϣ
	public int seloidbyuid(int uid);
	
	//����ID��ͼ����Ϣ
	public List  selimgsbyid(int pid );
	
	//����ID���̼���Ϣ
	public Businessbean selbusinessbyid(int bid);
	
	//����ID�޸��û�����״̬
	public  Boolean updorderstate(int oid,int state);
	
	//������֤��
	public  Boolean updyzmbyoid(int oid,String yzm);
	
	//�鿴�ղ�
	public List selcollectbyuid(int uid);
	
	//��ѯ������֤��
	public String selyzm(int oid);
	
	//�鿴��������
	public List  selorderbyuid(int uid);
	
	//�ղ�
	public  Boolean savecollect(Collects co);
	
	//�㼣
	public Boolean  savebrowse(Browse bro);  
	
	//�û�����
	public Userbean  login(Userbean user);
	   
    //�û�ע��
    public Boolean enroll(Userbean users);
	
    //�˵�����
    public Boolean orders(Order orders);
    
    //���۱���
    public Boolean saveassess(Assess ass);
    
    //��ѯ�û�����
    public Assess selassess(int pid);
    
   //�����û��˺Ż�ȡ�û���Ϣ
	public Userbean selbyacc( String acount);
	
   //�û���Ϣչʾ���޸ģ�
   public Boolean  upinfo(Userbean us);
   
   //�û������޸�
   public Boolean  inpwd(Userbean p);
   
 //��ֵ
   public boolean urcharge(Userbean users);
   
}
