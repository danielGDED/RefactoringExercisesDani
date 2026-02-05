package com.refactoring.exercises.ejercicio12;

public abstract class Empleado {

	private double horasTrabajadas;
	
	
	public Empleado(double horasTrabajadas) {
		super();
		this.horasTrabajadas = horasTrabajadas;
	}

	protected abstract double calcularSalario();
	
	protected double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	protected void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
}
