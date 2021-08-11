
package probaroverride2;



public class MotoCicleta extends Vehiculo {

    public MotoCicleta(String modelo) {
        super(modelo);
    }

    

@Override
     public void manejar()
     {
        System.out.println("Manejando mi primer motocicleta");
     }
     
@Override
         public  void MuestraModelo(){
         
        System.out.println("El modelo de moto es: " + super.modelo);
    }


    
}
