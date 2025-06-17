//AUTOR: LUIS MENDOZA
//version 1.0

public class Mendoza_rectangulo {
//Atributos principales de el rectangulo a crear. 
	 private int id;
	    private double ladoA;
	    private double ladoB;
	    private String color;
	
//Cosntructor por defecto, sin argumentos. 
		public Mendoza_rectangulo() {
			super();
		}  
//Constructor sin id

public Mendoza_rectangulo(double ladoA, double ladoB, String color) {
	super();
	this.ladoA = ladoA;
	this.ladoB = ladoB;
	this.color = color;
}
//constructor generico con todos los argumentos.
public Mendoza_rectangulo(int id, double ladoA, double ladoB, String color) {
	super();
	this.id = id;
	this.ladoA = ladoA;
	this.ladoB = ladoB;
	this.color = color;
}
// getter y setter
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getLadoA() {
	return ladoA;
}

public void setLadoA(double ladoA) {
	this.ladoA = ladoA;
}

public double getLadoB() {
	return ladoB;
}

public void setLadoB(double ladoB) {
	this.ladoB = ladoB;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
//ToString
@Override
public String toString() {
	return "Mendoza_rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
}



		
}
