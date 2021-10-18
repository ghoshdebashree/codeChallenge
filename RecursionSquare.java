public class RecursionSquare {
  public static void main(String[] args) {
      int input = 6;
      int output = square(input);
      System.out.println("The square of the number is " +output);
  }
  public static int square(int input){
      if(input == 0){
          return 0;
      }
      else{
          return square(input - 1) + 2 * input - 1;
      }
  }
}
