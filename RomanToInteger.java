
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

  public static int convertInteger(String str){
    Map<Character,Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int total = 0;
    for(int i = 0; i< str.length() - 1; i++){
      if(map.get(str.charAt(i)) < map.get(str.charAt(i+1))){                //if the prev value is lesser than the next the subtract from total.
        total -= map.get(str.charAt(i));
      }
      else{                                                                 // else add it to total
        total += map.get(str.charAt(i));
      }
    }
    total = total + map.get(str.charAt(str.length()-1));            //For the last character add the value to the total.     
    return total;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the string");
    String str = sc.nextLine();
    int result = convertInteger(str);
    System.out.println(result);
    }
  
}
