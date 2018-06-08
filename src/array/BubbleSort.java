

//冒泡算法（正序—从小到大）


package array;

public class BubbleSort {

	public static void main(String[] args) {
		// 创建一个数组，这个数组是乱序排列的
		int[]array= {56,14,8,67,2,34};
		
		//创建冒泡排序类的对象
		
		BubbleSort sorter=new BubbleSort();
		
		//调用排序方法将数组排序
		
		sorter.sort1(array);  //需另外创建sort1方法
		sorter.sort2(array);

	}
//创建冒泡排序方法1（正序-从小到大）
	public void sort1(int[] array) {
		
	for(int i=1;i<array.length;i++) {
	//比较相邻两个元素，较大的数往后冒泡
	for(int j=0;j<array.length-i;j++) {
		if(array[j]>array[j+1]) {
			int temp=array[j];//把第一个元素保存到临时变量中去
			array[j]=array[j+1];//把第二个元素保存到第一个元素单元中去
			array[j+1]=temp;	//把临时变量（也就是第一个元素原值）保存到第二个元素中去
					
				}
				
			}
				
		}
	
	System.out.print("升序排列:");
	showArray(array);		//
	}

	//创建冒泡排序方法2（倒序—从大到小）
	public void sort2(int[]array) {
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<array.length-i;j++){
				
				if(array[j]<array[j+1]) {
				int temp=array[j+1];
				array[j+1]=array[j];
				array[j]=temp;
							}
						}	
					}	
	System.out.print("降序排列:");	
	showArray(array);	
		
				}
	
	
//显示数组中的每个元素	
	public void showArray(int[]array) {
		for(int i:array) {
			
			
			System.out.print(i);
			System.out.print("  ");
		}
			System.out.println();
	
	}
	
}
