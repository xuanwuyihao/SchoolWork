package common;

public class Contents {
	public static final int STATU_OFFLINE=0;//����
	public static final int STATU_ONLINE=1;//����
	public static final int STATU_HIDE=2;//����
	public static final int STATU_NODISTURB=4;//������� 
	public static final int STATU_BUSY=5;//æµ
	
	
	//��Ϣ������
	public static final int CMD_OFFLINE=1000;//����
	public static final int CMD_ONLINE=1001;//����
	public static final int CMD_HIDE=1002;//����
	public static final int CMD_BUSY=1003;//æµ
	public static final int CMD_NODITURB=1004;//�������
	
	public static final int CMD_CHAT=1006;//����֪ͨ
	public static final int CMD_SHKAE=1007;//����֪ͨ
	public static final int CMD_ADDFRIEND=1008;//��Ӻ���֪ͨ
	public static final int CMD_DELFRIEND=1009;//ɾ������֪ͨ
	
	public static final int CMD_SENDFILE=10010;//�����ļ�֪ͨ
	public static final int CMD_FRIENDYES=10011;//ͬ�����֪ͨ
	public static final int CMD_FRIENDNO=10012;//�ܽ����֪ͨ
	
	public static final int CMD_FILEYES=10013;//ͬ���ļ�֪ͨ
	public static final int CMD_FILENO=10014;//�ܽ��ļ�����֪ͨ
}
