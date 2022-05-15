package eus.birt.dam.bootstrap;

import java.time.LocalDate;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import eus.birt.dam.domain.Cita;
import eus.birt.dam.domain.Medico;
import eus.birt.dam.repository.CitaRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	@Autowired
	private CitaRepository citaRepository;

	@Override
	public void run(String... args) throws Exception {

		citaRepository.deleteAll();

		Medico medico1 = new Medico("Sara", "Mateos", LocalDate.parse("1986-05-25"), "Cardiologa");
		Medico medico2 = new Medico("Patxi", "Zumeta", LocalDate.parse("1980-04-01"), "Pediatra");

		citaRepository.save(new Cita("Ander", LocalDate.parse("2022-05-05"), "Dolor de cabeza", medico2));
		citaRepository.save(new Cita("Federico", LocalDate.parse("2022-05-06"), "Arritmia", medico1));
		citaRepository.save(new Cita("Idoia", LocalDate.parse("2022-05-08"), "Taquicardia", medico1));

		System.out.println("Citas encontradas con findAll():");
		System.out.println("-------------------------------");
		for (Cita cita : citaRepository.findAll()) {
			System.out.println(cita);
		}

	}

}