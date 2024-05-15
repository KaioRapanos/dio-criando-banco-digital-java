import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;   

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirListaContas(){
        System.out.println("Lista de contas do banco " + nome + ":");
        for(Conta conta : contas){
            System.out.println(conta);
        }
    }
}
