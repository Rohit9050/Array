public class SecondMaximum{
  public static void main(String[] args){
    int[] arr = { 12,13,45,56,78,101,201,14,56};
    printArray(arr);
    int result = secondMax(arr);
    System.out.println(result);
  }

  public static void printArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int secondMax(int[] arr){
    int max = Integer.MIN_VALUE;
    int second_max = Integer.MIN_VALUE;

    for(int i = 0; i<arr.length; i++){
      if(arr[i] > max){
        second_max = max;
        max = arr[i];
      }
      else if(arr[i] >second_max && arr[i] != max){
        second_max = arr[i];
      }
    }
    return second_max;
  }
}