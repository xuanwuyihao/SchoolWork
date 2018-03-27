package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {

	public void testBefore(){
		System.out.println("执行之前！");
	}
	
	public void testAfter(){
		System.out.println("执行后！");
		
	}
	public void testAround(ProceedingJoinPoint proc){
		System.out.println("在proc之前");
		
		try {
			proc.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("在proc之后！");
	}
}
