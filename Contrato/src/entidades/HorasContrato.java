package entidades;

import java.util.Date;

public class HorasContrato {
	private Date dataContrato;
	private Double valorHora;
	private Integer horas;
	
	public HorasContrato() {
		
	}
	
	public HorasContrato(Date dataContrato, Double valorHora, Integer horas) {
		this.dataContrato = dataContrato;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double totalHoras() {
		return valorHora * horas;
	}
	
	
	
}
