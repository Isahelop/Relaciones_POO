import Asociacion.Banco;
import Asociacion.Empleado;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){

        System.out.println("Elige una opcion: \n" +
                "1. Asociacion\n"+
                "2. Agregacion\n" +
                "3. Composicion\n");
        Scanner op = new Scanner(System.in);
        int opcion = op.nextInt();

        switch(opcion){
            case 1:

        }
        /*
        Empleado emp1 = new Empleado("Rafa");
        Empleado emp2 = new Empleado("Ashley");

        Set<Empleado> empleados = new HashSet<>();

        empleados.add(emp1);
        empleados.add(emp2);

        Banco banco = new Banco("BBVA");

        banco.setEmpleados(empleados);

        for(Empleado empleado : banco.getEmpleados()){
            System.out.println(empleado.getNombre() + " pertenece al banco " + banco.getNombreBanco());
        }
        
         */
    }
}