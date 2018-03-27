package t1;

public class lianxi2 {
	public static void main(String[] args){
		
		//2、求150到400之间7的倍数，8个一行
		int x=150,y=0;
		System.out.println("150~400中7的倍数有：");
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
