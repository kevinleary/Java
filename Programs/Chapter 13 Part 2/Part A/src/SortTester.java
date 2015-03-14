import java.util.Arrays;


//sort tester class
public class SortTester {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 2, 7, 7, 9, 10, 11, 1, 4, 6};			//10 int array for select
		int[] arr2 = {4, 5, 5, 5, 2, 2, 4, 5, 6, 8};			//10 int array for insert
		double[] arr3 = {1, 6, 4, 7, 4, 9, 10, 11, 3, 4};			//10 double array for merge 
		int[] arr4 = {3, 3, 8, 9, 2, 4, 28, 3, 16, 14};			//10 int arrat for quick sort
		//Sort s = new Sort();
		
		
		
		//selection sort
		System.out.println("The original array for the selection sort is " + Arrays.toString(arr1));
		Sort.selectSort((arr1));
		System.out.println("The array sorted using selection sort is " + Arrays.toString(arr1));		//The Arrays wrapper class comes with a 
		System.out.println(); 																				//toString(int[]) method
		
		//insertion sort
		System.out.println("The original array for the insertion sort is " + Arrays.toString(arr2));
		Sort.insertSort((arr2));
		System.out.println("The array sorted using insertion sort is " + Arrays.toString(arr2));
		System.out.println();
		
		//merge sort
		System.out.println("The original array for the merge sort is " + Arrays.toString(arr3));
		//Sort.mSort((arr3));			//it wont print for some reason going to have to ask for your help
		System.out.println("The array sorted using merge sort is " + Arrays.toString(arr3));
		System.out.println();
		
		/* //quick sort ***
		System.out.println("The original array for the quick sort is" + Arrays.toString(arr4));
		Sort.selectSort((arr4));
		System.out.println("The array sorted using quick sort is " + Arrays.toString(arr4));
		System.out.println();
		*/
		
	}

}
