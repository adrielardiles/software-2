
package solucion1;

public class Test {
    public static void main(String[] args) {
        Libro l1 = new Libro("Adriel","t1");
        Libro l2 = new Libro("Adriel","t1");
        Libro l3 = new Libro("Adriel","t1");
        
        Biblioteca b = new Biblioteca();
        
        b.agregaLibro(l1);
        b.agregaLibro(l2);
        b.agregaLibro(l3);
        
        
        Impresion imp = new Impresion();
        imp.muestraLibros(b.getLibros());
        imp.imprimeResumen(b.getLibros());
        
        
        
        
    }
    
    
}
