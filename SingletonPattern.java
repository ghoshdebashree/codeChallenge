public class SingletonPattern {
  private static SingletonPattern sc = null;
    private SingletonPattern(){
    }
    public static void  Singletoprint(){
        System.out.println("hello");
    }
    public static SingletonPattern getInstance(){
        if(sc == null)
            sc = new SingletonPattern();
        return sc;
    }
}
class demoSingleton{
    public static void main(String[] args) {
        SingletonPattern obj = SingletonPattern.getInstance();
        obj.Singletoprint();

    }
}

