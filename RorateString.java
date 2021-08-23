public class RorateString {

  public static void main(String[] args) {
    String a = "abcdef";
    String b = "bcdefa";
    boolean result = check(a,b);
    System.out.println(result);
  }
  public static boolean check(String a, String b){          //rotate string and find its the same  or not.
    if((a.length() == b.length()) && (a+a).contains(b)) return true; //concatenate the same string and check if the other string contains the same.
    else return false;
  }
}
