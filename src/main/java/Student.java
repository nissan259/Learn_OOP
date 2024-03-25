import java.util.ArrayList;

public class Student {
    //Write a Java program to create a class called Student with private instance
    // variables student_id, student_name, and grades.
    // Provide public getter and setter methods to access and
    // modify the student_id and student_name variables.
    // However, provide a method called addGrade() that allows adding a grade to the
    // grades variable while performing additional validation.
    private  int student_id;
    private String student_name;
    private ArrayList<Integer>grades;
    public Student(int student_id,String student_name)
    {
        this.student_id=student_id;
        this.student_name=student_name;
        grades=new ArrayList<Integer>();
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public  void add_grade(int grade)
    {
        grades.add(grade);
    }
   public void print_grades()
    {
        System.out.println("dan");
        for(int i=0;i<grades.size();i++)
        {
            System.out.println(grades.get(i));
        }
    }
}
