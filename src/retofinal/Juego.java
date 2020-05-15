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
        while( mago_oscuro.getPuntosVida() > 0 && heroe.getPuntosVida() > 0 ){
            turno_personaje = turno.nextInt(2)+ 1;
            //System.out.println("Turno --->" + turno_personaje);
            if(turno_personaje == 1){
                switch(mago_oscuro.ejecutarTurno()){
                    case 1:
                        mago_oscuro.capturarHadas();
                        System.out.println("El mago oscuro ha capturado " + mago_oscuro.getAdasCapturadasTurno() + " hadas");
                            if(mago_oscuro.getAdasAcumuladasTurno() > 10){
                                mago_oscuro.aumentaPuntosVida();
                                System.out.println("Los poderes del mago han aumentado a " + mago_oscuro.getPuntosVida());
                                mago_oscuro.setAdasAcumuladasTurno(mago_oscuro.getAdasAcumuladasTurno() - 10);
                                System.out.println("Cantidad de hadas para el siguiente turno --> " + mago_oscuro.getAdasAcumuladasTurno());
                            }
                        break;
                    case 2:
                        mago_oscuro.mandaOgro();
                        heroe.disminuyePuntosVida();
                        System.out.println("Se ha disminuido los puntos de vida del hereo a " + heroe.getPuntosVida());
                        break;
                    default:
                        break;
                }
            }else{
                System.out.println("Jugador");
            }
        }
        
    }
    
    
}
