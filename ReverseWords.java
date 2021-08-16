import java.util.Scanner;

public class ReverseWords{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();   //seperate with a blank space.
  String[] words = str.split(" ");
  System.out.println(words.length);
  for(int i= 0; i< words.length; i++){
    System.out.print(words[words.length -1 -i]+" ");
  }
  sc.close();
  }
}
