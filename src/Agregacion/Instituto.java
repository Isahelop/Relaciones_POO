package Agregacion;

import java.util.List;

public class Instituto {

    private String nombreInstituto;
    private List<Departamento> departamentos;

    public Instituto(String nombreInstituto, List<Departamento> departamentos){
        this.nombreInstituto = nombreInstituto;
        this.departamentos = departamentos;
    }

    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public int getTotalEstudiantesEnInstituto(){
        int numeroEstudiantes = 0;
        List<Estudiante> estudiantes = null;

        for(Departamento dept : departamentos){
            estudiantes = dept.getEstudiantes();
            for(Estudiante s : estudiantes){
                numeroEstudiantes++;
            }
        }
        return numeroEstudiantes;
    }
}
