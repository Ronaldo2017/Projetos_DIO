
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Ronaldo");
		
		
		Conta cc = new ContaCorrente(cliente);		
		Conta cp = new ContaPoupanca(cliente);
		Conta ci = new ContaInvestimento(cliente);
		
		cc.depositar(1000);
		cc.depositar(500.00);
		cc.transferir(500.00, cp);
		cp.investimento(250.00, ci);
		
	
		cc.sacar(50.00);
		
		
		System.out.println(" ***** SALDO DAS CONTAS ***** ");
		System.out.println("Saldo conta corrente: " + cc.getSaldo());
		System.out.println("Saldo conta poupança: " + cp.getSaldo());
		System.out.println("Saldo investimento: " + ci.getSaldo());
		System.out.println("Valor do saque: " + cc.getSaldo());
		System.out.println("");
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		ci.imprimirExtrato();
	}

}
