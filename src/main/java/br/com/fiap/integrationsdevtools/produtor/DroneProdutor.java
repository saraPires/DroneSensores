package br.com.fiap.integrationsdevtools.produtor;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import br.com.fiap.integrationsdevtools.configuration.Configuracao;



public class DroneProdutor {

    public static void main(String[] args) {

        //Set up queue, exchanges and bindings
        RabbitAdmin admin = new RabbitAdmin(Configuracao.getConnection());
        Queue queueDrone = new Queue("drone-queue.entrada");
        final String exchange = "drone.entrada";

        admin.declareQueue(queueDrone);

        DirectExchange exchangeDrone = new DirectExchange(exchange);
        admin.declareExchange(exchangeDrone);

        admin.declareBinding(BindingBuilder.bind(queueDrone).to(exchangeDrone).with("dados do drone"));

        RabbitTemplate template = new RabbitTemplate(Configuracao.getConnection());

        template.convertAndSend(exchange, "Drone", "Teste envio de dados");
    }
	
}
