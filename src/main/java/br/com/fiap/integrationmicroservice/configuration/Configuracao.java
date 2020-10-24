package br.com.fiap.integrationmicroservice.configuration;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;

public class Configuracao {
    private static CachingConnectionFactory connectionFactory;

    public static CachingConnectionFactory getConnection(){

        if(connectionFactory == null){
            connectionFactory = new CachingConnectionFactory("rattlesnake.rmq.cloudamqp.com");//TODO add hostname
            connectionFactory.setUsername("xcqnwfuc");//TODO add username
            connectionFactory.setPassword("j8SOCFBdHduGTUHpzAXed2w5hun8tLA9");//TODO add password
            connectionFactory.setVirtualHost("xcqnwfuc");//TODO add virtualhost

            //Recommended settings
            connectionFactory.setRequestedHeartBeat(30);
            connectionFactory.setConnectionTimeout(30000);
        }

        return connectionFactory;
    }
}
