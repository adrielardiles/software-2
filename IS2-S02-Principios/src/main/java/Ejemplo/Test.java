
package Ejemplo;

public class Test {
    public static void main(String[] args) {
        
        c C = new c("Hola mundo");
        b B = new b(C);
        a A = new a(B);
        
        System.err.println(A.getB().getC().getNombre());
                
        
    }
    
    
    
}   
