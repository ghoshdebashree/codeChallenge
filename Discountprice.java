import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Discountprice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int number = sc.nextInt();
    float discount = 20/100;
    double[] prices = new double[number];
    for(int i =0; i< number; i++){
      prices[i] = sc.nextDouble();
    }
    double total = totalPrices(prices, discount);
    System.out.println(total);
  }
    public static double totalPrices(double[] prices, float discount){
      int total = 0;
      List<Double> list = new ArrayList<>();
      for(int i =0; i< prices.length; i++){
        list.add(prices[i]);
        
      }
      Collections.sort(list);
      int j =0;
      double[] arr = new double[prices.length];
      for(Double set:list){
        arr[j++] = set;
      }
      for(int i =0; i< prices.length; i++ ){
        System.out.print(arr[i]);
      }
      if(prices.length > 2){
              prices[prices.length-1] = (double)(arr[prices.length - 1] - (arr[prices.length - 1] * discount));
        }
        else if(prices.length == 2){
            for(int i =0; i< prices.length; i++){
              prices[i] = (double)(prices[i] - prices[i]*discount);
            }
      }
    
    for(int i =0; i< prices.length; i++){
      total+=prices[i];
    }
      
     return total;
      
    }
    
  }

