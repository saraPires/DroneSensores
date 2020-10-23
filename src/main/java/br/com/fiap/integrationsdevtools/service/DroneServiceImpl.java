package br.com.fiap.integrationsdevtools.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.integrationsdevtools.dto.DroneCreateDTO;
import br.com.fiap.integrationsdevtools.dto.DroneDTO;
import br.com.fiap.integrationsdevtools.entity.Drone;
import br.com.fiap.integrationsdevtools.produtor.DroneProdutor;

@Service
public class DroneServiceImpl implements DroneService {

	private final DroneProdutor droneProdutor;
	
	public DroneServiceImpl(DroneProdutor droneProdutor) {
		this.droneProdutor = droneProdutor;
	}
	
	@Override
	public void send(DroneCreateDTO droneCreateDTO) {
		// TODO Auto-generated method stub
		try {
			droneProdutor.sendDrone(droneCreateDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Drone> putGetAllDrone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drone getMonitorDroneById(DroneDTO droneid) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
