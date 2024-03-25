public class Hawk extends Bird {

    private  int place;
    private  String name;
    public Hawk(int place,String name)
    {
        this.place=place;
        this.name=name;
    }
    public void fly()
    {
        this.place+=5;
        System.out.println(this.place);
    }
    @Override
    public void makesound() {
        System.out.println("hoo");
    }
}
