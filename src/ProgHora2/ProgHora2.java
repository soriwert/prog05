/*2)	Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de tipo int para hora, 
minutos y segundos. Deberï¿½ tener un constructor para inicializar la hora a 0 o a una hora determinada 
(hora, minutos, segundos).Se deberï¿½ poder sumar y restar horas, asï¿½ como imprimir y leer una hora. El formato de 
impresiï¿½n y lectura serï¿½ hh:mm:ss, todo en modo 24 horas. 
*/
package ProgHora2;
import java.util.*;


class Hora {
	private int hora,min,seg, ceroAux=0;

	public Hora (){		
		this.hora=0;
		this.min=0;
		this.seg=0;
		this.ceroAux=0;
		
	}
	
	
	// 
	public void estableceHora(int HoraIni){
		
		if (HoraIni < 0 || HoraIni > 23) {
			System.out.println("NUEVA HORA INCORRECTA.");
			return;
		} 
		this.hora=HoraIni;
	}
	public void estableceMin(int MinIni){
		if (MinIni < 0 || MinIni > 59){
			System.out.println("NUEVOS MINUTOS INCORRECTOS.");
		return;
		}
		this.min=MinIni;
		
	}
	public void estableceSeg(int SegIni){
		if (SegIni < 0 || SegIni > 59){
			System.out.println("NUEVOS MINUTOS INCORRECTOS.");
		return;
		}
		this.seg=SegIni;
		
	}
	public String dimeHora(){
		if (hora > 0 && hora <= 9){
		return ""+ceroAux+""+hora;
		}
		else
		return ""+hora;
	}
	public String dimeMin(){
		if (min > 0 && min <= 9){
			return ""+ceroAux+""+hora;
			}
			else
			return ""+hora;
	}
	public String dimeSeg(){
		if (seg > 0 && seg <= 9){
			return ""+ceroAux+""+seg;
			}
			else
			return ""+seg;
	}
	
	
	// SUMA (SE PUEDE REDUCIR A UNO JUNTANDOLOS TODOS, PERO ASÍ ES MÁS DETALLADO)
	public void estableceSumaHora(int sumarHora){
		hora+=sumarHora;
	}
	public String dimeSumaHora(){
		return ""+hora;
	}
	public void estableceSumaMin(int sumarMin){
		min+=sumarMin;
	}
	public String dimeSumaMin(){
		return ""+min;
	}
	public void estableceSumaSeg(int sumarSeg){
		seg+=sumarSeg;
	}
	public String dimeSumaSeg(){
		return ""+seg;
	}
	
	// RESTA (SE PUEDE REDUCIR A UNO JUNTANDOLOS TODOS, PERO ASÍ ES MÁS DETALLADO)
	public void estableceRestaHora(int restarHora){
		hora-=restarHora;
	}
	public String dimeRestaHora(){
		return ""+hora;
	}
	public void estableceRestaMin(int restarMin){
		min-=restarMin;
	}
	public String dimeRestaMin(){
		return ""+min;
	}
	public void estableceRestaSeg(int restarSeg){
		seg-=restarSeg;
	}
	public String dimeRestaSeg(){
		return ""+seg;
	}
	
	
	// SUMA TOTAL
	public String dimeSumaTotal(){
		return ""+hora+":"+min+":"+seg;
	}
}






public class ProgHora2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Hora miHora = new Hora();
		int opcion;
		
		do{
			System.out.println("Menu \nElija una opciï¿½n: \n1. Hora Predeterminada. "
								+ "\n2. Establecer hora. \n3. Sumar hora. \n4. Restar hora. "
								+"\n5. Imprimir hora. \n6. Leer hora. \n0. Salir");
			
			opcion=teclado.nextInt();
			
			
			switch (opcion){

			//hora predeterminada
			case 1:
				System.out.println("La hora inicial es: "+miHora.dimeHora()+":"+miHora.dimeMin()+":"+miHora.dimeSeg());
				break;
				
			// Establecer hora
			case 2:
				System.out.println("Escriba la hora: ");
				miHora.estableceHora(teclado.nextInt());				
				System.out.println("Escriba los minutos: ");
				miHora.estableceMin(teclado.nextInt());
				System.out.println("Escriba los Segundos");
				miHora.estableceSeg(teclado.nextInt());
				break;
			
			
			
			case 3:
				System.out.println("Escriba la hora que desea sumar");
				System.out.print("Hora: ");
				miHora.estableceSumaHora(teclado.nextInt());
				System.out.print("Minutos: ");
				miHora.estableceSumaMin(teclado.nextInt());
				System.out.print("Segundos: ");
				miHora.estableceSumaSeg(teclado.nextInt());
				System.out.println("La hora sumada es: "+miHora.dimeSumaTotal());
				break;
			
			
			case 4:
				break;
				
			case 5:
				System.out.println("La hora inicial ha cambiado a: "+miHora.dimeHora()+":"+miHora.dimeMin()+":"+miHora.dimeSeg());
				break;
			
			case 6:
				break;
			}
			if (opcion<0 || opcion>6){
				System.out.println("Error, vuelva a escribir un nï¿½mero.");
			}
		}while(opcion != 0);
		
		
		
		
		
		
	}

}