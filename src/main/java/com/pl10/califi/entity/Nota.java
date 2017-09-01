package com.pl10.califi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "nota")
public class Nota {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(unique = true, nullable = false, updatable = false)
	private String id;
	@Column(name = "matricula", nullable = false)
	private String matricula;
	@Column(name = "nota1", nullable = false)
	private Double nota1;
	@Column(name = "nota2", nullable = false)
	private Double nota2;
	@Column(name = "nota3", nullable = false)
	private Double nota3;
	@Column(name = "nota4", nullable = false)
	private Double nota4;
	@Column(name = "nota5", nullable = false)
	private Double nota5;
	@Column(name = "promedio", nullable = false)
	private Double promedio;

	public Nota() {
		super();
	}

	public Nota(String id, String matricula, Double nota1, Double nota2, Double nota3, Double nota4, Double nota5,
			Double promedio) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.nota5 = nota5;
		this.promedio = promedio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getNota4() {
		return nota4;
	}

	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}

	public Double getNota5() {
		return nota5;
	}

	public void setNota5(Double nota5) {
		this.nota5 = nota5;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "nota [id=" + id + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", nota4=" + nota4 + ", nota5=" + nota5 + ", promedio=" + promedio + "]";
	}

}
