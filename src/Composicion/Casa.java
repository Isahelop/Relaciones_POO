package Composicion;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String nombreCasa;
    private List<Cuarto> cuartos;

    public Casa(String nombreCasa){
        this.nombreCasa = nombreCasa;
        this.cuartos = new ArrayList<>();
    }

    public void agregarCuarto(Cuarto cuarto){
        cuartos.add(cuarto);
    }

    public List<Cuarto> getCuartos(){
        return new ArrayList<>(cuartos);
    }

    public int getTotalCuartos(){
        return cuartos.size();
    }
}
