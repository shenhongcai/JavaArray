package array;

public class MatrixTranfer {

	public static void main(String[] args) {
		// 创建一个3x3的矩阵
		int matrix_3x3[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("原矩阵:");
		for(int i=0;i<matrix_3x3.length;i++) {
				for(int j=0;j<matrix_3x3[i].length;j++) {
					
					System.out.print(matrix_3x3[i][j]);
					System.out.print("  ");
				}
				
			System.out.println();
			
			
		}
		System.out.println("逆矩阵:");
		for(int i=0;i<matrix_3x3.length;i++) {
			for(int j=0;j<matrix_3x3[i].length;j++) {
				
				System.out.print(matrix_3x3[j][i]);
				System.out.print("  ");
			}
			
		System.out.println();
		
		
	}
		
		

	}

}
