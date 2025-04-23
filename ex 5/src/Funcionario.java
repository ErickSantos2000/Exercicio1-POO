public class Funcionario{
    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public String estadoObj(){
        return String.format("Codigo: %d | Nome: %s | CPF: %s | Endereço: %s | Telefone: %s | Idade: %d | Salario: %f", codigo, nome, CPF, endereco, telefone, idade, salario);
    }

    public float calcularSalarioLiquido() {
        float salarioLiquido = salario * (11f / 100);
        salario =  salario - salarioLiquido;
        return salario;
    }
}
