public class MotorCycle  extends Vechile{
    private   int kilometers;
    private String model;
    public MotorCycle(int kilometers,String model)
    {
        this.kilometers=kilometers;
        this.model=model;
    }

    @Override
    public void StartEngine() {
        System.out.println("vvnnn");
    }

    @Override
    public void EndEngine() {
        System.out.println("zzzz");
    }
}
