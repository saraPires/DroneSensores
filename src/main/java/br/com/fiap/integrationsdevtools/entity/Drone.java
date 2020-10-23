package br.com.fiap.integrationsdevtools.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "TB_DRONE")
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long droneid;
	private Long latitude;
	private Long longitude;
	private Long temperatura;
	private Double unidade;
	
	
	public Long getDroneid() {
		return droneid;
	}
	public void setDroneid(Long droneid) {
		this.droneid = droneid;
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
	
	
	
	
}
