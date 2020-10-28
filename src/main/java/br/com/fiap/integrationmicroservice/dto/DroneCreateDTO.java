package br.com.fiap.integrationmicroservice.dto;

import java.time.LocalDateTime;

public class DroneCreateDTO {
	
	private long idDrone;
	private Double latitude;
	private Double longitude;
	private Double temperatura;
	private Double unidade;
	private LocalDateTime  dataAtualizacao;
	private Boolean rastreamento;
	
	
	
	public DroneCreateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DroneCreateDTO(long idDrone, Double latitude, Double longitude, Double temperatura, Double unidade,
			LocalDateTime  dataAtualizacao, Boolean rastreamento) {
		super();
		this.idDrone = idDrone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.temperatura = temperatura;
		this.unidade = unidade;
		this.dataAtualizacao = dataAtualizacao;
		this.rastreamento = rastreamento;
	}
	
	
	public long getIdDrone() {
		return idDrone;
	}
	public void setIdDrone(long idDrone) {
		this.idDrone = idDrone;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
	public LocalDateTime  getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDateTime  dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public Boolean getRastreamento() {
		return rastreamento;
	}
	public void setRastreamento(Boolean rastreamento) {
		this.rastreamento = rastreamento;
	}
	
	@Override
	public String toString() {
		return "DroneCreateDTO [idDrone=" + idDrone + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", temperatura=" + temperatura + ", unidade=" + unidade + ", dataAtualizacao=" + dataAtualizacao
				+ ", rastreamento=" + rastreamento + "]";
	}

}
