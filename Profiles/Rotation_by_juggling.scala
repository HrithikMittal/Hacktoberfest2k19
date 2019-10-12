package Array;

public class Rotation_by_juggling {
	int gcd(int a,int b){
        if(b == 0)
            return a;
        else
            return gcd(b,a%b);
    }
    void juggle(int arr[],int key,int n){
        for(int i=0;i<gcd(key,n);i++){
            int temp = arr[i];
            int j = i;
            while(true){
                int k = j+key;
                if(k>=n)
                    k=k-n;
                if(k==i)
                    break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }
    public void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        Rotation_by_juggling juggle = new Rotation_by_juggling();
       int arr[] = {1,2,3,4,5,6,7};
       int key = 2;
       int n=arr.length;
       juggle.juggle(arr,key,n);
       juggle.print(arr,n);
    }
}
/*Time complexity : O(n)
Auxiliary Space : O(1)*/
