package classes;

public class Aluno {
	public String name;
	public double n1,n2,n3,nf;
	public double media = 60.0;
	
	public double calcularMedia() {
		nf = n1+n2+n3;
		if(nf >= media) {
			 System.out.print("Aprovado ");
			 return nf;
		} else {
			System.out.println("Reprovado ");
			System.out.print("Pontos faltantes");
		    return media - nf;
		}
		
	}
}	
