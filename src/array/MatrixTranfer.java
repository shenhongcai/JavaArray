package array;

public class MatrixTranfer {

	public static void main(String[] args) {
		// ����һ��3x3�ľ���
		int matrix_3x3[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("ԭ����:");
		for(int i=0;i<matrix_3x3.length;i++) {
				for(int j=0;j<matrix_3x3[i].length;j++) {
					
					System.out.print(matrix_3x3[i][j]);
					System.out.print("  ");
				}
				
			System.out.println();
			
			
		}
		System.out.println("�����:");
		for(int i=0;i<matrix_3x3.length;i++) {
			for(int j=0;j<matrix_3x3[i].length;j++) {
				
				System.out.print(matrix_3x3[j][i]);
				System.out.print("  ");
			}
			
		System.out.println();
		
		
	}
		
		

	}

}
