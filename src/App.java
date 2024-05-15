public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        Cliente cliente = new Cliente();
        cliente.setNome("Kaio");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        

        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(100, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
