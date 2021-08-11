
package probaroverride2;



public class Probaroverride2 {


    public static void main(String[] args) {
                MotoCicleta x = new MotoCicleta("xyz");
        
        Carro y = new Carro("abc");
        
        Autobus w = new Autobus("ppp");
        
        
        x.manejar();
        y.manejar();
        
        x.MuestraModelo();
        y.MuestraModelo();
        
        y.MuestraModelo();
        w.MuestraModelo();
        
        
    }
    
}
