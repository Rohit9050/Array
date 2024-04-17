public class Demo{
  public static void main(String[] args){
    Demo d1 = new Demo();
    d1.arrayDemo();
  }

  public void arrayDemo(){
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    printArray(arr);
  }

  public void printArray(int[] arr){
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}