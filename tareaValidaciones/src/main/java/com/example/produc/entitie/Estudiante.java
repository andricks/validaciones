package com.example.produc.entitie;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Estudiantes")

public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "el nombre no puede ser vacio")
	@Column(name = "nombre")
	private String name;
	
	@NotBlank(message = "el nombre no puede ser vacio")
	@Column(name = "")
	private String email;
	
	@NotBlank(message = "el nombre no puede ser vacio")
	@Column(name = "")
	private String carnet;
	
	
	@NotNull(message = "el promedio no puede ser nulo")
	@Column(name = "promedio")
	private Double average;
	
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
   public String getcarnet() {
	return carnet;
}
   public void setcarnet(String carnet) {
	this.carnet = carnet;
}
}
