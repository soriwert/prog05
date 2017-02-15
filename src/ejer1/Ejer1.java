package ejer1;
import java.util.*;

class Empleado{

	private String nombre;
	private int sueldo;	
	
	public Empleado(String nombre, int sueldo){

		this.nombre = nombre;
		this.sueldo = sueldo;	
	}

	public String dame(){

		return nombre+", "+sueldo;
	}
}// fin Empleado



class Jefe extends Empleado{

	private String titulo, departamento;

	public Jefe(String nombre, int sueldo, String titulo, String departamento){

		super(nombre,sueldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}


	public String dame(){

		return super.dame()+", "+titulo+", "+departamento;
	}

}// fin Jefe

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida los datos de una serie de empleados que NO son jefes, tantos como el usuario indique.
		 *  También hay que pedir los datos de una serie de jefes que son, al mismo tiempo, empleados, tantos como el usuario indique.
		 *  
		 *  Una vez insertados todos los datos, hay que visualizarlos.
		 *	De los empleados nos interesa: nombre y sueldo.
		 *	De los jefes nos interesa: nombre, sueldo, título y nombre del departamento del que es jefe
		 *  
		 * */

		Scanner teclado = new Scanner(System.in);

		Empleado[] empresa;	

		int num_emple, num_jefes, personal;

		System.out.println("¿Cuantos empleados?");
		num_emple = teclado.nextInt();

		System.out.println("¿Cuantos jefes?");
		num_jefes = teclado.nextInt();

		personal = num_emple+num_jefes;
		empresa = new Empleado[personal];


		for(int i = 0; i < personal; i++){

			if(i < num_emple){	
				System.out.println(" Empleado: nombre, sueldo");
				empresa[i] = new Empleado(teclado.next(), teclado.nextInt());

			}else{	
				System.out.println(" Jefe: nombre, sueldo, titulo, departamento");
				empresa[i] = new Jefe(teclado.next(), teclado.nextInt(), teclado.next(),teclado.next());				
			}			
		}


		System.out.println("\n=== DATOS ===");

		for(int i = 0; i < personal; i++){

			if(i < num_emple){	
				System.out.println("Empleado: "+empresa[i].dame());
				

			}else{					
				System.out.println("Jefe: "+empresa[i].dame());				
			}			
		}



		System.out.println("\n=== FIN ===");
		
	}
}