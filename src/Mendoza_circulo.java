//Luis Mendoza
//version 1.0
//Descripcion: En esta clase indicaremos las caracteristicas del circulo que deseemos
public class Mendoza_circulo {
//Aqui estan los caracteres, id, nombre radio color....
	private int id;
    private String nombre;
    private double radio;
    private String color;
    //Constructor por defecto (SIN NADA)
    public Mendoza_circulo() {
		super();
	}
    //Constructor con argumentos  (TODOS LOS ARGUMENTOS)
    public Mendoza_circulo(int id, String nombre, double radio, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}
//Constructor con argumentos (SIN ID)
	public Mendoza_circulo(String nombre, double radio, String color) {
		super();
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}
	
    //Getter y Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
    
	//ToString
	//Aqui nos mostrará lo que hayamos indicado para despues.
	@Override
	public String toString() {
		return "Mendoza_circulo [id=" + id + ", nombre=" + nombre + ", radio=" + radio + ", color=" + color + "]";
	}
}
