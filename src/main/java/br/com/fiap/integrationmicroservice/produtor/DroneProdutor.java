package br.com.fiap.integrationmicroservice.produtor;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import com.google.gson.Gson;

import br.com.fiap.integrationmicroservice.configuration.Configuracao;
import br.com.fiap.integrationmicroservice.dto.DroneCreateDTO;
import br.com.fiap.integrationmicroservice.dto.DroneDTO;


public class DroneProdutor {

    public void sendDrone( DroneCreateDTO droneCreateDTO ) throws Exception {
    	
    	//Convertendo o objeto para Json
    	Gson gson = new Gson();
    	String dadosDrone = gson.toJson( droneCreateDTO );
    	
        //Set up queue, exchanges and bindings
        RabbitAdmin admin = new RabbitAdmin(Configuracao.getConnection());
        Queue queueDrone = new Queue("drone-queue.entrada");
        final String exchange = "drone.entrada";

        admin.declareQueue(queueDrone);

        DirectExchange exchangeDrone = new DirectExchange(exchange);
        admin.declareExchange(exchangeDrone);
        admin.declareBinding(BindingBuilder.bind(queueDrone).to(exchangeDrone).with(dadosDrone));

        RabbitTemplate template = new RabbitTemplate(Configuracao.getConnection());
        
        template.convertAndSend(exchange, "Drone", dadosDrone );
    }
	
}
