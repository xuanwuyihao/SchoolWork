package Dome;

public class QuickSort {

	//快速排序
	//1.从0-n左边开始查找最大值  后边开始查找最小值     查完完成进行交换位置
	
	public int[] qsort(int[] data,int low,int high){
		int pos;//划分后的基准记录位置
		if(low<high){
			pos=patition(data, low,high);//找到M的坐标
			
			qsort(data, low, pos-1);
			qsort(data, pos+1, high);
		}
		return data;
	}
	
	//i最小下标 j最大下标 size是数组总大小 i=0 j=a.lenght 6,5,8,3,7 data[j]=8    j=2  -->j=1      3 5 6 8 7
	public int patition(int[] data,int i,int j){
		int m=data[i];//设第一个为m
		while(i<j){//把所有数都遍历一遍
			while(i<j&&data[j]>=m){//逐个往左找
				j--;
			}
			if(i<j){
				data[i++]=data[j];
			}
			
			while(i<j&&data[i]<=m){//逐个往右找
				i++;
				
			}
			if(i<j){
				data[j]=data[i];
				j--;
			}
			
		}
		data[i]=m;
		System.out.println("m="+data[i]);
		for(int k=0;k<data.length;k++){
			System.out.print(data[k]+"  ");
			
		}
		System.out.println();
		return i;
		
	}
	
	public static void main(String[] args) {
		int[] data = {6,5,8,3,7,2,9,1};
		QuickSort qs=new QuickSort();
		int[] newdata=qs.qsort(data, 0, data.length-1);
		for(int i=0;i<newdata.length;i++){
			System.out.print (newdata[i]+"");
		}
	}
}
