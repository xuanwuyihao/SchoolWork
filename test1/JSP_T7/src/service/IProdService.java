package service;

import java.util.List;
import bean.prod;

public interface IProdService {
	//��ѯ�б���
	public List<prod> list();
	
	//�����Ʒ����
	public boolean add(prod prod);
	
	//������Ʒ������Ϣ
	public prod selbyid(int id);
	
	//����ID�޸�
	public boolean upd(prod prod);
}
