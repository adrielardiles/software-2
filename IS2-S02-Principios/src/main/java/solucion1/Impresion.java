
package solucion1;

import java.util.List;

public class Impresion {
    
    public void Impresion(){
        
    }
    
    public void muestraLibros(List<Libro> libros) {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void imprimeResumen(List<Libro> libros) {
        System.out.println("Cantidad de Libros: " + libros.size());
    }
    
    
    
}
