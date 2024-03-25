public abstract class BankAcoount {
   private int sum=0;
  private   String ownner;

  public abstract  void despoite();
  public abstract void withdraw();
  public void printsum()
  {
      System.out.println(this.sum);
  }
}
