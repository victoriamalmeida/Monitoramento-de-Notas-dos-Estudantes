package StudentMonitoring;

public class App {
    public static void main(String[] args) {
        studentClass a1 = new studentClass();

        a1.setName("Ana Silva");
        a1.setEnrollment(102);
        a1.setAverage(7.5);
        a1.result(7.5);
        a1.showInfo();

        studentClass a2 = new studentClass();

        a2.setName("Bruno Costa");
        a2.setEnrollment(103);
        a2.setAverage(5.0);
        a2.result(5.0);
        a2.showInfo();

        studentClass a3 = new studentClass();

        a3.showInfo();


        System.out.println();
        System.out.println("Total de alunos cadastrados: " + studentClass.totalStudents);

    }
}
