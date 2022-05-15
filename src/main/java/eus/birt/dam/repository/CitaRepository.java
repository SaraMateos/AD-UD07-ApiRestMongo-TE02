package eus.birt.dam.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import eus.birt.dam.domain.Cita;

public interface CitaRepository extends MongoRepository<Cita, String> {
	
	List<Cita> findByPaciente(String paciente);

}
