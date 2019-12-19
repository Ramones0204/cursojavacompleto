package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	private String nomeTrabalhador;
	private NivelTrabalhador nivelTrabalhador;
	private Double salarioBase;
	private Departamento departamento;
	private List<HorasContrato> contratos = new ArrayList<HorasContrato>();
	
	public Trabalhador(String nomeTrabalhador, NivelTrabalhador nivelTrabalhador, Double salarioBase,Departamento departamento) {
		this.nomeTrabalhador = nomeTrabalhador;
		this.nivelTrabalhador = nivelTrabalhador;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public Trabalhador() {
		
	}

	public String getNomeTrabalhador() {
		return nomeTrabalhador;
	}

	public void setNomeTrabalhador(String nomeTrabalhador) {
		this.nomeTrabalhador = nomeTrabalhador;
	}

	public NivelTrabalhador getNivelTrabalhador() {
		return nivelTrabalhador;
	}

	public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
		this.nivelTrabalhador = nivelTrabalhador;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	public List<HorasContrato> getContratos() {
		return contratos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void addContrato(HorasContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(HorasContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double total(int ano,int mes) {
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(HorasContrato c : contratos) {
			cal.setTime(c.getDataContrato());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				sum += c.totalHoras();
			}
			
		}
		
		return sum;
	}
	
}