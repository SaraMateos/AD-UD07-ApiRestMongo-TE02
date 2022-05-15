package eus.birt.dam.domain;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.data.annotation.Id;

@Document("citas")
public class Cita {
	
	//Atributos
	@Id
	private String id;
		
	private String paciente;
	
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private LocalDate fecha;
		
	private String informe;
		
	private Medico medico;

	//Cosntructor	
	public Cita(String paciente, LocalDate fecha, String informe, Medico medico) {
		super();
		this.paciente = paciente;
		this.fecha = fecha;
		this.informe = informe;
		this.medico = medico;
	}

	//Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Cita [id=" + id + ", paciente=" + paciente + ", fecha=" + fecha + ", informe=" + informe + ", medico="
				+ medico + "]";
	}	
	
}
