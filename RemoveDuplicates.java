import java.util.HashSet;
import java.lang.String;

public class RemoveDuplicates {
  
    static void removeDuplicates(char[] cstr){            //HashSet is used to keep all the non repeating characters.
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<cstr.length; i++){
          for(int j =i+1; j<cstr.length; j++){
            if(cstr[i] != cstr [j]){                    //Compare if the characters doesn't match.
              set.add(cstr[i]);
            }
          }
        }
        StringBuilder sb = new StringBuilder();         //String Builder class to keep att the characters from the HashSet.
        for (Character character : set) {
          sb.append(character);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
      {
        String str = "debashree ghosh";
        char[] cstr = str.toCharArray();
        removeDuplicates(cstr);
      }
    }
}  

