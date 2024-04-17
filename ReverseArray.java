public class ReverseArray{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9};
    printArray(arr);
    int[] result = reverseArr(arr);
    printArray(result);
  }

  public static void printArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int[] reverseArr(int[] arr){
    int n = arr.length;
    int[] result = new int[n];
    for(int i = 0; i<n; i++){
      result[i] = arr[n-i-1];
    }
    return result;
  }
}