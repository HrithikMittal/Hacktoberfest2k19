package JavaArray;

public class ArrayDemo {
	void turn(int arr[],int key,int n){
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
     public static void main(String[] args) {
        ArrayDemo cyclic = new ArrayDemo();
        int arr[] = {1,2,3,4,5,6,7};
        int key = 2;
        int n = arr.length;
        cyclic.turn(arr,key,n);
        cyclic.display(arr,n);
    }
}