
public interface IConta {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, Conta contaDestino);
	
	void investimento(double valor, Conta contaInvestimento);
	
	void imprimirExtrato();
}
