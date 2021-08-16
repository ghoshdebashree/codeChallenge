public class IPAddress {
 
    public static String defangIPaddr(String address) {
        
      String res = " ";                                 //Taking empty string and concatenate it with the string values.
      for (int i = 0; i < address.length(); i++) {
          if (address.charAt(i) == '.') {               //if the character is . then it will be changed to [.]
              res += "[.]" ;
          } 
          else {                                        //Otherwise add the string with the value.
             res += address.charAt(i);
          }
      }
      return res;
   }
    public static void main(String[] args) {
      String address = "1.1.1.1";
      String str = defangIPaddr(address);
      System.out.println(str);

    }
}
  

