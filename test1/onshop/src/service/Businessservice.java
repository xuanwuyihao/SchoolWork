package service;

import java.util.List;



import bean.Businessbean;
import bean.Order;
import bean.Product;
import bean.Yzm;

public interface Businessservice {
	
	//�̼ҵ�¼
	public Businessbean businesslogin(Businessbean business);
	
	//�̼�ע��
	public boolean bzhce(Businessbean b);
	
	//��������
	public Businessbean bcenter(String bacc);
	
	//�޸��̼�����
	public boolean updbusiness(Businessbean bacc);
	
	//�޸��̼�����-����
	public boolean updpwd(Businessbean bpwd);
	
	//�޸��̼�����-�ϴ�Ӫҵִ�յ�
	public boolean upyyzz(Businessbean b);
	
	//�Ź���Ϣ
	public Product selcommodity(int pid);
	
	//��ѯ��Ʒͼ����Ϣ
	public List selimgs(int pid);
	
	//�鿴������Ϣ
	public Businessbean selbusiness(int bid);
	
	//��ѯ��Ʒ��Ϣ
	public List selprodlist(int bid);
	
	//��ѯͼƬ
	public String selimg(int prodid);
	
	//����Ź�
	public boolean prodadd(Product prod);
	
	//��ѯ�����Ź�ID
	public int selmaxprodid();
	
	//���±���ͼƬ
	public boolean saveimg(int pid,String lsrc);
	
	//��ѯ�̼���Ϣ
	public List selprodlistbybid(int bid);
	
	//����
	public List prodlist(String keyword);
	
	//�޸���Ʒ����
	public boolean updcommodity(Product prod);
	
	//��ѯ��Ʒ��Ϣ
	public Product selprod(int pid);
	
	//��ѯ�̼���Ϣ
	public Businessbean selbusinesslist(int bid);
	
	//��֤��
	public boolean bupdorders(String yzm);
	
	//��ȡ��֤��
	public Order seloidbybid(String yzm);
	
	//������֤��
	public boolean addyzb(Yzm yzb);
	
	//��ѯ��Ʒ����
	public Product selprodbyid(int pid);
	
	//ɾ����Ʒ
	public boolean delprodbyid(int pid);
	
	
}
