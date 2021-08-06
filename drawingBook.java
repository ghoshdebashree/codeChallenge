public class drawingBook {
public static void main(String[] args) {          //count the number of turns to reach to a desired page.
  int n =5;
  int p =4;
  int result = pageCount(n, p);
  System.out.println(result);
}
    
public static int pageCount(int n, int p) {
  int totalPageTurnCountFromFront = n / 2;
  int targetPageTurnCountFromFront = p / 2;
  int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;
  
  return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
  
}
}
      
  

