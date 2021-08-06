
import java.util.HashSet;

public class primeSTillRange{
public static void main(String[] args) {
    var set  = new HashSet<Integer>();
    int value = 15;                       //Find the sequence of the list which consists of all the prime numbers till the value
    int i;
    boolean isPrime = false;
    for(i =2;i<value;i++){
      isPrime = calculate(i);
      if(!isPrime){
           set.add(i);
        
      }
    }
  System.out.println(set);
}
    
    
 public static boolean calculate(int number){
   for(int j =2;j<=number/2;j++){
      int remainder = number % j;
      if(remainder == 0){
          return true;
      }
    }
    return false;
  }
}
