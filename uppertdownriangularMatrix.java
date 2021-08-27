public class uppertdownriangularMatrix {
  public static void main(String[] args) {
    int[][] matrix = {{1,0,1},
                      {0,3,0},
                      {0,0,17,}};
    boolean up = checkUpperTriangular(matrix);
    boolean down = checkDownTriangular(matrix);
    System.out.println(up);
    System.out.println(down);
  }                 
    public static boolean checkUpperTriangular(int[][] matrix){
      for(int i =0; i<matrix.length; i++){
        for(int j =0; j<i;j++){
          if(matrix[i][j] != 0) return false;
        }
      }  
      return true;
    }

    public static boolean checkDownTriangular(int[][] matrix){
      for(int i =0; i<matrix.length; i++){
        for(int j =i+1; j<matrix[0].length;j++){
          if(matrix[i][j] != 0) return false;
        }
      }  
      return true;
    }
  }

