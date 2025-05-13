public class Mercado {
    private Produto [] vetor;
    private Produto produto;
    private int indice;

    public Mercado(){
        vetor = new Produto[20];
    }

    public void add(Produto p){
        if(indice == vetor.length){
            System.out.println("Ta cheio!");
        }
        else{
            vetor[indice++] = p;
        }
    }

    public void pesquisar(String nomeProcurado){

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null && vetor[i].getNome().equals(nomeProcurado)){
                    System.out.println("Achamos " + vetor[i]);
                }
            }
        }

    public void remover(String produtoRemovido){
        Produto [] novoVetor = new Produto[20];
        int j = 0;
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] != null && vetor[i].getNome().equals(produtoRemovido)){
                novoVetor[j++] = vetor[i];
            }
        }

        for(int i = 0; i < vetor.length; i++){
                vetor[i++] = novoVetor[j];

        }

        indice = j;
    }



    public void imprimir(){
        int cont = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] != null){
                cont++;
                System.out.println("Produto " + cont + "\n" +vetor[i]);
            }

        }
    }
}
