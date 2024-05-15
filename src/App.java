public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        Cliente cliente = new Cliente("kaio","Trav Idolo","teste@teste.com",99995555);
        Banco banco = new Banco();
        banco.setNome("Azul");

        Conta cc = new ContaCorrente(banco, cliente);
        cc.depositar(100);
        

        Conta poupanca = new ContaPoupanca(banco, cliente);
        cc.transferir(100, poupanca);
        
        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
        banco.imprimirListaContas();
    }
}
