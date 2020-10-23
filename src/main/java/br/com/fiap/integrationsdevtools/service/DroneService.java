package br.com.fiap.integrationsdevtools.service;

import java.util.List;

import org.springframework.stereotype.Service;


import br.com.fiap.integrationsdevtools.dto.DroneCreateDTO;
import br.com.fiap.integrationsdevtools.dto.DroneDTO;
import br.com.fiap.integrationsdevtools.entity.Drone;



@Service
public interface DroneService  {
	
	 
	 void send(DroneCreateDTO droneCreateDTO);
	 List<Drone> putGetAllDrone();
	 Drone getMonitorDroneById(DroneDTO droneid); 
}
