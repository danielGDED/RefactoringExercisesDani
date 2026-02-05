package com.refactoring.exercises.ejercicio12;

public class Diseñador extends Empleado {

	private static final int TARIFA_POR_HORA = 40;

	public Diseñador(double horasTrabajadas) {
		super(horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularSalario() {
		return this.getHorasTrabajadas()*TARIFA_POR_HORA;
	}

}
