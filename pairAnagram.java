import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

public class pairAnagram{

  public static String groupAnagrams(String[] arr){
    HashSet<List<String>> set = new HashSet<>();
    boolean[] visited = new boolean[arr.length];
    for(int i = 0; i < arr.length; i++){
      ArrayList<String> pairs = new ArrayList<>();
      for(int j =i+1; j<arr.length; j++){
        if(visited[j] == true) continue;
        if(isAnagram(arr[i], arr[j])){
          pairs.add(arr[j]);
          visited[j] = true;
        }
      }
      if(pairs.isEmpty() == false) { // If not empty add it to my set
        pairs.add(arr[i]);
        set.add(pairs);
      }
    }
    
    // Extract data from hashset
    String anagrams = "";
    Iterator<List<String>> iterator = set.iterator();

    while (iterator.hasNext()) {            //Convert to String
      List<String> data = iterator.next();
      anagrams += data.toString();
    }
    return anagrams;
  }
    public static boolean isAnagram(String str1, String str2){
      if(str1.length()!= str2.length()) return false;
      char[] chstr1 = str1.toCharArray();
      char[] chstr2 = str2.toCharArray();
      Arrays.sort(chstr1);
      Arrays.sort(chstr2);
      for(int i = 0; i < chstr1.length; i++){
        if(chstr1[i] !=chstr2[i]) return false;
      }
      return true;
    }
    public static void main(String[] args) {
      String arr[] = {
       "cat",
       "dog",
       "tac",
       "god",
       "act",
       "tom marvolo riddle ",
       "abc",
       "def",
       "cab",
       "fed",
       "clint eastwood ",
       "i am lord voldemort",
       "elvis",
       "old west action",
       "lives"
      };
      System.out.println(groupAnagrams(arr));
     }
  }
   
   
  