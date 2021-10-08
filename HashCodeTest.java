public class HashCodeTest {
  public static void main(String[] args) {
    String str = "vaibhav";
    char[] chararray = str.toCharArray();
    Character ch = chararray[0];
    int hash = (int)ch.hashCode();
    int result = hash & 15;
    System.out.println(result);
  }
}
