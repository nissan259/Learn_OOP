public class Soccer implements Game{
    private String name;
    public Soccer(String name)
    {
        this.name=name;
    }
    public  void play()
    {
        System.out.println("תבעט");
    }
    @Override
    public void name() {
        System.out.println(this.name);
    }
}
