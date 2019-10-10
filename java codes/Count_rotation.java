package Array;

public class Count_rotation {
//	linear search
	int countRotations(int arr[], int n) 
    { 
        int min = arr[0], min_index = 0; 
        for (int i = 0; i < n; i++) 
        { 
            if (min > arr[i]) 
            { 
                min = arr[i]; 
                min_index = i; 
            } 
        }  
        return min_index; 
    }
//	Time Complexity : O(n) 
//	Binary search
//	int countRotations(int arr[],int low, int high) {
//		if(high<low)
//			return -1;
//		if(low ==high)
//			return low;
//		int mid = (low + high)/2;
//		if (mid < high && arr[mid+1] < arr[mid]) 
//		       return (mid+1); 
//		if (mid > low && arr[mid] < arr[mid - 1]) 
//		       return mid;
//		if (arr[high] > arr[mid]) 
//		       return countRotations(arr, low, mid-1); 
//		return countRotations(arr, mid+1, high);
//		
//	}
	
	public static void main(String[] args) {
		Count_rotation count = new Count_rotation();
		int arr[] = {2, 3, 6, 12}; 
        int n = arr.length; 
        System.out.println(count.countRotations(arr, n));
//       System.out.println(count.countRotations(arr, 0 , n-1));
	}

}
// Time Complexity : O(log n)