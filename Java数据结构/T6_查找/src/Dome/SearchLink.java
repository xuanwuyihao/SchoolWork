package Dome;

public class SearchLink {

	//查找：
	//	线性查找
	//	折半查找
	
	public boolean bearch(int a[],int key){
		boolean bl=false;
	for(int i=0;i<a.length;i++){
		if(a[i]==key){
			System.out.println("你要查找的数据在第"+(a[i])+"个");
			return true;
		}
		
		}
	return bl;
	}
	
	//折半查找
	public boolean bsearch(int a[],int key){
		int left=0;
		int right=a.length-1;
		while(left<=right){
			int middle=(right+left)/2;
			if(key>a[middle]){
				left=middle+1;
			}else if(key<a[middle]){
				right=a[middle]-1;
			}else if(key==a[middle]){
				System.out.println("你要找的数据在第"+(a[middle])+"个");
				return true;
			}
		}
		return false;
	}
	
	//递归折半查找
	public boolean pbsearch(int a[],int key,int left,int right){
		int middle=(left+right)/2;
		if(left>right){
			System.out.println("你要查找的不存在！");
		}else{
			if(key>a[middle]){
				this.pbsearch(a, key, left, right+1);
			}else if(key<a[middle]){
				this.pbsearch(a, key, left-1, right);
			}else if(key==a[middle]){
				System.out.println("你要查找的数在第"+(middle+1)+"个");
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		SearchLink sl=new SearchLink();
		int a[]={1,2,3,4,5,6,8,9};
		//sl.bearch(a, 6);
		sl.bsearch(a, 3);
		int left=0;
		int right=a.length-1;
		sl.pbsearch(a, 3, left, right);
	}
}
