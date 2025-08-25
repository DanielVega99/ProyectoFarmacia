package Main;

import java.util.Scanner;

import Dominio.Medicamentos;
import Implementacion.LogicaMetodos;

public class PrincipalFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner lectura = null;
		
		 String nombreMedi;
		 String marcaMedi;
		 float precioMedi;
		 boolean recetaMedi;
		 
		 Medicamentos medicamento = null;
		 
		 int menuPrinc;
		 
		 LogicaMetodos imp = new LogicaMetodos();
		 
		 do {
			 System.out.println("Menu principal");
			 System.out.println("1---Alta");
			 System.out.println("2---Mostrar");
			 System.out.println("3---Buscar");
			 System.out.println("4---Editar");
			 System.out.println("5---Eliminar");
			 System.out.println("6---Salir");
			 
			 lectura = new Scanner(System.in);
			 menuPrinc = lectura.nextInt();
			 
			 switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingrese el nombre del medicamento");
					lectura = new Scanner(System.in);
					nombreMedi = lectura.nextLine();
					
					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marcaMedi = lectura.nextLine();
					
					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precioMedi = lectura.nextFloat();
					
					System.out.println("Ingrese si se puede comprar con receta o no (true o false)");
					lectura = new Scanner(System.in);
					recetaMedi = lectura.nextBoolean();
					
					medicamento = new Medicamentos(nombreMedi, marcaMedi, precioMedi, recetaMedi);
					
					//Agregar al hasMap
					imp.guardar(medicamento);
					System.out.println("Se guardo correctamente");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				break;
			case 2:
				imp.mostrar();
				break;
				
			case 3:
				System.out.println("Ingrese el nombre del medicamento a buscar");
				lectura = new Scanner(System.in);
				nombreMedi = lectura.nextLine();
				
				//buscar
				medicamento = imp.buscar(nombreMedi);
				System.out.println("***" + medicamento);
				break;
			case 4:
				System.out.println("Ingrese el nombre del medicamento a buscar");
				lectura = new Scanner(System.in);
				nombreMedi = lectura.nextLine();
				
				//buscar
				medicamento = imp.buscar(nombreMedi);
				System.out.println("***" + medicamento.getNombre());
				
				//no se podria editar el nmbre porqur es nuestra llave
				//editar - receta
				
				System.out.println("Ingrese si lleva receta (true o false)");
				lectura = new Scanner(System.in);
				recetaMedi = lectura.nextBoolean();
				
				//Actualizo el objeto
				medicamento.setReceta(recetaMedi);
				
				//Actualizzar en el hashMap
				imp.editar(medicamento);
				System.out.println("Se edito");
				
				
				break;
			case 5:
				System.out.println("Ingrese el nombre a eliminar");
				lectura = new Scanner(System.in);
				nombreMedi = lectura.nextLine();
				
				//Eliminar
				imp.eliminar(nombreMedi);
				System.out.println("se elimino");
				break;
			case 6:
				break;

			}
			
		} while (menuPrinc < 6);

	}

}
