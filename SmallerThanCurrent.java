public class SmallerThanCurrent {
  public static void main(String[] args) {
    int[] nums = {8, 1, 2, 2, 3};
    int[] result =smallerNumbersThanCurrent(nums);
    for(int i =0; i< nums.length; i++)
      System.out.print(result[i]);
  }
  public static int[] smallerNumbersThanCurrent(int[] nums){
    int[] temp = new int[nums.length];
    for(int i =0; i< nums.length; i++){               //check each element if its greater then increment the temp array.
      // we start both the loops by 0 because we need to check the previous element also.
      for(int j =0; j< nums.length; j++){
        if(nums[i] > nums[j]){
          temp[i]++;
        }
      }
    }
    return temp;
  }
}
