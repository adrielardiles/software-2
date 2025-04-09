
package solucion.osp;

public class Triangulo implements Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    
    @Override
    public double area() {
        return (base*altura)/2;
    }
    
}
