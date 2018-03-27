package common;

public class Contents {
	public static final int STATU_OFFLINE=0;//离线
	public static final int STATU_ONLINE=1;//在线
	public static final int STATU_HIDE=2;//隐身
	public static final int STATU_NODISTURB=4;//请勿打扰 
	public static final int STATU_BUSY=5;//忙碌
	
	
	//消息命令字
	public static final int CMD_OFFLINE=1000;//下线
	public static final int CMD_ONLINE=1001;//上线
	public static final int CMD_HIDE=1002;//隐身
	public static final int CMD_BUSY=1003;//忙碌
	public static final int CMD_NODITURB=1004;//请勿打扰
	
	public static final int CMD_CHAT=1006;//聊天通知
	public static final int CMD_SHKAE=1007;//抖动通知
	public static final int CMD_ADDFRIEND=1008;//添加好友通知
	public static final int CMD_DELFRIEND=1009;//删除好友通知
	
	public static final int CMD_SENDFILE=10010;//发送文件通知
	public static final int CMD_FRIENDYES=10011;//同意添加通知
	public static final int CMD_FRIENDNO=10012;//拒接添加通知
	
	public static final int CMD_FILEYES=10013;//同意文件通知
	public static final int CMD_FILENO=10014;//拒接文件接收通知
}
