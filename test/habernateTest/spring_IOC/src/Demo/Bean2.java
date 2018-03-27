package Demo;

import java.util.Arrays;
import java.util.List;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dao.IUserDao;

//控制层
@Component("bean2")
//服务层
@Service("bean2")
//持久层
@Repository("bean2")

public class Bean2 {
	@Value("666")
	private Integer id;
	@Value("肖园")
	private String name;
	@Value("男")
	private String sex;
	@Value("{高中,大学}")
	private List<String> list;
	@Value("{男生,女生}")
	private Set<String> set;
	@Value("{喜欢,不喜欢}")
	private String[] sttr;
	
	@Resource(name="userDemo2")
	private IUserDao userDao;
	
	public void method(){
		System.out.println(id+"___"+name+"___"+sex);
		System.out.println(list);
		System.out.println(set);
		System.out.println(Arrays.toString(sttr));
	}
	
}
