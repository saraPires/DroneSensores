package br.com.fiap.integrationsdevtools.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.integrationsdevtools.entity.Drone;

public interface DroneRepository  extends JpaRepository<Drone, Long>  {

}
