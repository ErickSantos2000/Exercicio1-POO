import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Mercado mercado = new Mercado();
        Scanner entrada = new Scanner(System.in);

        float valor;
        String nome;
        int vezes = 0;

        System.out.println("Quantos produtos deseja adicionar: ");
        vezes = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < vezes; i++) {
            System.out.println("Nome:");
            nome = entrada.nextLine();

            entrada.nextLine();

            System.out.println("Valor:");
            valor = entrada.nextFloat();

            entrada.nextLine();

            mercado.add(new Produto(nome, valor));

        }
        System.out.println("Nome que deseja procurar:");
        String nomeProcurado = entrada.nextLine();

        entrada.nextLine();

        mercado.pesquisar(nomeProcurado);


        mercado.imprimir();

        entrada.close();
    }
}