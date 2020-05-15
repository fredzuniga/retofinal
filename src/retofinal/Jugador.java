package retofinal;

import java.util.Random;

public class Jugador extends Personaje{
    private int totalAdasLiberdas; // 
    private int adasLiberdasAcumuladasTurno; //
    
    public void construirCasa(){
        System.out.println("El jugador ha construido una casa");
        adasLiberdasAcumuladasTurno++;
        totalAdasLiberdas++;
    }

    public int getTotalAdasLiberdas() {
        return totalAdasLiberdas;
    }

    public void setTotalAdasLiberdas(int totalAdasLiberdas) {
        this.totalAdasLiberdas = totalAdasLiberdas;
    }

    public int getAdasLiberdasAcumuladasTurno() {
        return adasLiberdasAcumuladasTurno;
    }

    public void setAdasLiberdasAcumuladasTurno(int adasLiberdasAcumuladasTurno) {
        this.adasLiberdasAcumuladasTurno = adasLiberdasAcumuladasTurno;
    }
    
    
    
}
