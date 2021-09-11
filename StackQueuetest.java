import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class StackQueuetest{
  public static void main(String[] args) {
    

  Stack<Integer> stack = new Stack<>();
  Queue<Integer> queue = new LinkedList<>();
  int[] arr = {1,4,5,6};
  for(int i =0; i< arr.length; i++){
    stack.push(arr[i]);
  }
  for(int j =0 ; j< arr.length;j++){
    queue.add(arr[j]);
  }
 
    System.out.println(stack.peek());
    System.out.println(stack);

    System.out.println(queue.remove());
    System.out.println(queue);
  }
}



