
public class Task_student {

    String name;
    int age;
    int marks;
    private String salary;

    // Constructor
    public Task_student(String n, int a, int m) {
        this.name = n;
        this.age = a;
        this.marks = m;
    }

    // Setter
    public void setSalary(String salary) {
        this.salary = salary;
    }

    // Getter
    public String getSalary() {
        return salary;
    }

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Inner Class
    class Employee extends Task_student {

        String role;
        int exp;

        public Employee(String n, int a, int m, String role, int exp) {
            super(n, a, m);
            this.role = role;
            this.exp = exp;
        }
    }

    public static void main(String[] args) {

        Task_student s = new Task_student("Madhava", 22, 90);

        s.setSalary("50000");
        System.out.println("Salary: " + s.getSalary());

        System.out.println("Sum 2: " + s.add(10, 20));
        System.out.println("Sum 3: " + s.add(10, 20, 30));
    }
}
