import java.util.Stack;


public class RemoveSpaceUsingStack {
  public static void main(String[] args) {
    String str = "A very goodmorning to all.";
    Stack<Character> stack = new Stack<Character>();      // Using Stack Datastructure we can get a the exact order of a String output.
    char[] ch = str.toCharArray();
    for(int i =0; i<ch.length;i++){
      if(ch[i] !=' ' && ch[i] !='\t')
      stack.push(ch[i]);
    }
      StringBuilder sb = new StringBuilder();
      for(Character character :stack){
          sb.append(character);

      }
      System.out.println(sb);
      
     
    }
}
  

