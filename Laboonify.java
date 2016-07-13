import java.util.Arrays;

public class Laboonify {
	
	public static void main(String[] args) {
		
	}
	/* This is the laboonify method. It takes an array as a parameter
	 * and creates an array of the same length, plus one extra
	 * index. Then, for each index of the input array, the value is squared and put into the corresponding
	 * index in the new array. While this is being done, there is a sum counter which adds each new value 
	 * added to the new array to itself.
	 * After this has been done for the length of the input array, the sum counter is stored in the final
	 * index of the new array and is returned.
	 */
	public static int[] laboonify(int[] input){
		int[] output = new int [input.length+1];
		int sum = 0;
		for (int i=0; i<input.length;i++){
			int val = input[i];
			val = val*val;
			output[i]=val;
			sum+=val;
		}
		output[input.length]=sum;
		return output;
	}
	
}
