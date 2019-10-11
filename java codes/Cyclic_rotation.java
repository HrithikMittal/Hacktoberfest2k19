package Array;

public class Cyclic_rotation {
  void rotate(int arr[], int key, int n) {
    int temp = arr[n - 1];
    for (int i = n - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = temp;
  }
  void print(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
    }
  }
  public static void main(String[] args) {
    Cyclic_rotation cyclic = new Cyclic_rotation();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int key = 2;
    int n = arr.length;
    cyclic.rotate(arr, key, n);
    cyclic.print(arr, n);
  }
}
// Time Complexity: O(n)