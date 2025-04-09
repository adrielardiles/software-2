
package solucion.osp;

public class Rectangulo implements Figura {

    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    
    
    
    @Override
    public double area() {
        return largo*ancho;
    }
    
}
