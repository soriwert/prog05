package ejercicio1Herencia;
import java.util.*;

class Per {
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Per (String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public String getNombre () { 
    	return nombre;  
    	}
    
    public String getApellidos () { 
    	return apellidos;  
    	}
    
    public int getEdad () { 
    	return edad;   
    	}
    
} 




class Profesor extends Per {
  private String IdProfesor;
  
  public Profesor (String nombre, String apellidos, int edad) {
      super(nombre, apellidos, edad);
      IdProfesor = "Unknown";   
      }
  public void setIdProfesor (String IdProfesor) {
	  this.IdProfesor = IdProfesor;  
	  }
  
  public String getIdProfesor () {
	  return IdProfesor;   
	  }
  
  public void mostrarNombreApellidosYCarnet() {
      System.out.println ("Profesor de nombre: " + getNombre() + " " +  getApellidos() +
       " con Id de profesor: " + getIdProfesor() ); }
}

public class TestHerencia1 {
  public static void main (String [ ] Args) {
	  Scanner teclado=new Scanner(System.in);
      Profesor profesor1 = new Profesor (teclado.next(), teclado.next(), teclado.nextInt());
      profesor1.setIdProfesor(teclado.next());
      profesor1.mostrarNombreApellidosYCarnet();}
} 