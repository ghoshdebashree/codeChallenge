public class HashCodeDemo {
  public static void main(String[] args) {
    String str1 = "abcd";
    String str2 = "abdcd";
    int hashvalue1 = (int)str1.hashCode();
    int hashvalue2 = (int)str2.hashCode();
    if(hashvalue1 == hashvalue2) System.out.println("True");
    else System.out.println("False");
    
  }
}
