package com.ejerciciopoo.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class pais {
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	
	@ManyToOne
	private ArrayList< cliente> clie;
	
	
	public pais() {
	}
	

	public pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "pais [id=" + id + ", nombre=" + nombre + "]";
	}

	
	
	

}
