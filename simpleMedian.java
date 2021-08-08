public class simpleMedian {
  public static double median(int[] arr){
    int low = 0;
    int high = arr.length -1;
    float lengthOne = arr.length;
    if(lengthOne % 2 == 0){                           //if array size is even then find the left and right index and find average of two.
      int leftindex = low +( high-low) / 2;
      int rightindex = leftindex + 1;
      double mid =arr[leftindex]  + arr[rightindex];
      return mid/2;
    }else{
        int  mid = low + high/2;                      //otherwise mid element.
      return arr[mid];
    }
   
  }

public static void main(String[] args) {
  int[] arr = {1,3,4,5};
  double mid = median(arr);
  System.out.println("Median of array  : " +mid);
 
  }  
}
