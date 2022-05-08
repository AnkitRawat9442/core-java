package unit01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Task01_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeTheElement(array , 0); // (Optional)

	}
    
}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		int n = arr.length;
		for(int i =0 ; i< n-1 ; i++)
		{
			int min = i;
			for(int j = i+1 ; j< n ; j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;
		}
		for(int i =0 ; i< n-1 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	void findTheDuplicateElements(int[] arr) {
		System.out.print("Duplicate element : ");
		int n = arr.length;
		 for(int i = 0; i < n; i++) {  
		        for(int j = i + 1; j < n; j++) {  
		            if(arr[i] == arr[j])  
		               System.out.print(arr[i] +" ");  
		        }  
		    }  
		 System.out.println();
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		
	}
 
	void leftRotationInAnArray(int[] arr) {
		System.out.print("left rotated : ");
		int n = arr.length;
		 int temp = arr[0];
		    for (int i = 0; i < n - 1; i++)
		        arr[i] = arr[i + 1];
		 
		    arr[n-1] = temp;
		    
		    for(int i =0 ; i< n ; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();   
     
	}
    
	 void removeTheElement(int[] arr, int index)
	    {
		 int n = arr.length;
	        // If the array is empty
	        // or the index is not in array range
	        // return the original array
	        if (arr == null || index < 0
	            || index >= arr.length) {
	 
	            return ;
	        }
	 
	        // Create another array of size one less
	        int[] anotherArray = new int[arr.length - 1];
	 
	        // Copy the elements except the index
	        // from original array to the other array
	        for (int i = 0, k = 0; i < arr.length; i++) {
	 
	            // if the index is
	            // the removal element index
	            if (i == index) {
	                continue;
	            }
	            
	            // if the index is not
	            // the removal element index
	            anotherArray[k++] = arr[i];
	        }
	      System.out.print("After deleted : ");
	        for(int i =0 ; i< n ; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(); 
	    }
	 
 }
 






