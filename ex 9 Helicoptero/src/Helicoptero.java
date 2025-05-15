
public class Helicóptero{
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int quantasPessoas;

    public Helicóptero(int capacidade){
        ligado = false;
        quantasPessoas = 0;
        altitude = 0;
        this.capacidade = capacidade;
    }

    public void entra() {
        if (quantasPessoas < capacidade) {
            quantasPessoas++;
        } else {
            System.out.println("Não ha espaço para mais pessoas!");
        }
    }

    public void sai() {
        if ( 0 < capacidade) {
            quantasPessoas--;
        } else {
            System.out.println("Não ha ninguem para sair!");
        }
    }

    public void ligar(){
        if(ligado == true){
            System.out.println("Helicoptero ja esta ligado!");
        }
        else {
            ligado = true;
        }
    }

    public void desligar(){
        if(altitude == 0){
            System.out.println("Não pode desligar, pq tu ta alto, pow!");
        }
        else if(ligado == false){
            System.out.println("Helicoptero ja esta ligado!");
        }
        else {
            ligado = false;
        }
        
    }

    public void decolar(int altitude) {
        if (ligado && this.altitude == 0) {
            this.altitude = altitude;
        } else {
            System.out.println("Não é possível decolar. Verifique se o helicóptero está ligado e na terra.");
        }
    }

    public void aterrissar() {
        if (ligado && altitude > 0) {
            altitude = 0;
        } else {
            System.out.println("Não é possível aterrissar. Verifique se o helicóptero está ligado e voando.");
        }
    }

    public String toString(){
        return String.format("Ligado: %b\nAltitude: %d\nCapacidade: %d\n Quantidade de pessoa: %d", ligado, altitude,capacidade,quantasPessoas);
        
    }
}
