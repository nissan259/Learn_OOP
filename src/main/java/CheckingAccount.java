public class CheckingAccount extends BankAcoount {
    private  int sum;
    private   String name;
    private    int ribit;
    public CheckingAccount(int sum,String name,int ribit)
    {
        this.sum=sum;
        this.name=name;
        this.ribit=ribit;
    }

    @Override
    public void withdraw() {
        this.sum=(1-this.ribit)*sum;
    }
    @Override
    public void despoite()
    {
        this.sum=this.sum+5;
    }
    public  void printsum()
    {
        System.out.println(this.sum);
    }
}
