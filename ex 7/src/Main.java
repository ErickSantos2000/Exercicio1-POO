import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Televisor tv = new Televisor(1, 1, false);
         ControleRemoto controle = new ControleRemoto(tv);
         Scanner sc = new Scanner(System.in);

         int op;
         do {
             if(tv.getLigado() == false){
                 System.out.println("1 - Ligar TV");
             }  else {
                 System.out.println("1 - desligar TV");
             }
             System.out.println("2 - Trocar de canal");
             System.out.println("3 - Aumentar volume");
             System.out.println("4 - Diminuir volume");
             System.out.println("Escolha uma opção:");
             op = sc.nextInt();

             switch (op){
                 case 1:
                     if(tv.getLigado() == false) {
                         System.out.println("TV ligada!");
                         controle.ligar();
                     } else {
                         System.out.println("TV desligada!");
                         controle.desligar();
                     }

                     break;
                 case 2:

                     if(tv.getLigado() == true){
                         System.out.println("Informe para qual canal deseja trocar:");
                         int trocarCanal = sc.nextInt();

                         if(tv.getCanal() == trocarCanal){
                             System.out.println("Vocẽ ja esta no canal " + tv.getCanal());
                         } else {
                             controle.trocarCanal(trocarCanal);
                             System.out.println("Canal trocado para: " + tv.getCanal());
                         }
                     }
                     else {
                         System.out.println("TV está desligada, não é possivel trocar de canal!");
                     }
                     break;

                 case 3:
                     if(tv.getLigado() == true){
                         controle.aumentarVolume();
                         System.out.println("Aumentou volume!");
                         System.out.println("Volume: " + tv.getVolume());
                     } else {
                         System.out.println("TV está desligada, não é possivel aumentar volume!");
                     }
                         break;

                 case 4:
                     if(tv.getLigado() == true){
                         controle.diminuirVolume();
                        System.out.println("Aumentou diminuiu!");
                         System.out.println("Volume: " + tv.getVolume());
                     } else {
                         System.out.println("TV está desligada, não é possivel diminuir volume!");
                     }
                     break;

                 case 0:
                     System.out.println("Saindo...");
                     break;
                 default:
                     System.out.println("Opção invalida!");
             }
         } while (op != 0);
        }
sc.close();
    }