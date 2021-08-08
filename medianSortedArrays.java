import java.util.ArrayList;
import java.util.Collections;

public class medianSortedArrays {
  public static void main(String[] args) {
    int[] arr1 = {100};
    int[] arr2 = {1,5,8,10,20};
    ArrayList<Integer> list = new ArrayList<>();      //Arraylist to add the elements of two arrays.
    for(Integer i: arr1){
      list.add(i);
    }
    for(Integer i: arr2){
      list.add(i);
    }
    Collections.sort(list);
    System.out.println(list);
    Integer[] newarr = new Integer[arr1.length + arr2.length];    // Convert the Arraylist to integer.
    list.toArray(newarr);
    double mid = median(newarr);
    System.out.println(mid);

  }
    public static double median(Integer[] arr){
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
}



