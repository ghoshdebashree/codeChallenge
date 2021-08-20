import java.util.Scanner;
import java.util.Stack;

public class ParenthesisCheck {
  

  public static boolean checkParenthesis(String str){
    Stack<Character> stack = new Stack<>();
    for(int i =0; i< str.length(); i++){
      if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) =='['){    //first push the characters which are unique.
        stack.push(str.charAt(i));
      }
      else if(str.charAt(i) == ')' || str.charAt(i) =='}' || str.charAt(i) ==']' ){  // pop the characters and check with the next characters if its a matching.
        if(stack.size() == 0) return false;
        Character ch = stack.pop();
        if(ch=='(' && str.charAt(i) != ')') return false;
        else if(ch =='{' && str.charAt(i) != '}') return false;
        else if(ch =='[' && str.charAt(i) != ']') return false;
         
      }
    }
      return stack.size() == 0;
  }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean output = checkParenthesis(str);
        System.out.println(output);
      }
    
  }

