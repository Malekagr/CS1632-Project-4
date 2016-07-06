import java.util.Arrays;

public class Laboonify {
	
	public static void main(String[] args) {
		
	}
	/* laboonify method. Takes an input array and creates an array of the same length, plus one extra
	 * index. Then, for each index of the input array, the value is squared and put into the corresponding
	 * index in the new array. While this is being done, there is a sum counter which adds each new value 
	 * added to the new array to itself.
	 * After this has been done for the length of the input array, the sum counter is stored in the final
	 * index of the new array and is returned.
	 */
	public static int[] laboonify(int[] x){
		int[] y = new int [x.length+1];
		int sum = 0;
		for (int i=0; i<x.length;i++){
			int a = x[i];
			a = a*a;
			y[i]=a;
			sum+=a;
		}
		y[x.length]=sum;
		return y;
	}
	
}
