public class ControleRemoto{
    private Televisor tv;
    
    public ControleRemoto(Televisor tv){
        this.tv = tv;
    }
    public void ligar(){
        tv.ligar();
    }
    public void desligar(){
        tv.desligar();
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
