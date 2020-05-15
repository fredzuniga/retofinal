package retofinal;

import java.util.Random;

public class Mago extends Personaje{
    private int totalAdasCapturadas;
    private int adasCapturadasTurno;
    private int adasAcumuladasTurno;

    public Mago() {
        totalAdasCapturadas = 0;
        adasCapturadasTurno = 0;
        adasAcumuladasTurno = 0;
    }
    
    public int ejecutarTurno(){
        Random accion_aleatoria = new Random();
        return accion_aleatoria.nextInt(2)+1;
    }
    
    public void mandaOgro(){
        System.out.println("El mago ha mandado a su ogro a atacar al heroe ");
    }
    
    public void capturarHadas(){
        Random adasAleatorias = new Random();
        adasCapturadasTurno  = adasAleatorias.nextInt(10)+1;
        adasAcumuladasTurno += adasCapturadasTurno;
        totalAdasCapturadas += adasCapturadasTurno;
    }

    public int getTotalAdasCapturadas() {
        return totalAdasCapturadas;
    }

    public void setTotalAdasCapturadas(int totalAdasCapturadas) {
        this.totalAdasCapturadas = totalAdasCapturadas;
    }

    public int getAdasCapturadasTurno() {
        return adasCapturadasTurno;
    }

    public void setAdasCapturadasTurno(int adasCapturadasTurno) {
        this.adasCapturadasTurno = adasCapturadasTurno;
    }

    public int getAdasAcumuladasTurno() {
        return adasAcumuladasTurno;
    }

    public void setAdasAcumuladasTurno(int adasAcumuladasTurno) {
        this.adasAcumuladasTurno = adasAcumuladasTurno;
    }
}
