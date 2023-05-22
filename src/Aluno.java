public class Aluno {

    private int codigo;

    private String nome;

    private String endereco;

    private String cpf;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getEndereco (String endereco){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCpf (String cpf){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void cadastrarNomeAluno(String nome){
        this.nome = nome;
    }

    public void imprimirNome(){
        System.out.println(this.nome);
    }

    public String retornarCpfAluno(){
        return "000.111.222-22";
    }

}
