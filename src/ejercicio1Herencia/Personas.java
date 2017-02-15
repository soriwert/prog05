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
	int nJefes;

	
	public Jefe(String nombre, int sueldo, String titulo, String departamento, int nEmpleado){
		super (nombre, sueldo, nEmpleado);

	}
	public Jefe (){
		this.nJefes=super.numeroEmpleados();
	}
	
	public void numeroEmpleados(int nEmpleados){
		this.nJefes=nEmpleados;
		this.nJefes=super.numeroEmpleados();
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
			Empleados1.estableceNombre(nombre);
			
			System.out.println("Escriba el sueldo:");
			sueldo=teclado.nextInt();
			Empleados1.estableceSueldo(sueldo);
			
			Empleados[i]=new Empleado(Empleados1.dameNombre(), Empleados1.dameSueldo(), nEmpleados);
			
		}
		
		
		Jefe jefes1 = new Jefe();
		
		System.out.println("Cuantos jefes son?: ");
		nJefes=teclado.nextInt();
		jefes1.numeroEmpleados(nJefes);
		
		Jefe[] Jefes=new Jefe[nJefes];
		
		
		
		for(int i=0;i<nJefes;i++){
		System.out.println("Escriba el nombre del Jefe: ");
		nombre=teclado.next();
		jefes1.estableceNombre(nombre);
		System.out.println("Escriba el sueldo: ");
		sueldo=teclado.nextInt();
		jefes1.estableceSueldo(sueldo);
		System.out.println("Escriba el título: ");
		titulo=teclado.next();
		jefes1.estableceTitulo(titulo);
		System.out.println("Escriba el nombre del departamento: ");
		departamento=teclado.next();
		jefes1.estableceDepartamento(departamento);
		
		
		Jefes[i]=new Jefe(jefes1.dameNombre(), jefes1.dameSueldo(), jefes1.dameTitulo(), jefes1.dameDepartamento(), nEmpleados);
		}
		
		
		for (Empleado e: Empleados){
			System.out.println("Nombre: "+e.dameNombre()+" sueldo: "+e.dameSueldo());
		}
		for (Jefe j: Jefes){
			System.out.println("Nombre: "+j.dameNombre()+" Sueldo "+j.dameSueldo()+" Titulo: "+ j.dameTitulo()+" departamento: "+j.dameDepartamento());
		}

	}

}
