package 数据结构;

public class maopao {
	
	//冒泡排序
	
	public void sort(int a[]){
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				for (int k = 0; k < a.length; k++) {
					System.out.print(a[k]);
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		maopao mp=new maopao();
		int a[]={1,2,3,4,5,6,7,8};
		mp.sort(a);
	}

}
