import java.lang.Thread;

public class ThreadTest implements Runnable {    //yeild method display, which stops the current threads execution temporarily and then execute the other precess.
  public ThreadTest(){

  }
  public void run(){
    for(int i =0; i< 5; i++){
      System.out.println(Thread.currentThread().getName() + " in control going");  
    }
    
  }
   public static void main(String[] args) {
     ThreadTest th1 = new ThreadTest();
     Thread th = new Thread(th1);
     ThreadTest th2 = new ThreadTest();
     Thread thh = new Thread(th2);
      th.start();
      thh.start();
      for (int i=0; i<3; i++)  
      {  
          // Control passes to child thread  
          th.yield();  
          System.out.println(Thread.currentThread().getName() + " in control");  
      } 
   }
  }
  


