package t1;

public class lianxi2 {
	public static void main(String[] args){
		
		//2����150��400֮��7�ı�����8��һ��
		int x=150,y=0;
		System.out.println("150~400��7�ı����У�");
		do{
			if(x%7==0){
				System.out.print(x+" ");
				y++;
				if(y%8==0){
					System.out.println(" ");
				}
				
			}
			x++;
			
			
		}while(x<400);
	
	

		/*
		int y=0;
		for(int x=150;x<400;x++){
			if(x/7==0){
				x=y;
			}
		}
		*/
	}

}