package br.com.fiap.integrationsdevtools.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.integrationsdevtools.service.DroneService;



@RestController
@RequestMapping("rest")
public class DroneSensoresController {

    private final Logger logger = LoggerFactory.getLogger(DroneSensoresController.class);

    private final DroneService droneService;

    public DroneSensoresController(DroneService droneService) {
        this.droneService = droneService;
    }

	
	public RequestBody<> envioDadosDroneSensor()
	
}
