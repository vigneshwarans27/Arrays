package Array;
import java.util.Arrays;

public class Diagonalin2d {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println("main diagonal:");
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][i] + "");
		}

	}

}
