package Dome;

public class InsertSort {

	//插入排序
	public void insert(int a[]){
		int i;
		int j;
		int insert;
		for(i=1;i<a.length;i++){
			insert =a[i];
			j=i-1;
			while(j>=0&&insert<a[j]){
				a[j+1]=a[j];
				j--;
					
			}
				a[j+1]=insert;
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]);
		}
	}
	
	public void inserts(int a[]){
		int i;
		int j;
		int temp=0;
		for(i=1;i<a.length;i++){
			j=i-1;
			temp=a[i];
			while(j>=0&&temp<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]);
		}
	}
	
	public static void main(String[] args) {
		InsertSort is=new InsertSort();
		int a[]={5,3,2,6,8,7,9};
		is.inserts(a);
	}
}
