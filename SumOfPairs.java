import java.util.HashMap;

public class SumOfPairs {
  

    public static String findPair(int[] arr) {
  
      String result = "";
      int sum ;
      HashMap<Integer, int[]> hmap = new HashMap<>();             //HashMap to collect the list of the sum and the elements whose sum has to be checked
      for(int i =0; i< arr.length; i++){
        for(int j =i+1; j< arr.length; j++){
            sum = arr[i] + arr[j];
        
      if(!hmap.containsKey(sum)) hmap.put(sum, new int[]{arr[i], arr[j]});  
      else{
        int[] prev_pair = hmap.get(sum);                              //contains the pair whose sum is present in the list.
        result+= "{" +prev_pair[0]+ "," +prev_pair[1]+"}{"+arr[i]+ "," +arr[j]+ "}";
        return result;
      }
    }
  }
      return result;
  }
    public static void main(String[] args) {
      int[] arr = {3,4,7,1,12,9};
      String result = findPair(arr);
      System.out.println(result);
      
    }
  }

