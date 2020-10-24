package br.com.fiap.integrationsdevtools.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


import br.com.fiap.integrationsdevtools.dto.DroneCreateDTO;
import br.com.fiap.integrationsdevtools.dto.DroneCreateUpdateDTO;
import br.com.fiap.integrationsdevtools.dto.DroneDTO;
import br.com.fiap.integrationsdevtools.dto.DroneMedicoesDTO;
import br.com.fiap.integrationsdevtools.produtor.DroneProdutor;
import br.com.fiap.integrationsdevtools.service.DroneService;



@RestController
@RequestMapping("drone")
public class DroneSensoresController {

    private final Logger logger = LoggerFactory.getLogger(DroneSensoresController.class);

    private final DroneService droneService;
 

    public DroneSensoresController(DroneService droneService) {
        this.droneService = droneService;
        
    }

	
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody DroneCreateDTO droneCreateDTO){
        try {
        	droneService.send(droneCreateDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("");
		}
        logger.info("Envio de dados do drone" );
    }
    
    @GetMapping
    public List<DroneDTO> getAllDrone(@RequestParam(required = false) Integer numero){
        logger.info("Hello");
        return droneService.findAll(numero);
    }

    @GetMapping("{id}")
    public DroneDTO GetMonitorDroneById(@PathVariable Long id){
        return droneService.findById(id);
    }


    @PutMapping("{id}/medicoes")
    public DroneDTO update(@PathVariable Long id,
                             @RequestBody DroneCreateUpdateDTO productCreateUpdateDTO){
        return droneService.update(id, productCreateUpdateDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
    	droneService.delete(id);
    }

    //GetAllDrones
    @GetMapping
	public List<DroneMedicoesDTO> getAllDrones(){
       droneService.getAllDrones();
    }
    
    //GetAllMonitoramentoByDroneId
    @GetMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public DroneMedicoesDTO  getAllMonitoramentoByDroneId(@PathVariable Long id) {
    	droneService.getAllMonitoramentoByDroneId(Long id);
    }
}
