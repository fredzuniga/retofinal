package retofinal;

import java.util.Random;

public class Juego {
    private Mago mago_oscuro;
    private Jugador heroe;
    Random turno = new Random(); // 1 mago - 2 Jugador
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
                        // capturar un hada
                        mago_oscuro.capturarHadas();
                        System.out.println("El mago oscuro ha capturado " + mago_oscuro.getAdasCapturadasTurno() + " hadas");
                            if(mago_oscuro.getAdasAcumuladasTurno() > 10){
                                mago_oscuro.aumentaPuntosVida(); // +1 
                                // 7 capturadas + 3 adas nuevas -> +1 ( 0 )
                                System.out.println("Los poderes del mago han aumentado a " + mago_oscuro.getPuntosVida());
                                mago_oscuro.setAdasAcumuladasTurno(mago_oscuro.getAdasAcumuladasTurno() - 10); // 2
                                System.out.println("Cantidad de hadas para el siguiente turno --> " + mago_oscuro.getAdasAcumuladasTurno()); // 2
                            }
                        break;
                    case 2:
                        // enviar al ogro
                        mago_oscuro.mandaOgro(); // imprimir un mensaje
                        heroe.disminuyePuntosVida();
                        System.out.println("Se ha disminuido los puntos de vida del hereo a " + heroe.getPuntosVida());
                        break;
                    default:
                        break;
                }
            }else{
                heroe.construirCasa();
                mago_oscuro.disminuyePuntosVida();
                mago_oscuro.setAdasCapturadasTurno( mago_oscuro.getAdasCapturadasTurno() - 1);

                if(heroe.getAdasLiberdasAcumuladasTurno() == 10){
                    mago_oscuro.disminuyePuntosVida();
                    heroe.aumentaPuntosVida();
                    System.out.println("Se ha disminuido los puntos de vida del mago a " + mago_oscuro.getPuntosVida());
                    heroe.setAdasLiberdasAcumuladasTurno(0);
                }
            }
        }
        
        if(mago_oscuro.getPuntosVida() > heroe.getPuntosVida() ){
            System.out.println("El mal ha ganado");
        }else{
            System.out.println("El heroe ha ganado");
        }
        
    }
    
    
}
