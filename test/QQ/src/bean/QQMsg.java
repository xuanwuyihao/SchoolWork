package bean;

import java.io.Serializable;

import javax.swing.text.StyledDocument;

//ʵ����Serializable
public class QQMsg implements Serializable{

	private int cmd;//��Ϣ���ͣ������֣�
	private QQUser myUser;//������
	private QQUser fUser;//������
	private StyledDocument doc;//��������
	private String file;//�����ļ�
	private byte[] b;//�ļ����ֽ�����
	
	public byte[] getB() {
		return b;
	}
	public void setB(byte[] b) {
		this.b = b;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public QQUser getMyUser() {
		return myUser;
	}
	public void setMyUser(QQUser myUser) {
		this.myUser = myUser;
	}
	public QQUser getFUser() {
		return fUser;
	}
	public void setFUser(QQUser user) {
		fUser = user;
	}
	public StyledDocument getDoc() {
		return doc;
	}
	public void setDoc(StyledDocument doc) {
		this.doc = doc;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	
}
