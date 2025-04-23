public class ControleRemoto{
    public Televisor tv;
    public ControleRemoto(Televisor tv){
        this.tv = tv;
    }
    public boolean ligar(){
        return tv.ligar();
    }
    public boolean desligar(){
        return tv.desligar();
    }
    public void aumentarVolume(){
        tv.aumentarVolume();
    }

    public void diminuirVolume(){
        tv.diminuirVolume();
    }
    public void trocarCanal(int novoCanal){
        tv.trocarCanal(novoCanal);
    }
    public String toString(){
        return tv.toString();
    }
}