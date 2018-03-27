package bean;

public class Order {
    private int oid;
    private  int uid;
    private  int bid;
    private int  pid;
    private float oprice;
    private  int ocount;
    private float  ototal;
    private String odate;
    private String oyzm;
    private int  ostate;
    
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public float getOprice() {
		return oprice;
	}
	public void setOprice(float oprice) {
		this.oprice = oprice;
	}
	public int getOcount() {
		return ocount;
	}
	public void setOcount(int ocount) {
		this.ocount = ocount;
	}
	public float getOtotal() {
		return ototal;
	}
	public void setOtotal(float ototal) {
		this.ototal = ototal;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public String getOyzm() {
		return oyzm;
	}
	public void setOyzm(String oyzm) {
		this.oyzm = oyzm;
	}
	public int getOstate() {
		return ostate;
	}
	public void setOstate(int ostate) {
		this.ostate = ostate;
	}
}
