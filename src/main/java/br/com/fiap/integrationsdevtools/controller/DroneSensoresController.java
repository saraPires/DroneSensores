package br.com.fiap.integrationsdevtools.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.com.fiap.integrationsdevtools.dto.DroneCreateDTO;
import br.com.fiap.integrationsdevtools.dto.DroneDTO;
import br.com.fiap.integrationsdevtools.produtor.DroneProdutor;
import br.com.fiap.integrationsdevtools.service.DroneService;



@RestController
@RequestMapping("drone")
public class DroneSensoresController {

    private final Logger logger = LoggerFactory.getLogger(DroneSensoresController.class);

    private final DroneService droneService;
    private final DroneProdutor droneProdutor;

    public DroneSensoresController(DroneService droneService, DroneProdutor droneProdutor) {
        this.droneService = droneService;
        this.droneProdutor = droneProdutor;
    }

	
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody DroneCreateDTO droneCreateDTO){
        try {
			droneProdutor.sendDrone(droneCreateDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	
}
