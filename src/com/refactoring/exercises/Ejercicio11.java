package com.refactoring.exercises;

//EJERCICIO 11: Encapsulate Field (Encapsular Campo)
//Genera getters y setters para los campos públicos

public class Ejercicio11 {

	public String nombre;
    public int edad;
    public String email;
    
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
