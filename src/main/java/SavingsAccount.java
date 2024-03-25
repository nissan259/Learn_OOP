public class SavingsAccount extends  BankAcoount{
    private int sum=0;
    private   String ownner;
    private int ribit;
    public SavingsAccount(int sum,String ownner,int ribit)
    {
        this.sum=sum;
        this.ownner=ownner;
        this.ribit=ribit;
    }
    @Override
    public void despoite() {
        this.sum=this.sum-5;
    }

    @Override
    public void withdraw() {
        this.sum=this.sum*ribit;
    }
    public  void printsum()
    {
        System.out.println(this.sum);
    }
}
