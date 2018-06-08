

/*将数组中的数进行排序，并输出*/

package array;
import java.util.Arrays;
public class Arrayrank {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		int array[]= {1,34,23,87,5,67,14};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			System.out.print("  ");
		}
		
		
	}

}
