import java.util.ArrayList;
import java.util.List;

public class matrixMaxMinCommon {
  public static List<Integer> luckyNumbers(int[][] matrix){
    List<Integer> luckyNumber = new ArrayList<Integer>();
    for(int i =0; i< matrix.length; i++){
      for(int j =0; j<matrix[0].length; j++){
        int number = matrix[i][j];
        boolean isLessRow = CheckRow(matrix, i, number);
        boolean isMaxCol = CheckCol(matrix,j ,number);
        if(isLessRow && isMaxCol){
          luckyNumber.add(number);
        }
      }
    }
    return luckyNumber;
  }

  public static boolean CheckRow(int[][] matrix, int i, int number){
    for(int j = 0; j< matrix[0].length; j++){
      if(matrix[i][j] != number && matrix[i][j] < number ) return false;
    }
    return true;
  }
  
  public static boolean CheckCol(int[][] matrix, int j, int number){
    for(int i = 0; i< matrix.length; i++){
      if(matrix[i][j] != number && matrix[i][j] > number ) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int[][] matrix = {{1,10,4,2},
                      {9,3,8,7},
                      {15,16,17,12}};
    List<Integer> luckyNumber = new ArrayList<>();
    luckyNumber = luckyNumbers(matrix);
    System.out.println(luckyNumber);
  }
}
