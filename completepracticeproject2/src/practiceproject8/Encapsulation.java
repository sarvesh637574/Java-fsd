package practiceproject8;
class Student {
    private String name;
    private int age;
    private int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setter methods to modify private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // A simple age validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Alice", 20, 12345);

        // Accessing private fields using getter methods
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Student ID: " + student1.getStudentId());

        // Modifying private fields using setter methods
        student1.setName("Bob");
        student1.setAge(22);
        System.out.println("Updated Name: " + student1.getName());
        System.out.println("Updated Age: " + student1.getAge());

	}

}
