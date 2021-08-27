import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class mergeSorted {
  public static void main(String[] args) {
    int[] arr1 = {1,4,6,2,9,2};
    int[] arr2 = {6,1,8,9,10};
    List<Integer> list = new ArrayList<>();
    for(int i =0; i< arr1.length; i++){
      list.add(arr1[i]);
    }
    for(int i =0; i< arr2.length; i++){
      list.add(arr2[i]);
    }
   Collections.sort(list);
   System.out.println(list);
    

  }
  
  
}
