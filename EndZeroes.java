public class EndZeroes{
  public static void main(String[] args){
    int[] arr = {1,2,0,4,0,5,0,6,7,0};
    printArray(arr);
    endZero(arr, arr.length);
    printArray(arr);
  }

  public static void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    public static void endZero(int[] arr, int n){
      int j = 0;
      for(int i = 0; i<n; i++){
        if(arr[i] != 0){
          if(arr[j] == 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
          j++;
        }
      }
    }
}