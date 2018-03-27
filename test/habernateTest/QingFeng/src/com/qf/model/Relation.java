package com.qf.model;

import java.io.Serializable;
/*字段	类型	说明			
r_id	int(主键)	编号			
r_qq	varchar	QQ号码			
r_phone	varchar	电话			
r_content	varchar	详细内容			
r_effect	varchar	作用1成考、2远程、3财务、4学籍			
					
*/
public class Relation implements Serializable{
	private  Integer r_id;
	private String  r_qq;
	private String  r_phone;
	private String r_content;
	private String r_effect;
	
	public Relation(){}
	public Relation(Integer r_id,String  r_qq,String  r_phone,String r_content,String r_effect ){
		this.r_id=r_id;
		this.r_qq=r_qq;
		this.r_phone=r_phone;
		this.r_content=r_content;
		this.r_effect=r_effect;
		
	}
	
	public Integer getR_id() {
		return r_id;
	}
	public void setR_id(Integer r_id) {
		this.r_id = r_id;
	}
	public String getR_qq() {
		return r_qq;
	}
	public void setR_qq(String r_qq) {
		this.r_qq = r_qq;
	}
	public String getR_phone() {
		return r_phone;
	}
	public void setR_phone(String r_phone) {
		this.r_phone = r_phone;
	}
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public String getR_effect() {
		return r_effect;
	}
	public void setR_effect(String r_effect) {
		this.r_effect = r_effect;
	}
	
	
	
	
}
