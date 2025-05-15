public class Main {
    public static void main(String [] args){
        Helicóptero h1 = new Helicóptero(4);
        Helicóptero h2 = new Helicóptero(4);

        System.out.println("H1");
        h1.toString();
        System.out.println("H2");
        h2.toString();

        h1.entra();
        h2.entra();

        h1.ligar();
        h2.ligar();

        h1.decolar(10);
        h2.decolar(10);

        System.out.println("H1");
        h1.toString();
        System.out.println("H2");
        h2.toString();

        h1.aterrissar();
        h2.aterrissar();

        h1.desligar();
        h2.desligar();

        h1.sai();
        h2.sai();

        System.out.println("H1");
        h1.toString();
        System.out.println("H2");
        h2.toString();


    }
}
