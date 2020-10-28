package br.com.fiap.integrationmicroservice.service;

import org.springframework.stereotype.Service;

import br.com.fiap.integrationmicroservice.dto.DroneCreateDTO;
import br.com.fiap.integrationmicroservice.dto.DroneMedicoesCreateDTO;
import br.com.fiap.integrationmicroservice.produtor.DroneProdutor;

@Service
public class DroneServiceImpl implements DroneService {


	private final DroneProdutor droneProdutor;
	
	public DroneServiceImpl(DroneProdutor droneProdutor) {
		this.droneProdutor = droneProdutor;
	}
	
	@Override
	public void send(DroneCreateDTO droneCreateDTO) {
		try {
			droneProdutor.sendDrone(droneCreateDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendMedicoes(DroneMedicoesCreateDTO droneMedicoesCreateDTO) {
		try {
			droneProdutor.sendDroneMedicoes(droneMedicoesCreateDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
