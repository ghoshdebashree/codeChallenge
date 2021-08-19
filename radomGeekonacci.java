public class radomGeekonacci {
  
    public static void main (String[] args) {
  
        int[] arr1 = { 1, 3, 2, 4 };
        int[] arr2 = { 1, 3, 2, 5 };
        int[] arr3 = { 1, 3, 2, 6 };
        arr1[3] = arr1[2] + arr1[1]+ arr1[0];
        arr2[3] = arr1[3] +arr2[2]+ arr2[1];
        arr3[3] = arr2[3] + arr1[3] +arr3[2];
       
        
        System.out.println(arr1[3]);
        System.out.println(arr2[3]);
        System.out.println(arr3[3]);
    }
}
