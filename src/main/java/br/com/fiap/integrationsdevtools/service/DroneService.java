package br.com.fiap.integrationsdevtools.service;

import br.com.fiap.integrationsdevtools.dto.DroneCreateDTO;
import br.com.fiap.integrationsdevtools.dto.DroneDTO;

public interface DroneService {

	 DroneDTO create(DroneCreateDTO droneCreateDTO);

}
