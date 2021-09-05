class Test2  {  

  Test2(int a, int b)   {     
  System.out.println("a = "+a+" b = "+b); 
 
   }   
 
 Test2(int a, float b)   {   
 
       System.out.println("a = "+a+" b = "+b);
 
    }   
 
 public static void main(String args[])   {  
 
    byte a = 10;      
    byte b = 15;    
    Test2 test2 = new Test2(a,b); 
 
   }
 
  }
