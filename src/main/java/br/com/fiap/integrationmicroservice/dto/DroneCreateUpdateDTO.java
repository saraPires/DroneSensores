package br.com.fiap.integrationmicroservice.dto;

public class DroneCreateUpdateDTO {
	
	private Double latitude;
	private Double logitude;
	private Double temperatura;
	private Double unidade;
	
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLogitude() {
		return logitude;
	}
	public void setLogitude(Double logitude) {
		this.logitude = logitude;
	}
	public Double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	public Double getUnidade() {
		return unidade;
	}
	public void setUnidade(Double unidade) {
		this.unidade = unidade;
	}
	
	

}
