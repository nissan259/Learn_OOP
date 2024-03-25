public class User {
    private String name;
    private int age;

    public User() {
        // Default constructor
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void displayUserInfo() {
        System.out.println("User Name: " + name + ", Age: " + age);
    }
}