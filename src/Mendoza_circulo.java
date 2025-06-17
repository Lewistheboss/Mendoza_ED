
public class Mendoza_circulo {

	private int id;
    private String nombre;
    private double radio;
    private String color;
    //Constructor por defecto
    public Mendoza_circulo() {
		super();
	}
    //Constructor con argumentos 
    public Mendoza_circulo(int id, String nombre, double radio, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}
//Constructor con argumentos sin id 
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
	
	@Override
	public String toString() {
		return "Mendoza_circulo [id=" + id + ", nombre=" + nombre + ", radio=" + radio + ", color=" + color + "]";
	}
}
