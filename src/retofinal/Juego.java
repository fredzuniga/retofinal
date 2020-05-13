package retofinal;

import java.util.Random;

public class Juego {
    private Mago mago_oscuro;
    private Jugador heroe;
    Random turno = new Random();
    int turno_personaje = 0;
        
    public Juego(){
        mago_oscuro = new Mago();
        heroe = new Jugador();
        iniciar_juego();
    }
    
    public void iniciar_juego(){
        // ciclo
        turno_personaje = turno.nextInt(2)+ 1;
        if(turno_personaje == 1){
            // algo acerca del mago
            int resultado = mago_oscuro.ejecutarTurno();
            if(resultado == 1){
                heroe.disminuyePuntaje();
            }
        }else{
            
           
            // algo del jugador
            //Jugador.ejecutar_turno();
        }
        // condicionar --> jugador.puntaje = 0 || mago. puntaje = 0
        
    }
    
    
}
