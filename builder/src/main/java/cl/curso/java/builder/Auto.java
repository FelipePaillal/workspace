package cl.curso.java.builder;

import java.util.List;

public class Auto {
	
	private String marca;
	private String modelo;
	private Gps gps;
	private Motor motor;
	private List<Ruedas> ruedas;
	
	
	public Auto(String marca, String modelo, Gps gps, Motor motor, List<Ruedas> ruedas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.gps = gps;
		this.motor = motor;
		this.ruedas = ruedas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Gps getGps() {
		return gps;
	}


	public void setGps(Gps gps) {
		this.gps = gps;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public List<Ruedas> getRuedas() {
		return ruedas;
	}


	public void setRuedas(List<Ruedas> ruedas) {
		this.ruedas = ruedas;
	}
	
	
	

}
