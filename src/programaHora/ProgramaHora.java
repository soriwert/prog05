/*2)	Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de tipo int para hora, 
minutos y segundos. Deberá tener un constructor para inicializar la hora a 0 o a una hora determinada 
(hora, minutos, segundos).Se deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de 
impresión y lectura será hh:mm:ss, todo en modo 24 horas. 
*/
package programaHora;
import java.util.*;


class Hora {
	private int h,m,s;
	String c="0";

	public Hora (){
		
		this.h=0;
		this.m=0;
		this.s=0;
	}
	
	public void setHora(int h){
		this.h=h;	
	}
	public void setMin(int m){
		this.m=m;	
	}
	public void setSeg(int s){
		this.s=s;	
	}
	public void setOperacion(int h, int m, int s){
		this.h=h;
		this.m=m;
		this.s=s;
	}
	
	public String getOperacion(int h, int m, int s){
		this.h=h;
		this.m=m;
		this.s=s;
		return ""+h+":"+m+":"+s+"";
	}
	public int getHora(){
		return h;
	}
	
	public int getMin(){
		return m;
	}
	public int getSeg(){
		return s;
	}
}

public class ProgramaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int c=0, HoraUsu=0, MinUsu=0, SegUsu=0, opcion=0;
		
		
		Hora miHora = new Hora();
		
		
		do{
			System.out.println("Menu \nElija una opción: \n1. Hora Predeterminada. \n2. Establecer hora. \n3. Sumar hora. \n4. Restar hora. "
					+"\n5. Imprimir hora. \n6. Leer hora. \n0. Salir");
			opcion=teclado.nextInt();
			switch (opcion){
//hora predeterminada
			case 1:
				System.out.println("La hora inicial es: "+c+""+miHora.getHora()+":"+c+""+miHora.getMin()+":"+c+""+miHora.getSeg());	
				break;
// Establecer hora
			case 2:
				System.out.println("Escriba la hora: ");
				HoraUsu=teclado.nextInt();
				System.out.println("Escriba los minutos: ");
				MinUsu=teclado.nextInt();
				System.out.println("Escriba los Segundos");
				SegUsu=teclado.nextInt();
				break;
			case 3:
				System.out.print(miHora.getOperacion(HoraUsu, MinUsu, SegUsu));
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
			if (opcion<0 || opcion>6){
				System.out.println("Error, vuelva a escribir un número.");
			}
		}while(opcion != 0);
		
		
		
		
		
		
	}

}
