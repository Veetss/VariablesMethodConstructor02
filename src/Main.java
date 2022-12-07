public class Main {
    public static void main(String[] args) {
        Student pippo = new Student("Pippo Baudo");
        Student gianni = new Student("Gianni Morandi");

        Teacher marcella = new Teacher("Marcella Fiorentino");

        marcella.assignGrade(pippo, 5);
        marcella.assignGrade(gianni, 7);

        pippo.printDetail();
        gianni.printDetail();

        System.out.println(pippo.name + " " + pippo.grade);
        System.out.println(gianni.name + " " + gianni.grade);
    }
}