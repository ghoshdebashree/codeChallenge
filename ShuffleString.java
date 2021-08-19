import java.util.Iterator;
import java.util.Stack;

public class ShuffleString
 {
  public static void main(String[] args) {
    String s = "abcdef";
    Stack<Character> stack = new Stack<>();
    int[] indices = {3,4,2,1,0,5};
    
      for(int j =0; j<indices.length; j++){
      stack.push( s.charAt(indices[j]));

    
  }
  Iterator<Character> itr = stack.iterator();                         //Iterate through the stack and convert to string.
  while(itr.hasNext()){
    String res = itr.next().toString();
    System.out.print(res);
  }

}
}