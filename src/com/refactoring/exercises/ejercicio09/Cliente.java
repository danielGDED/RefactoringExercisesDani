package com.refactoring.exercises.ejercicio09;

public class Cliente {

    private boolean vip;
    
    public boolean esVIP() {
        return vip;
    }

	public double calcularDescuento(Pedido monto) {
	    if (esVIP()) {
	        return monto.monto * 0.15;
	    }
	    return monto.monto * 0.05;
	}
}
