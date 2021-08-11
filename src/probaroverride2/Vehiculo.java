
package probaroverride2;


public class Vehiculo {

public String modelo;


public void manejar()
   

   {
    System.out.println("Manejar un vehículo");
   }

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }


    public  void MuestraModelo(){
         
        System.out.println(modelo);
    }
   

    
    
}
