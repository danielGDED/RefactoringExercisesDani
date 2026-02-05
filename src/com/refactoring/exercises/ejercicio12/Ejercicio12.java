package com.refactoring.exercises.ejercicio12;

//EJERCICIO 12: Replace Conditional with Polymorphism (Reemplazar Condicional con Polimorfismo)
//Reemplaza el switch con polimorfismo usando herencia

public class Ejercicio12 {

    public double calcularSalario(String tipo, double horasTrabajadas) {
    	Empleado empleado;
        switch (tipo) {
            case "DESARROLLADOR":
            	empleado = new Developer(horasTrabajadas);
                return empleado.calcularSalario();
            case "DISEÑADOR":
            	empleado = new Diseñador(horasTrabajadas);
                return empleado.calcularSalario();
            case "TESTER":
            	empleado = new Tester(horasTrabajadas);
                return empleado.calcularSalario();
            default:
                return horasTrabajadas * 30;
        }
    }
}
