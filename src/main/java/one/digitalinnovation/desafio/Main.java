package one.digitalinnovation.desafio;

public class Main {

    public static void main(String[] args) {

        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Conta cc = new ContaCorrente(gustavo);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(gustavo);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
