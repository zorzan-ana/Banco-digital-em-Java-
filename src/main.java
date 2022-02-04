public class main {

    public static void main(String[] args) {
        Cliente AnaGabriela = new Cliente();
        AnaGabriela.setNome("Ana Gabriela");

        Conta cc = new ContaCorrente (AnaGabriela);
        Conta poupanca =  new ContaPoupança(AnaGabriela);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
