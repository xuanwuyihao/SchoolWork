package Service;

import java.util.List;

import Bean.Bean;
import Bean.User;

public interface Bookservice {
	public List Boooklist(int currpage,int pagecount);
	
	//������
	public int Bookrows();
	
	//���
	public boolean bookadd(Bean b);
	
	//�޸�
	public boolean bookupd(Bean b);
	
	//ɾ��
	public boolean bookdel(int id);
	
	public Bean selbyid(int id);
	
	//��¼�߼�
	public User login(User user);
}
