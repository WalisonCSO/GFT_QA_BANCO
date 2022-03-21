public class Main {

    public static void main(String[] args) {
        Cliente walison = new Cliente();
        walison.setNome("Walison");

        Conta cc = new ContaCorrente(walison);
        Conta poupanca = new ContaPoupanca(walison);

        cc.Depositar(100);

        cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
