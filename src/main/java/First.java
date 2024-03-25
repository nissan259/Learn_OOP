import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class First {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // Creating an instance of User
        User user = new User("John Doe", 30);
        Class<?>[] classes = User.class.getClasses();
        classes.toString();

        for (Class<?> cls : classes) {
            System.out.println("aa");
            System.out.println(cls.getName());
        }

        // Accessing the private field "name"
        Field nameField = User.class.getDeclaredField("name");
        nameField.setAccessible(true);  // Making the field accessible

        // Getting the value of the "name" field
        String name = (String) nameField.get(user);
        System.out.println("Name before change: " + name);

        // Modifying the value of the "name" field
        nameField.set(user, "Jane Doe");
        System.out.println("Name after change: " + nameField.get(user));

        // Accessing the private method "displayUserInfo"
        Method displayMethod = User.class.getDeclaredMethod("displayUserInfo");
        displayMethod.setAccessible(true);  // Making the method accessible

        // Invoking the "displayUserInfo" method
        displayMethod.invoke(user);
//    Hawk h=new Hawk(5,"ad");
//    Eagle e=new Eagle(2,"AA");
//    h.fly();
//    e.fly();
//    h.makesound();
//    e.makesound();
//    Soccer c=new Soccer("A");
//    c.play();
//    Student s=new Student(322861527,"orel");
//    s.add_grade(95);
//    s.add_grade(98);
//    s.add_grade(100);
//    s.print_grades();
//    Car c1=new Car(175,"tesle");
//    MotorCycle m1=new MotorCycle(125,"nma");
//    Vechile v=c1;
//    Vechile v1=m1;
//    work_dwork(c1);
//    work_dwork(m1);
//    SavingsAccount s1= new SavingsAccount(500,"ueriel",2);
//    CheckingAccount s2= new CheckingAccount(500,"ueriel",2);
//    PolBabk(s1);
//    PolBabk(s2);
        List<String>ls= Arrays.asList("David","Shlome","YODSR");
        String a=reader.next();
        String b="wovels";
        try {
            for(int i=0;i<a.length();i++)
            {
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        throw new IllegalArgumentException("error is one of the wovels");
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());}
    }
    public static void PolBabk(BankAcoount b1)
    {
        b1.despoite();
        b1.withdraw();
        b1.printsum();
    }
    public  static void work_dwork(Vechile v)
    {
        v.StartEngine();
        v.EndEngine();
    }

}
