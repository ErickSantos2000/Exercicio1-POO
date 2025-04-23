import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        f.setCodigo(123);
        f.setNome("Erick");
        f.setCPF("716.055.424.82");
        f.setEndereco("Sao Manuel");
        f.setTelefone("12345");
        f.setIdade(24);

        System.out.print("Digite o salário do funcionário: ");
        float s = sc.nextFloat();
        f.setSalario(s);


        System.out.println("\nEstado atual:");
        System.out.println(f.estadoObj());

        float liquido = f.calcularSalarioLiquido();
        f.setSalario(liquido);

        System.out.println("\nEstado após a modificação:");
        System.out.println(f.estadoObj());

        sc.close();
    }
}