public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " +  cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " +  numero);
        System.out.println("Saldo: " + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
