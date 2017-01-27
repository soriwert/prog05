/*2)	Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de tipo int para hora, 
minutos y segundos. Deber� tener un constructor para inicializar la hora a 0 o a una hora determinada 
(hora, minutos, segundos).Se deber� poder sumar y restar horas, as� como imprimir y leer una hora. El formato de 
impresi�n y lectura ser� hh:mm:ss, todo en modo 24 horas. 
*/
package programaHora;
import java.util.*;


class Hora {
	private int h,m,s, hh=0, hh2=0, h2=0, sumahh, sumah=0;
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
	public int getHora(){
		return h;
	}
	public int getMin(){
		return m;
	}
	public int getSeg(){
		return s;
	}
	public String getHoraNew(int hh, int h){
		this.hh=hh;
		this.h=h;
		String Cero= ""+hh+""+h;
		return Cero;
	
}
	public void setHoraNew(int hh, int h) {
	this.hh=hh;
	this.h=h;
}
	

	
	
	
	
	public void setSumahh(int hh2, int hh, int h2, int h) {
	this.hh2=hh2;
	this.hh=hh;
	this.h2=h2;
	this.h=h;
	
	}

	public String getSumahh(int hh2, int hh, int h2, int h){
		this.hh2=hh2;
		this.hh=hh;
		this.h2=h2;
		this.h=h;
		int sumahh=hh2+hh;
		int sumah=h2+h;
		if (sumahh< 0 || sumahh > 2 || sumah < 0 || sumah>9){
			hh2=0;
			hh=0;
			h2=0;
			h=0;
			sumahh=0;
			sumahh=0;
			return "error, la hora supera las 24 o horas. La hora pasa a estar en "+sumahh+""+sumah;
		}
		else 
		{
			h=sumah;
			hh=sumahh;
			return ""+sumahh+""+sumah;
		}
	}


}






public class ProgramaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int c=0, HoraUsuhh=0,HoraUsuh=0, MinUsu=0, SegUsu=0, opcion=0, HoraUSumahh=0, HoraUSumah=0;
		
		
		Hora miHora = new Hora();
		
		
		do{
			System.out.println("Menu \nElija una opci�n: \n1. Hora Predeterminada. "
					+ "\n2. Establecer hora. \n3. Sumar hora. \n4. Restar hora. "
					+"\n5. Imprimir hora. \n6. Leer hora. \n0. Salir");
			opcion=teclado.nextInt();
			switch (opcion){
//hora predeterminada
			case 1:
				System.out.println("La hora inicial es: "+miHora.getHoraNew(0,0)+":"
									+c+""+miHora.getMin()+":"+c+""+miHora.getSeg());
				
				break;
// Establecer hora
				
			case 2:
				System.out.println("Escriba la hora (primerDígito intro segundoDigito): ");
				miHora.setHoraNew(HoraUsuhh=teclado.nextInt(),HoraUsuh=teclado.nextInt());
				
				
				
				System.out.println("Escriba los minutos: ");
				miHora.setMin(teclado.nextInt());
				System.out.println("Escriba los Segundos");
				miHora.setSeg(teclado.nextInt());
				break;
			
			
			
			case 3:
				
				
				System.out.println("Escriba la hora que desea sumar (primerDígito intro segundoDigito): ");
				miHora.setSumahh(HoraUSumahh=teclado.nextInt(),HoraUsuhh, HoraUSumah=teclado.nextInt(), HoraUsuh);
				System.out.println("La hora sumada es: "+miHora.getSumahh(HoraUSumahh,HoraUsuhh,HoraUSumah,HoraUsuh));
				break;
			
			
			case 4:
				break;
				
			case 5:
				System.out.println("La hora inicial ha cambiado a: "+miHora.getHoraNew(HoraUsuhh, HoraUsuh)+":"
						+miHora.getMin()+":"+miHora.getSeg());
				break;
			case 6:
				break;
			}
			if (opcion<0 || opcion>6){
				System.out.println("Error, vuelva a escribir un n�mero.");
			}
		}while(opcion != 0);
		
		
		
		
		
		
	}

}
