package Array;

public class Multiple_left_rotations {
	void leftRotate(int arr[],int n, int k) 
	{ 
		for (int i = k; i < k + n; i++) 
			System.out.print(arr[i % n] + " "); 
	} 
 
	public static void main (String[] args) 
	{ 	Multiple_left_rotations multiple = new Multiple_left_rotations();
		int arr[] = {1, 3, 5, 7, 9}; 
		int n = arr.length; 
		int k = 2; 
		multiple.leftRotate(arr, n, k); 
		System.out.println(); 
	} 
} 