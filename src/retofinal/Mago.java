package retofinal;

import java.util.Random;

public class Mago extends Personaje{
    // funciones, constructores y atributos
    Random accion = new Random();
    
    public int ejecutarTurno(){
        int ejecutar_funcion = accion.nextInt(2)+ 1;
        
        if(ejecutar_funcion == 1){
            return mandaOgro();
        }else if(ejecutar_funcion == 2){
            capturarHadas();
            return 2;
        }else{
            return 3;
        }
    }
    
    public int mandaOgro(){
        return 1;
    }
    
    public void capturarHadas(){
        //  puntajePersonaje++;
        
        
    }
}
