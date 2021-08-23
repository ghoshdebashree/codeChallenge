public class BalancedString {

  public static void main(String[] args) {
    String s ="RLRRLLRLRL";
    int result = balancedStringSplit(s);
    System.out.println(result);
  }
    public static int balancedStringSplit(String s) {
        
        int result = 0, countL = 0, countR = 0;             
        for(int i=0;i<s.length();i++){
        Character elem = s.charAt(i);
        if(elem == 'R'){                  //if the character 'R' is equal to character 'L' then the count will be incremented and found that the its a balanced string
                countR++;
            }
            else {
                countL++;
            }
        if(countL == countR){
                result++;
            }
        }
        return result;
    }
}

    
  

