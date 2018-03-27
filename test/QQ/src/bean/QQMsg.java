package bean;

import java.io.Serializable;

import javax.swing.text.StyledDocument;

//实例化Serializable
public class QQMsg implements Serializable{

	private int cmd;//消息类型（命令字）
	private QQUser myUser;//发送者
	private QQUser fUser;//接受者
	private StyledDocument doc;//聊天内容
	private String file;//发送文件
	private byte[] b;//文件的字节数组
	
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
