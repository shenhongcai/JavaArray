

//ð���㷨�����򡪴�С����


package array;

public class BubbleSort {

	public static void main(String[] args) {
		// ����һ�����飬����������������е�
		int[]array= {56,14,8,67,2,34};
		
		//����ð��������Ķ���
		
		BubbleSort sorter=new BubbleSort();
		
		//�������򷽷�����������
		
		sorter.sort1(array);  //�����ⴴ��sort1����
		sorter.sort2(array);

	}
//����ð�����򷽷�1������-��С����
	public void sort1(int[] array) {
		
	for(int i=1;i<array.length;i++) {
	//�Ƚ���������Ԫ�أ��ϴ��������ð��
	for(int j=0;j<array.length-i;j++) {
		if(array[j]>array[j+1]) {
			int temp=array[j];//�ѵ�һ��Ԫ�ر��浽��ʱ������ȥ
			array[j]=array[j+1];//�ѵڶ���Ԫ�ر��浽��һ��Ԫ�ص�Ԫ��ȥ
			array[j+1]=temp;	//����ʱ������Ҳ���ǵ�һ��Ԫ��ԭֵ�����浽�ڶ���Ԫ����ȥ
					
				}
				
			}
				
		}
	
	System.out.print("��������:");
	showArray(array);		//
	}

	//����ð�����򷽷�2�����򡪴Ӵ�С��
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
	System.out.print("��������:");	
	showArray(array);	
		
				}
	
	
//��ʾ�����е�ÿ��Ԫ��	
	public void showArray(int[]array) {
		for(int i:array) {
			
			
			System.out.print(i);
			System.out.print("  ");
		}
			System.out.println();
	
	}
	
}
