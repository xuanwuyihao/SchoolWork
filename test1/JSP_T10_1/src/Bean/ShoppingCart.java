package Bean;

public class ShoppingCart {
	private String prodcode;//��Ʒ���
	private String prodname;//��Ʒ����
	private String proddesc;//��Ʒ˵��
	private String prodimg;//��ƷͼƬ
	private String prodprice;// ����
	private int prodcount;//����
	public String getProdcode() {
		return prodcode;
	}
	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	public String getProdimg() {
		return prodimg;
	}
	public void setProdimg(String prodimg) {
		this.prodimg = prodimg;
	}
	public String getProdprice() {
		return prodprice;
	}
	public void setProdprice(String prodprice) {
		this.prodprice = prodprice;
	}
	public int getProdcount() {
		return prodcount;
	}
	public void setProdcount(int prodcount) {
		this.prodcount = prodcount;
	}
}
