public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.ligado = ligado;
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getLigado(){
        return ligado;
    }

    public boolean ligar() {
         setLigado(true);
        return getLigado();
    }

    public boolean desligar() {
        setLigado(false);
        return getLigado();
    }

    public void aumentarVolume() {
        if (getLigado() == true){
            volume++;
        }
    }

    public void diminuirVolume() {
        if (getLigado() == true){
            volume--;
        }
    }

    public void trocarCanal(int novoCanal) {
        setCanal(novoCanal);
    }

    public String toString() {
        return "Canal: " + canal + " | Volume: " + volume + " | Ligado: " + ligado;
    }
}