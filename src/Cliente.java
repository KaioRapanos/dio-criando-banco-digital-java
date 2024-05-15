public class Cliente {

    private String nome;
    private String endereco;
    private String email;
    private int telefone;

    public Cliente(String nome, String endereco, String email, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }
    
    public int getTelefone() {
        return telefone;
    }

    public void atualizar(String novoEndereco, int novoTelefone){
        this.endereco = novoEndereco;
        this.telefone = novoTelefone;
    }
}
