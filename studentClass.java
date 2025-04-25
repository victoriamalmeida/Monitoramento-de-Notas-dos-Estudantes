package StudentMonitoring;

public class studentClass {
    private String status = "Sem Informação";
    private String name;
    private int enrollment;
    double average;
    static int totalStudents = 0;
    static final double AVERAGE_SCORE = 6.0;

    static {
        System.out.println("Sistema de Monitoramento de Notas Ativado!");
    }

    public studentClass (String name, int enrollment, double average) {
        this.name = name;
        this.enrollment = enrollment;
        this.average = average;


        totalStudents++;
    }

    public studentClass () {
        this("Aluno não identificado", 0, 0.00);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    boolean result (double average) {

        if (average >= AVERAGE_SCORE) {
            status = "APROVADO";
            return true;
        } else {
            status = "REPROVADO";
            return false;
        }
    }

    void showInfo () {
        System.out.println();
        System.out.println("Nome: "+ name);
        System.out.println("Matrícula: " + enrollment);
        System.out.println("Média: " + average);
        System.out.println("Status: " + status);
    }

}


