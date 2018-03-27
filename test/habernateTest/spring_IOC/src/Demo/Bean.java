package Demo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dao.IUserDao;

public class Bean implements Serializable{
	private int id;
	private String name;
	private String sex;
	private List<String> list;
	private Map<String,String> map;
	private Set<String> set;
	private String[] attr;
	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	private Bean(){}
	private Bean(int id,String name,String sex){
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
	
	public void method(){
		System.out.println(id+"___"+name+"____"+sex);
		System.out.println(list);
		System.out.println(map);
		System.out.println(set);
		System.out.println(Arrays.toString(attr));
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public String[] getAttr() {
		return attr;
	}
	public void setAttr(String[] attr) {
		this.attr = attr;
	}

}
