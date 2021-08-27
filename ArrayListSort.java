import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

public class ArrayListSort{

  public static int listCheck(int[] arr){
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i<arr.length;i++){
      list.add(arr[i]);
    }
    Collections.sort(list);
    int result = list.get(arr.length - 2);
    return result;

  }


    public static void main(String[] args) {
      int[] arr = {1,4,7,2,9,4,11};
      int result = listCheck(arr);
      System.out.println(result);


    }
}