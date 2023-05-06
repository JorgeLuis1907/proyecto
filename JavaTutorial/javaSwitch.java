import java.util.Scanner;
class javaSwitch{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese que dia de la semana es : (lunes, martes, miercoles, jueves, viernes, sabado, domingo)");
		String dia=sc.next();
		System.out.print("FELIZ "); 
		switch(dia){
			case "lunes":
			System.out.println("LUNES, INICIO DE SEMANA");
			break;
			case "martes":
			System.out.println("MARTES, YA VAMOS SEGUNDO DIA DE SEMANA");
			break;
			case "miercoles":
			System.out.println("MIERCOLES, YA VAMOS MITAD DE SEMANA. ¡¡ANIMO!!");
			break;
			case "jueves":
			System.out.println("JUEVES, YA CASI LLEGA EL FIN DE SEMANA.");
			break;
			case "viernes":
			System.out.println("VIERNES, YA ES FIN DE SEMANA. ¿QUE PLANES?");
			break;
			case "sabado":
			System.out.println("SABADO, APROVECHA EL FIN DE SEMANA");
			break;
			case "domingo":
			System.out.println("DOMINGO, YA SE ACABA EL FIN DE SEMANA, APROVECHALOOO!");
			break;
			default:
			System.out.println("\nIngrese mal el dia");
			break;
		}
	}
}
