package classes;

public class Funcionario {
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double proximoSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem/100.0;
	}
	
	
}
