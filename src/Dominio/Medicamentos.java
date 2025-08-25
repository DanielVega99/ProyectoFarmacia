package Dominio;

public class Medicamentos {
	
	private String nombre;
	private String marca;
	private float precio;
	private boolean receta;
	public Medicamentos(String nombre, String marca, float precio, boolean receta) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.receta = receta;
	}
	
	@Override
	public String toString() {
		return "Medicamentos [nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", receta=" + receta
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isReceta() {
		return receta;
	}

	public void setReceta(boolean receta) {
		this.receta = receta;
	}
	
	
	

}
