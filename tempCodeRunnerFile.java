public class MissingNumber{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,8};
    int size = arr.length;
    printArray(arr);
    int result = findMissingNumber(arr);
    System.out.println(result);

  }

  public static void printArray(int[] arr){
    int n = arr.length;
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int findMissingNumber(int[] arr){
    int sum = 0;
    int n = arr.length +1;
    sum = n*(n+1) /2;
    for(int i = 0; i<arr.length; i++){
      sum -= arr[i];
    }
    return sum ;
  }
}