public class Palindrome {
  public static void main(String[] args) {
    
      String str = "maddfgghhjjdam";      //Simple palindrome check by first and last element in the string.
      boolean isPalindrome = true;
      for(int i =0; i< str.length(); i++){
        if(str.charAt(i) != str.charAt(str.length() - 1 -i)){
          isPalindrome = false;
          break;
        }
      } 
      if(isPalindrome) System.out.println("Its a palindrome");
      else System.out.println("Not a palindrome");
    }
  }
  

