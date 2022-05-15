package eus.birt.dam.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.springframework.format.annotation.DateTimeFormat;


public class Medico {

	//Atributos
	private String id;
		
	private String nombre;
		
	private String apellidos;
	
	@DateTimeFormat (pattern = "yyyy-MM-dd")
	private LocalDate nacimiento;

	private String especialidad;
	
	List <Cita> citas = new ArrayList<>();

	//Constructores
	public Medico() {
		super();
	}
	
	public Medico(String nombre, String apellidos, LocalDate nacimiento, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
		this.especialidad = especialidad;
	}

	//Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	
}
