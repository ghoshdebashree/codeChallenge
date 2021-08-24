public class permutationWord {
  public static void main(String[] args) {
    String str = "ABC";
    int low = 0;
    int high = str.length() -1;
    permute( str, low, high);

  }
  public static void permute(String str, int low, int high){
    if(low == high) System.out.println(str);
    else{
    for(int i =low;i<= high; i++){
      str = swap(str, 0, i);                    //initially we swap A with A, then A with B and again A with C
      permute(str,low+1,high);
      str = swap(str, 0, i);                //We use a back tracking here.
    }
  }
}
  public static String swap(String str,int i, int j){
    char temp;
    char[] ch = str.toCharArray();
    temp = ch[i];
    ch[i] = ch[j];
    ch[j] = temp;
    return String.valueOf(ch);

  }
}
