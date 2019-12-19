package entidades;

public class Conta {
	private String nomeCliente;
	private int numConta;
	private double taxaSaque = 5.00;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta(String nomeCliente, int numConta) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		saldo = 0.00;
	}

	public Conta(String nomeCliente, int numConta, double depositoInicial) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		depositar(depositoInicial);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public double depositar(double valorDeposito) {
		saldo += valorDeposito;
		return getSaldo();
	}

	public double sacar(double valorSaque) {
		saldo -= valorSaque + taxaSaque;
		return getSaldo();
	}

	@Override
	public String toString() {
		return "Conta " + numConta + " Titual " + nomeCliente + " Saldo R$" + String.format("%.2f",saldo);
	}	
		
}
