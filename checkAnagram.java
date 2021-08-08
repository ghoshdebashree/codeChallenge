import java.util.Arrays;
//import java.lang.Object.*;
public class checkAnagram { 
 public static void main(String args[]){
  String str1 = "debashree";
  String str2 = "shreEdabe";
  str1 = str1.toLowerCase();         //convert to all lowercase strings.
  str2 = str2.toLowerCase();
  if(str1.length() == str2.length()){         //check the size of both the strings and convert to character array.
    char[] chstr1 = str1.toCharArray();
    char[] chstr2 = str2.toCharArray();
    Arrays.sort(chstr1);
    Arrays.sort(chstr2);
    boolean result = Arrays.equals(chstr1,chstr2);
    if(result){
      System.out.println("Anagram " + str1 + " and " + str2);
      }
    else{
      System.out.println("Strings are not Anagram");
      }
    }
    
    else{
      System.out.println("Not Anagram");
      }
    }
}
      
  

