package br.com.fiap.integrationsdevtools.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import br.com.fiap.integrationsdevtools.configuration.Configuracao;
import br.com.fiap.integrationsdevtools.dto.DroneDTO;


public class DroneConsumer {

	
	public void receiveDrone (DroneDTO dronDTO) {
		
        RabbitTemplate template = new RabbitTemplate(Configuracao.getConnection());

        while(true){
            try {
                byte[] body = template.receive("drone-queue.entrada").getBody();
                System.out.println(new String(body));
            } catch (NullPointerException ex){
                System.out.println("fila vazia!");
                break;
            }
        }

    }
		
	
	
}
