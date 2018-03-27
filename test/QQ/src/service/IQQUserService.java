package service;

import java.util.List;
import java.util.Vector;

import bean.QQHistory;
import bean.QQUser;

public interface IQQUserService {
	public boolean addUser(QQUser use);//����û�   -ע��
	
	//���QQ���Ƿ��Ѿ�����
	public boolean checkQQnum(int qqnum);
	
	//��֤QQ��¼
	public QQUser checkUser(String qqnum,String pwd);
	
	//�����¼��¼
	public boolean addhistory(QQHistory history);
	
	//��ѯ��¼��ʷ
	public List selHistory();
	//�����û�״̬
	public boolean changestatus(String qqnum,int status);
	
	//���ݷ����ѯ������Ϣ
	public Vector<QQUser> selFriendByGroup(String qqnum,String groupname);
	
	//���Һ��ѵķ���
	public Vector findUsers(QQUser user);
	
	//����QQ�Ų�ѯ����
	public QQUser findUserByQQnum(String qqnum);
	
	//������ӵķ���
	public boolean addFriend (String myqq,String fqq,String groupname);
	
	//��ѯ�Ƿ�Ϊ����
	public boolean selFriend (String myqq,String fqq);
	
	//ɾ������
	public 	boolean delFriend(String myqqnum,String fqqnum);
	
	//�ƶ�����
	public boolean moveFriend (String myqq,String fqq,String groupname);
}
