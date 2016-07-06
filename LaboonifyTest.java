import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;


public class LaboonifyTest {
	Random rng = new Random();
	/*
	 * This method generates and returns an array with a random size between 1 and 100, while filling it
	 * with values between 1 and 100
	 */
	public int[] genArray(){
			int[] a= new int[rng.nextInt(100)+1];
			for (int j=0;j<a.length-1;j++){
				a[j]=rng.nextInt(100)+1;
			}
		return a;
	}
	/*
	 * We will test to see if the size of the input array is always one less than the output array,
	 * as the array returned by laboonify should be the same size as the input array, with one extra index
	 * to hold the summation of the previous indexes. If it is not exactly one less, than the test is failed 
	 */
	@Test
	public void firstInvariant() {
		/* for loop to test 100 arrays*/
		for (int i=0; i<100;i++){
			/*generates array */
			int[] a= genArray();
			/*laboonifies the input array and stores the data in the outputArray[] array*/
			int outputArray[] = Laboonify.laboonify(a);
			/*compares the length of both arrays to one another.*/
			int x = outputArray.length-a.length;
			/*if the difference between the two array is not 1, then the test will fail*/
			if(x!=1){
				fail();
			}
		}
		/*if 100 arrays have been tested, the test is passed*/
		assertTrue(true);
			
	}
	/*
	 * This test compares the ith index of the input array to the ith index of the laboonified array. If the
	 * ith index of the laboonified array is not equal to the square of the ith index of the input array
	 * the test is failed.  
	 */
	@Test
	public void secondInvariant () {
		/*tests 100 arrays*/
		for (int i=0; i<100;i++){
			/*generates the array*/
			int[] a= genArray();
			/*laboonifies the array*/
			int outputArray[] = Laboonify.laboonify(a);
			/*test each index of the array*/
			for (int k = 0; k<a.length; k++)
			{
				/*determines the squared value of the kth index of the inputArray and the kth index of 
				 * the laboonified array. If they are not the same, the test fails.
				 */	
				int inputValSquared = a[k] * a[k];
				int outputVal = outputArray[k];
				if(inputValSquared!=outputVal){
					fail();
				}
				
			}
		}
		/*test is passed after 100 arrays are tested*/
		assertTrue(true);
	}

	/*
	 * This test checks if the final index of the laboonified array is the summation of all the previous
	 * indexes. It does this by adding up all the indexes except for the final one, and compares that value
	 * to the final index. If it is not the same, the test fails.  
	 */
	@Test
	public void thirdInvariant() {
		/*test 100 arrays*/
		for (int i=0; i<100;i++){
			/*generate array*/
			int[] a= genArray();
			/*laboonifies the array*/
			int outputArray[] = Laboonify.laboonify(a);
			int sumOfOutputVals = 0;
			/*adds up each of the indexes of the laboonified array into sumOfOutputVals, except fot the last
			 * index
			 */
			for (int k = 0; k<outputArray.length-1; k++)
			{
				sumOfOutputVals = sumOfOutputVals + outputArray[k];
			}
			/*If the sum the laboonified array minus the last index is not equal to
			 * the last index of the laboonified array, the test fails
			 */
			if(sumOfOutputVals!=outputArray[outputArray.length-1]){
				fail();
			}
		}
		/*test passes after 100 arrays are tests*/
		assertTrue(true);
	}
	
}


