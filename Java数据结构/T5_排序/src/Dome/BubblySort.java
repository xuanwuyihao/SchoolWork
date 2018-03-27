package Dome;

import sun.misc.Sort;

public class BubblySort {
	//冒泡排序
	
	public void sort(int a[]){
		int temp=0;
		//外层循环控制趟数
		for(int i=0;i<a.length;i++){
			//内层循环控制次数
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				for(int k=0;k<a.length;k++){
					System.out.print(a[k]);
				}
				System.out.println();
			}
		}
	}
	
	public void sortss(int a[]){
		int temp=0;
		//外层循环控制趟数
		for(int i=0;i<a.length;i++){
			//内层循环控制次数
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public void sorts(int a[]){
		int temp=0;
		//外层循环控制趟数
		for(int i=0;i<a.length;i++){
			//内层循环控制次数
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
				
			}
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		BubblySort by=new BubblySort();
		int a[]={5,3,2,6,8,7,9};
		by.sortss(a);
	}

}
