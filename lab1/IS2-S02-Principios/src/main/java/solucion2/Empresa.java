package solucion2;

public class Empresa {
    private Sucursal sucursal;

    public Empresa(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    public void mostrarEmpleados() {
        sucursal.getEmpleados().forEach((t) -> {
            System.out.println(t);
        }); //O con un for each con string nombre : sucursal.getNombresEmpleados()
    }
}
