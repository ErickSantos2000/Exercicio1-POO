import java.util.Random;

public class LutaInterativa {
    private Guerreiro g1;
    private Guerreiro g2;

    public LutaInterativa(Guerreiro g1, Guerreiro g2){
        this.g1 = g1;
        this.g2 = g2;
    }

    public void luta(){
        Random random = new Random();
        int rodada = 0;

        while (g1.getEnergia() != 0 && g2.getEnergia() != 0){
            rodada++;
            System.out.println("---Rodada " + rodada + "------------");
            g1.atacar(g2);
            g2.atacar(g1);
            int numeroAleatorio = random.nextInt(2);

            if(numeroAleatorio == 1){
                g1.alimentaSe();
            }
            else {
                g2.alimentaSe();
            }

            System.out.println();

            System.out.println("Enegia de " + g1.getNome()+ " "+ g1.getEnergia());
            System.out.println("Enegia de " + g2.getNome()+ " "+ g2.getEnergia());
            System.out.println("------------------------");

        }

        if(g1.getEnergia() == 0){
            System.out.println(g2.getNome() + " ganhou!");
        }
        else{
            System.out.println(g1.getNome() + " ganhou!");
        }
    }

}
