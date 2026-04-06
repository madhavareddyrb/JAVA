
public class User {

    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);

    }

    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "madhava";
        u1.age = 22;

        u1.display();

    }
}
