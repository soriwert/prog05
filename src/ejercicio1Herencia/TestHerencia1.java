package ejercicio1Herencia;
import java.util.*;


class Empleado{

	Scanner teclado = new Scanner (System.in);
	private String nombre;
	private int sueldo, nEmpleado;
	
	public Empleado(){
		
	}


	public Empleado(String nombre, int sueldo, int nEmpleado){
		this.nombre=nombre;
		this.sueldo=sueldo;
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
	public String imprimeTodo(){
		return "nombre: "+nombre+" sueldo: "+sueldo;
	}
}






class Jefe extends Empleado {
	private String nombre, titulo, departamento;
	int nJefes, sueldo;

	public Jefe(){
		
	}
	
	public Jefe(String nombre, int sueldo, String titulo, String departamento, int nEmpleado){
	}
	
	
	public void numeroEmpleados(int nJefes){
		this.nJefes=nJefes;
	}
	
	public int numeroEmpleados(){
		return nJefes;
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

	public String dameDepartamento(){
		return departamento;
	}
	public String dameTitulo(){
		return titulo;
	}
	
	public void estableceDepartamento(String departamento){
		this.departamento=departamento;
	}
	public void estableceTitulo(String titulo){
		this.titulo=titulo;
	}
	public String imprimeTodo(){
		return "nombre: "+nombre+" sueldo: "+sueldo+" titulo: "+titulo+" departamento: "+departamento;
	}
}

public class TestHerencia1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		Empleado empleado = new Empleado();
		Jefe jefe = new Jefe ();
		
		System.out.println("¿Cuántos empleados hay?: ");
		empleado.numeroEmpleados(teclado.nextInt());
		
		
		
		Empleado Empleados1=new Empleado();
		
		Empleado[] Empleados=new Empleado[empleado.numeroEmpleados()];
		for (int i=0; i<empleado.numeroEmpleados();i++){
		System.out.println("Dame nombre de empleado: "+(i+1));
		empleado.estableceNombre(teclado.next());
		System.out.println("Dame sueldo de empleado: "+(i+1));
		empleado.estableceSueldo(teclado.nextInt());
		
		Empleados[i]=new Empleado(Empleados1.dameNombre(), Empleados1.dameSueldo(), empleado.numeroEmpleados());
		}
		
		System.out.println("¿Cuántos jefes hay?: ");
		jefe.numeroEmpleados(teclado.nextInt());
		
		Jefe[] Jefes=new Jefe[jefe.numeroEmpleados()];
		for(int i=0;i<jefe.numeroEmpleados();i++){
		System.out.println("Dame nombre de jefe: "+(i+1));
		jefe.estableceNombre(teclado.next());
		System.out.println("Dame sueldo de jefe: "+(i+1));
		jefe.estableceSueldo(teclado.nextInt());
		System.out.println("Dame titulo de jefe: "+(i+1));
		jefe.estableceTitulo(teclado.next());
		System.out.println("Dame departamento de jefe: "+(i+1));
		jefe.estableceDepartamento(teclado.next());
		Jefes[i]=new Jefe(jefe.dameNombre(), jefe.dameSueldo(), jefe.dameTitulo(), jefe.dameDepartamento(), jefe.numeroEmpleados());
		}
		
		
		
		for (int i=0;i<Empleados.length;i++){
			System.out.println(Empleados[i].imprimeTodo());
		}
		for (int i=0;i<Jefes.length;i++){
			System.out.println(Jefes[i].imprimeTodo());
			}
		
		
		
		
	}

}