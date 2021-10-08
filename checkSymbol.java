import java.util.HashMap;

public class checkSymbol {
  public static void main(String[] args) {
    String parts = "((((--------OOOO))))8869868969";
   check(parts);

  }

  public static void check(String parts){
    HashMap<Character, Integer> map = new HashMap<>();
    int count = 0;
    for(int i =0; i< parts.length(); i++){
      if(map.containsKey(parts.charAt(i))){
        map.put(parts.charAt(i), map.get(parts.charAt(i))+ 1);
      }
      else map.put(parts.charAt(i), 1);
    }

    for(int i =0; i< parts.length(); i++){
      
        if(map.get(parts.charAt(i)) != 0){
          System.out.print(parts.charAt(i));
          count = map.get(parts.charAt(i));
          System.out.print(count);
          map.put(parts.charAt(i), 0);
        }
    
    }
    
  }
  
}
