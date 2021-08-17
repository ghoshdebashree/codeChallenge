import java.util.Scanner;

public class FindAllPalindrome {                        //The function checks the palindrome in a string.
  int count =0;
  public static boolean palindromeCheck(String input, int i, int j){
    while(i < j){
      if(input.charAt(i) != input.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static int countPalindrome(String input){          //Two loops are running to find out the substring present which is a palindrome.
    int count =0;
    for(int i =0; i<input.length(); i++){
      for(int j= i+1; j<input.length(); j++){
        if(palindromeCheck(input, i, j)){
          System.out.println(input.substring(i, j+1));      //initially its a check for input.substring(0,2)[which gives the first two characters in astring.]
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner str = new Scanner(System.in);
    String input = str.nextLine();
    int count = countPalindrome(input);
    System.out.println(count);
  }
  
}
