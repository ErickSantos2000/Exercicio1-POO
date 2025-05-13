public class Produto {
    private String nome;
    private float valor;

    public Produto(String nome, Float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String toString() {
        return String.format("Nome: %s | Valor: %f", nome, valor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produto outraPessoa = (Produto) obj;

        return nome.equalsIgnoreCase(outraPessoa.nome);
    }

    public float getValor() {
        return valor;
    }


    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
