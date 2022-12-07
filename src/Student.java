public class Student {

    public String name;
    public int grade;

    public void printDetail() {
        System.out.println("A new student has join the classroom: " + name);
    }

    public Student(String name) {

        this.name = name;
    }
}
