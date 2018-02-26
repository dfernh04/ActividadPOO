package EjercicioParejas;

public class Asignatura {
String nombre;
double creditos;
float nota;
//GETTERS Y SETTERS
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getCreditos() {
	return creditos;
}
public void setCreditos(double creditos) {
	this.creditos = creditos;
}
public float getNota() {
	return nota;
}
public void setNota(float nota) {
	this.nota = nota;
}
//CNSTRUCTOR
public Asignatura(String nombre, double creditos) {
	super();
	this.nombre = nombre;
	this.creditos = creditos;
}
//METODOS
}
