package Dome;

public class SelectSort {

	// 选择排序
	public void select(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			// 找到最小下标
			int index = sort(a, i);
			if (i != index) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;

			}
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
	}

	public int getMinIndexs(int a[], int begin) {
		int temp = a[begin];
		for (int i = begin; i < a.length; i++) {
			if (a[i] < temp) {
				temp = a[i];
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (temp == a[j]) {
				return j;
			}
		}
		return -1;
	}
	
	public void selectss(int a[]){
		int  temp=0,index;
		for (int i = 0; i < a.length; i++) {
			index=getMinIndexs(a, i);
			if(i!=index){
				temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]);
			
		}
		System.out.println();
	}

	public void selects(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			// 找到最小下表
			int index = sorts(a, i);
			if (i != index) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}

	}

	public int sort(int a[], int begin) {
		int index = begin;
		int min = a[begin];
		for (int i = begin; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				index = i;
			}
		}
		return index;
	}

	public int sorts(int a[], int begin) {
		int index = begin;
		int min = a[begin];
		for (int j = begin; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
				index = j;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		SelectSort ss = new SelectSort();
		int a[] = { 5, 3, 2, 6, 8, 7, 9 };
		ss.selectss(a);
	}

}
