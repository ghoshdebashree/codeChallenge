import java.util.Scanner;
public class TwoDArray{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter the size of column : ");
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j=0; j< m; j++){
              array[i][j] = sc.nextInt();
            }
            
        }
        System.out.println("Array elements are :");
        for(int i =0 ; i<n; i++){
          for(int j=0; j< m; j++){
               System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
      }
}