class Singleton
{
	private static Singleton obj = new Singleton();

	private Singleton() {}

	public static Singleton getInstance()
    {
		return obj;
	}
  public void print(){
    System.out.println("This is Singleton demo");
  }
  public static void main(String args[]){
    Singleton s = Singleton.getInstance();
    s.print();
	}
}