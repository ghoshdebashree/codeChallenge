import java.util.Stack;


class RemoveVowels {
  public static void main(String[] args) {
    String s  = "A very good person he is.";
    String newstr = removeVowels(s);
    System.out.println(newstr);
  }
  public static String removeVowels(String s) {
      
    Stack<Character> stack = new Stack<>();                 //check all the vowels including the upper case values and then push into the stack.
    char[] ch = s.toCharArray();
    for(int i =0; i<ch.length; i++){
          if((ch[i] !='a' && ch[i] !='A')&&(ch[i] !='e' && ch[i] !='E')&&(ch[i] !='i' && ch[i] !='I')&&(ch[i] !='o' && ch[i] !='O')&&(ch[i] !='u' && ch[i] !='U')){
              stack.push(ch[i]);
      }
      
  }
    StringBuilder sb = new StringBuilder();
    for(Character character :stack){
        sb.append(character);
    }
      
      String newstr = sb.toString();
      return newstr;
  }
}