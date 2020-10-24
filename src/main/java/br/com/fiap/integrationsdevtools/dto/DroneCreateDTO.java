package br.com.fiap.integrationsdevtools.dto;

import java.sql.Date;

public class DroneCreateDTO {
	
	private long idDrone;
	private Long latitude;
	private Long longitude;
	private Long temperatura;
	private Double unidade;
	private Date dataAtualizacao;
	private Boolean rastreamento;
	
	
	
	
	
	public DroneCreateDTO(long idDrone, Long latitude, Long longitude, Long temperatura, Double unidade,
			Date dataAtualizacao, Boolean rastreamento) {
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
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	public Long getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Long temperatura) {
		this.temperatura = temperatura;
	}
	public Double getUnidade() {
		return unidade;
	}
	public void setUnidade(Double unidade) {
		this.unidade = unidade;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
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
