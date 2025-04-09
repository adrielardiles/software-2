package solucion.osp;

public class Test {
    
    public static void main(String[] args) {
        Circulo f1 = new Circulo(2);
        Rectangulo f2 = new Rectangulo(2,3);
        Triangulo f3 = new Triangulo(2,3);
        Area a = new Area();
        
        System.out.println( a.calcularArea(f1));
        System.out.println( a.calcularArea(f2));
        System.out.println( a.calcularArea(f2));
        
        
    }
}
