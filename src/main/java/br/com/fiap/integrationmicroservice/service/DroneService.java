package br.com.fiap.integrationmicroservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.integrationmicroservice.dto.DroneCreateDTO;
import br.com.fiap.integrationmicroservice.dto.DroneDTO;
import br.com.fiap.integrationmicroservice.dto.DroneMedicoesDTO;




@Service
public interface DroneService  {
	
	 DroneDTO send(DroneCreateDTO droneCreateDTO);
	 List<DroneDTO> getAllDrone();
	 DroneDTO getMonitorDroneById(DroneDTO droneid);
	 List<DroneMedicoesDTO> getAllDrones();
	 DroneMedicoesDTO getAllMonitoramentoByDroneId(Long id);
	 void delete(Long id);
	 List<DroneDTO> findAll(Integer numero); 
}
