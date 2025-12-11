package Array;
import java.util.Arrays;

public class Maxvalue {

	public static void main(String[] args) {
		int[] arr = {10,5,30,78};
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max)
				max = arr[i];
			System.out.println("max = " + max);
		}
		

	}

}
