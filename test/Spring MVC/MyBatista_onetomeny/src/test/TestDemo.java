package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bean.Finance;
import ht.mapper.FinaceMapper;
import method.MyBatistaUtil;

public class TestDemo {

	public void testOnetoOne(String stuno,Integer offset,Integer limit){
		SqlSessionFactory sessionfactory=MyBatistaUtil.getsqlsessionfactory();
		SqlSession session=sessionfactory.openSession();
		FinaceMapper finacemapper=session.getMapper(FinaceMapper.class);
		List<Finance> list=finacemapper.financepage(stuno, offset, limit);
		for(Finance finace:list){
			System.out.println("学生姓名："+finace.getStudent().getsName()+"....内容："+finace.getStudent().getsContent());
		}
		session.close();
	}
	
	public static void main(String[] args) {
		TestDemo test=new TestDemo();
		test.testOnetoOne("张三", 0, 1);
	}
}
