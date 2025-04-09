package solucionsrp;

public class Test {

    public static void main(String[] args) {
        System.out.println("*** test ***");
        Reporte r = new Reporte("Anti-Ejemplo","No se cumple el principio SRP");
        
        
        ReporteGuardar rg = new ReporteGuardar();
        rg.guardarEnArchivo(r, "mireporte.txt");
        
        
        ReporteEnviar re = new ReporteEnviar();
        re.enviarPorCorreo(r, "lol");
        
        
        
    }
}
