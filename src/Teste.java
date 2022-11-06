public class Teste {
    public static void main(String[] args) {
        Cliente ana = new Cliente("ana");
        Conta cc = new ContaCorrente(ana);
        Conta cp = new ContaPoupanca(ana);
        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();



    }
}
