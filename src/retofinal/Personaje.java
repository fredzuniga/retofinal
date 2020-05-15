package retofinal;

public class Personaje {
    private int puntosVida;

    public Personaje() {
        puntosVida = 100;
    }
    
    public void disminuyePuntosVida(){
        puntosVida--;
    }
    
    public void aumentaPuntosVida(){
        puntosVida++;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
}
