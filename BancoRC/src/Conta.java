
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
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

	public void sacar(double valor) {
		if (saldo == 0) {
			System.out.println("Saldo indisponível para saque!");
		} else {
			saldo -= valor;
		}

	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public void investimento(double valor, Conta contaInvestimento) {
		this.sacar(valor);
		contaInvestimento.depositar(valor);
	}

	protected void imprimirInfosComuns() {

		System.out.println("Titular ");
		System.out.println(this.cliente.getNome());
		System.out.println("Agência ");
		System.out.println(this.agencia);
		System.out.println("Número ");
		System.out.println(this.numero);
		System.out.println("Saldo ");
		System.out.println(this.saldo);
		System.out.println("");

	}
}
