public class Eagle extends Bird {


    private int size;
    private  String name;
    public Eagle(int size,String name)
    {
        this.size=size;
        this.name="plp";
    }
    @Override
    public void makesound() {
        System.out.println("aaa");
    }
    @Override
    public void fly() {
        this.size+=4;
        System.out.println(this.size);
    }
}
