public class Teacher {

    public String teacherName;

    public Teacher(String teacherName) {

        this.teacherName = teacherName;

    }

    public void assignGrade(Student alumn, int finalGrade) {
        alumn.grade = finalGrade;

    }

}
