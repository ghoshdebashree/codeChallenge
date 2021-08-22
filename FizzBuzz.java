import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

  public static List<String> checkFizzBuzz(int range){
    List<String> list = new ArrayList<>();
    
    for(int i =1; i<= range; i++){
      if(i % 3 == 0 && i % 5 == 0){                   //checking for the two numbers together 3 and 5 should come on the first .
        list.add("fizzbuzz");
      }
      else if(i % 5 ==0){
        list.add("buzz");
      }
      else if(i % 3 == 0){
        list.add("fizz");
      }
      else{
        list.add(String.valueOf(i));
      }    
    }
    
    return list;
}

public static void main(String[] args) {
  int range = 15;
  List<String> list = checkFizzBuzz(range);
  System.out.println(list);
}
}
