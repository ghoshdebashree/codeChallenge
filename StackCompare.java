import java.io.*;
import java.util.*;


public class StackCompare {
    public static void main(String[] args) throws IOException {
        
         int[] arr = {4,5,5,1};
        
         int[] out = funGame(arr);
          // System.out.print(out_[0]);
         for(int i=0; i<out.length; i++)
         {
         	System.out.print(" "+out[i]);
         }

    }
    static int[] funGame(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] out = new int[arr.length];
        if(stack.empty()){
        for(int i =0;i< arr.length; i++){
            stack.push(arr[i]);
            int value = stack.pop();
            if(arr[arr.length -1] > value){
                out[i] = 2;
            }
            else if(arr[arr.length - 1] == value){
                out[i] = 0;
             }
             else{
                 out[i] = 1;
             }
        }
      }
      return out;
    
   }
}