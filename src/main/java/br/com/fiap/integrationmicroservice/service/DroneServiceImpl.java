package br.com.fiap.integrationmicroservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.integrationmicroservice.dto.DroneCreateDTO;
import br.com.fiap.integrationmicroservice.dto.DroneDTO;
import br.com.fiap.integrationmicroservice.dto.DroneMedicoesDTO;
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
	public List<DroneDTO> putGetAllDrone() {
		List<DroneDTO> drone
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DroneDTO getMonitorDroneById(DroneDTO droneid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DroneDTO> getAllDrone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DroneDTO getMonitorDroneById(DroneDTO droneid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DroneMedicoesDTO> getAllDrones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DroneMedicoesDTO getAllMonitoramentoByDroneId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DroneDTO> findAll(Integer numero) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	
}
