package t1;

public class lianxi7 {
	public static void main(String[] agrs){
		//for(i=1;i<10;i++){
			//for(j=1;j<=i;j++){
			//printf("%d��%d=%d  ",j,i,i*j);
		int x,y;
		for(x=1;x<10;x++){
			for(y=1;y<=x;y++){
				System.out.print(y);
				System.out.print("*"+x);
				System.out.print("="+x*y+" ");
				
			}
			System.out.println(" ");
		}
	}
}
