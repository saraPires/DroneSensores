package br.com.fiap.integrationmicroservice.produtor;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import br.com.fiap.integrationmicroservice.configuration.Configuracao;
import br.com.fiap.integrationmicroservice.dto.DroneCreateDTO;
import br.com.fiap.integrationmicroservice.dto.DroneMedicoesCreateDTO;


@Component
public class DroneProdutor {

    public void sendDrone( DroneCreateDTO droneCreateDTO ) throws Exception {
    	//Convertendo o objeto para Json
    	Gson gson = new Gson();
    	String dadosDrone = gson.toJson( droneCreateDTO );
        final String exchange = "drone.entrada";
        RabbitTemplate template = new RabbitTemplate(Configuracao.getConnection());
        template.convertAndSend(exchange, "drone_data", dadosDrone );
    }
	
    
    public void sendDroneMedicoes( DroneMedicoesCreateDTO droneCreateDTO ) throws Exception {
    	//Convertendo o objeto para Json
    	Gson gson = new Gson();
    	String dadosDrone = gson.toJson( droneCreateDTO );
        final String exchange = "drone.entrada";
        RabbitTemplate template = new RabbitTemplate(Configuracao.getConnection());
        template.convertAndSend(exchange, "drone_data", dadosDrone );
    }
    
}
