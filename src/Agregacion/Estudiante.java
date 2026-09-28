package Agregacion;

public class Estudiante {
    private String nombreEstudiante;
    private int matricula;

    public Estudiante(String nombreEstudiante, int matricula){
        this.nombreEstudiante = nombreEstudiante;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
}
