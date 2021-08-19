import java.util.Scanner;


class Geekonacci {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
     /// number of times the input can be taken.
		int numberOfTimes = sc.nextInt();
    int pos =3;
		System.out.println("Take the inputs A B C and N from user.");
		int[][] input = new int[6][6];

		for(int i = 0; i<numberOfTimes ; i++){
	        for(int j = 0; j<pos;j++){
		        input[i][j] = sc.nextInt();
	        }
		 }
   
       

    for(int i = 0; i<numberOfTimes ; i++){
      
        System.out.println(input[i][numberOfTimes]);
      }
    
     sc.close();

	}
}