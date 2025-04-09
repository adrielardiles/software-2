package solucion2;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    List<Empleado> empleados;
            
    public Sucursal() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado( Empleado emp) {
        empleados.add( emp );
    }
    
    public List<String> getEmpleados() {
        List<String> nombres = new ArrayList<>();
        for(Empleado e : empleados){
            nombres.add(e.getNombre());
        };
        return nombres;
    }

    
    
}
