import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int escolha = -1;

        while (escolha != 0) {
            System.out.println("Escolha as opções:");
            System.out.println("1 - Luta recursiva");
            System.out.println("2 - Luta interativa");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    Guerreiro g1 = new Guerreiro("Erick", 2000);
                    Guerreiro g2 = new Guerreiro("Felipe", 3000);
                    LutaRecursiva lutaRecursiva = new LutaRecursiva(g1, g2);
                    lutaRecursiva.luta();
                    break;
                case 2:
                    Guerreiro g1r = new Guerreiro("Erick", 2000);
                    Guerreiro g2r = new Guerreiro("Felipe", 3000);
                    LutaInterativa lutaInterativa = new LutaInterativa(g1r, g2r);
                    lutaInterativa.luta();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        entrada.close();
    }
}
