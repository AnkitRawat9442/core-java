//Q8. WAP in java, to delete index=3, element from the given array
//mentioned below.
//Int[] arr = {1,2,3,4,5,6,7,8,9}
//Note: Non relevance places would be filled with zeros.v

package assignment_01;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int n = sc.nextInt();
	int arr[]  = new int [n];
 	for(int i =0 ;i< n ; i++)
		arr[i] = sc.nextInt();
    System.out.println("Before Deletion  ");
    for(int i =0 ;i< n ; i++)
		System.out.print(arr[i] + " ");
    System.out.println();
    int k = 3 ; // deletion index
    for(int i =k ;i< n -1 ; i++)
		arr[i] = arr[i+1];
    arr[n-1] = 0;
    System.out.println("After Deletion "+k+"th index ");
    for(int i =0 ;i< n ; i++)
		System.out.print(arr[i] + " ");
    System.out.println();
 	 }
}


