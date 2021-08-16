
import java.util.HashSet;


public class RemoveSpace {
  public static void main(String[] args) {
    String str = "A very good morning to all.";
    char[] ch = str.toCharArray();
    HashSet<Character> set = new HashSet<>();           //Used HashSet to store the data output but the order will change.

    
    for(int i =0; i< ch.length; i++) {
      if(ch[i] !=' ' && ch[i] != '\t'){
        set.add(ch[i]);
      }
    }
    StringBuilder sb = new StringBuilder();
    for(Character st:set){
      sb.append(st);
    }
    System.out.println(sb);  
  }
}