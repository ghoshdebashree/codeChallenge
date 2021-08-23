import java.util.Scanner;

public class numReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long newnum = check(n);
    System.out.println(newnum);
  }

  public static long check(long n) {
    long rev = 0;
    if (n < Math.pow(2, 32)) {            //check the number if it is more than 32 bit.
      while (n > 0) {                     //condition for reversing the number.
        long rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
      }
      return rev;
    }

    else {                                    // if the number is violating the constraint then return 0.                       
      return 0;
    }
  }
}
