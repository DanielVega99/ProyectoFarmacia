package Interface;

import Dominio.Medicamentos;

public interface Metodos {
	
	public void guardar(Medicamentos medicamento);
	
	public void mostrar();
	
	public Medicamentos buscar(String nombre);
	
	public void editar(Medicamentos medicamento);
	
	public void eliminar(String nombre);

}
