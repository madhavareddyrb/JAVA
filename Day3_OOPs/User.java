
// public class User {
//     String name;
//     int age;
//     void display() {
//         System.out.println(name + " " + age);
//     }
//     public static void main(String[] args) {
//         User u1 = new User();
//         u1.name = "madhava";
//         u1.age = 22;
//         u1.display();
//     }
// }
class User {

    String name;
    int age;
    private String course;

    User(String n, int a) {
        name = n;
        age = a;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        this.course = "MERN ";
        return course;
    }

    void sound() {
        System.out.println("Animal Sound");
    }

  

    public static void main(String[] args) {
        User u1 = new User("Madhava", 24);
        System.out.println(u1.name + u1.age);
    }

}
