/*

Kevin Leary
Period 2
Date: 3/3/14
Chapter: 13
Excercise: Sorts

*/

public class Sort {
	
	private static double[] temp;
	
	public static void insertSort(int[] a){		//insertion sort 
		
		for(int n = 1; n < a.length; n++){
			
			int aTemp = a[n];				//set aTemp equal to the next element in the array
			
			int i = n;							//sets i equal to the element and moves by descending through the array
			while(i > 0 && aTemp < a[i - 1]){
				a[i] = a[i - 1];				//tests for a value less than aTemp and greater than 0 then inputs it
				i--;
			}
			
			a[i] = aTemp;
		}
		
	}
	
	public static void selectSort(int[] a){		//selection sort 
		
		for(int n = a.length; n > 1; n--){
			
			int max = 0;
			
			for(int i = 1; i < n; i++){
				
				if(a[i] > a[max])		//if the element of the array is great than the max then make.. 
					max = i;			//max equal to the index
				
			}
			
			int aTemp = a[max];			//sets temp equal to the max
			a[max] = a[n -1];			//then sets max equal to the next value
			a[n-1] = aTemp;				//swaps the value with the max
			
			//System.out.println(a[]);
			
		}
		
		
	}
	
	public static void mSort(double[] a){
		
		int n = a.length;
		temp = new double[n];
		mergeSort(a,  0,  n - 1);		
	}
	
	public static void mergeSort(double[] a ,  int left, int right){			//merge sort
		
		if (right - left < 2){							//recursively splits the arrays
			
			if (right > left && a[right] < a[left]){
				
				double aTemp = a[right]; 
				a[right] = a[left];
				a[left] = aTemp;
			}
		}
		
		else 
		{
			int middle = (left + right) / 2;
			mergeSort(a, left, middle);
			mergeSort(a, middle + 1, right);	
			merge(a, left, middle, right);
			
		}
		
	}
	
	public static void merge(double[] a,  int left, int right, int rightEnd){
		
		int i = left, j = right + 1, k = rightEnd;		//method merges both of the arrays into one single one 
		
		while (i <= right && j <= left){
			
			if (a[i] < a[j]){
				temp[k] = a[i];
				i++;
			}
			
			else {
				temp[k] = a[j];
				j++;
			}
			k++;
		}
		
		while (i <= right){
			temp[k] = a[i];
			i++;
			k++;
		}
		
		while (j <= left){
			temp[k] = a[j];
			j++;
			k++;
		}
		
		for (k = left; k <= right; k++)
			a[k] = temp[k];
    }
	
	public static void quickSort(int[] a){			//quick sort
		
		
	}
	
}
