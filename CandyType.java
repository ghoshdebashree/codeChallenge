
import java.util.HashSet;

public class CandyType {

  public static void main(String[] args) {
  int[] array = {1,1,2,2,3,3,4,4};
  
   int half = array.length/2;
   var set = new HashSet<Integer>();
    for(int i =0; i<array.length && set.size() <half;i++){
      set.add(array[i]);
    }
  System.out.println(set.size());
  }
}