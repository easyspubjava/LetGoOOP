package builder;

public class Student {

    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    public Student(){}

    public Student(int id, String name) {
        this(id, name, 0, null, null);

    }

    public Student(int id, String name, int grade) {
        this(id, name, grade, null, null);
    }

    public Student(int id, String name, int grade, String major, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
}
