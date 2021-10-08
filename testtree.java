import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class testtree {
  public static void main(String[] args) {
    Set<Integer> s = new HashSet<>();
    Set<Integer> s1 = new LinkedHashSet<>();
    Set<Integer> s2 = new TreeSet<>();
    
      s.add(1);
      s.add(5);
      s.add(10);
      s.add(2);
      s.add(20);
      s1.add(1);
      s1.add(5);
      s1.add(10);
      s1.add(2);
      s1.add(20);
      s2.add(1);
      s2.add(5);
      s2.add(10);
      s2.add(2);
      s2.add(20);
      System.out.println(s);
      System.out.println(s1);
      System.out.println(s2);
      



    
  }
  
}
