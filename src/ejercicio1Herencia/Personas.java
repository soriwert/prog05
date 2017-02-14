package ejercicio1Herencia;
import java.util.*;


class Empleado{

	Scanner teclado = new Scanner (System.in);
	private String nombre;
	private int sueldo, nEmpleado;


	public Empleado(String nombre, int sueldo, int nEmpleado){
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	
	public Empleado(){
		
	}
	
	public void numeroEmpleados(int nEmpleado){
		this.nEmpleado=nEmpleado;
	}
	public int numeroEmpleados(){
		return nEmpleado;
	}
	
	public void estableceNombre(String nombre){
		this.nombre=nombre;
	}
	public String dameNombre(){
		return nombre;
	}
	public void estableceSueldo(int sueldo){
		this.sueldo=sueldo;
	}
	public int dameSueldo(){
		return sueldo;
	}

}






class Jefe extends Empleado {
	private String titulo, departamento;
	
	public Jefe (){
		
	}
	public Jefe(String nombre, int sueldo, String titulo, String departamento, int nEmpleado){
		super (nombre, sueldo, nEmpleado);
	
		}
	
	public String dameDepartamento(){
		return departamento;
	}
	public String dameTitulo(){
		return titulo;
	}
}

public class Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int nEmpleados, sueldo, nJefes;
		String nombre, titulo, departamento;
		
		System.out.println("Cuantos empleados son?: ");
		nEmpleados=teclado.nextInt();
		
		Empleado Empleados1=new Empleado();
		
		Empleado[] Empleados=new Empleado[nEmpleados];
		for (int i=0; i<nEmpleados;i++){
			System.out.println("Escriba el nombre");
			nombre=teclado.next();
			System.out.println("Escriba el sueldo:");
			sueldo=teclado.nextInt();
			
			Empleados[i]=new Empleado(nombre, sueldo, nEmpleados);
			
		}
		
		
		Jefe Jefes1 = new Jefe();
		
		System.out.println("Cuantos jefes son?: ");
		nJefes=teclado.nextInt();
		
		Jefe[] Jefes=new Jefe[nJefes];
		
		for(int i=0;i<nJefes;i++){
		System.out.println("Escriba el nombre del Jefe: ");
		nombre=teclado.next();
		
		System.out.println("Escriba el sueldo: ");
		sueldo=teclado.nextInt();
		
		System.out.println("Escriba el título: ");
		titulo=teclado.next();
		
		System.out.println("Escriba el nombre del departamento: ");
		departamento=teclado.next();
		
		
		Empleados[i]=new Jefe(nombre, sueldo, titulo, departamento, nEmpleados);
		}
		
		
		
		for (int i=0; i<nEmpleados;i++){
			System.out.println("Nombre: "+Empleados[i].dameNombre()+" sueldo: "+Empleados[i].dameSueldo());
			System.out.println("Nombre: "+Jefes[i].dameNombre()+" Sueldo "+Jefes[i].dameSueldo()+" Titulo: "+ Jefes[i].dameTitulo()+" departamento: "+Jefes[i].dameDepartamento());
		}
	}

}
