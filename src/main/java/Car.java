public class Car extends Vechile{
  private   int kilometers;
   private String model;
    public Car(int kilometers,String model)
    {
        this.kilometers=kilometers;
        this.model=model;
    }

    @Override
    public void StartEngine() {
        System.out.println("rrrr");
    }

    @Override
    public void EndEngine() {
        System.out.println("pppp");
    }
}
