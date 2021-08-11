
package probaroverride2;


public class Autobus extends Vehiculo{

    public Autobus(String modelo) {
        super(modelo);
    }


@Override
         public  void MuestraModelo(){
             super.MuestraModelo();
        //System.out.println("El modelo de moto es: " + super.modelo);
    }
    

    
}
