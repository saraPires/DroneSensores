package br.com.fiap.integrationmicroservice.dto;

import java.util.List;

public class DroneMedicoesDTO {
	
	private long id;
	private List<DroneDTO> medicoes;
	
	
	
	public DroneMedicoesDTO(long id,List<DroneDTO> medicoes) {
		super();
		this.id = id;
		this.medicoes = medicoes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public List<DroneDTO> getMedicoes() {
		return medicoes;
	}
	public void setMedicoes(List<DroneDTO> medicoes) {
		this.medicoes = medicoes;
	}
	@Override
	public String toString() {
		return "DroneMedicoesDTO [id=" + id + ", medicoes=" + medicoes + "]";
	}
	
	
	

}
