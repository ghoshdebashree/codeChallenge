public class ThreadJoinExample extends Thread {   //// Thread join() method demonstration, where the current one waits for the process to die.
  public void run(){
    for(int i =1; i<=5; i++){
      try{
        Thread.sleep(3000);
      }
      catch(Exception e){
        System.out.println(e);
      }
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    ThreadJoinExample th1 = new ThreadJoinExample();
    ThreadJoinExample th2 = new ThreadJoinExample();
    ThreadJoinExample th3= new ThreadJoinExample();
    th1.start();
    try{
          th1.join();
    }
    catch(Exception e){ System.out.println(e);}
    th2.start();
    th3.start();
  }
  
}
