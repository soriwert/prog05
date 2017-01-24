/*2)	Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de tipo int para hora, 
minutos y segundos. Deberá tener un constructor para inicializar la hora a 0 o a una hora determinada 
(hora, minutos, segundos).Se deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de 
impresión y lectura será hh:mm:ss, todo en modo 24 horas. 
*/
package programaHora;
import java.util.*;


class Hora {
	private int h,m,s;

	public Hora (){
	h=00;
	m=00;
	s=00;
}
	public int getdimeHora(int h){
		this.h=h;	
		return h;
	}
	public int getdimeMin(int m){
		this.m=m;
		return m;
	}
	public int getdimeSeg(int s){
		this.s=s;
		return s;
	}
}

public class ProgramaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Hora miHora = new Hora ();
		
		System.out.print("La hora inicial es: " + miHora.getdimeHora(h)+":"+miHora.getdimeMin(m)+":"+miHora.getdimeSeg(s));
	}

}
