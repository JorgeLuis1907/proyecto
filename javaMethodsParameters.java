import java.util.Scanner;
class methodsParameters{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el dia de la semana que es: ");
		String dia=sc.nextLine();
		respuesta(dia);
	}	
	public static void respuesta(String dia){
		if(dia.equals("sabado") || dia.equals("domingo")){
			System.out.println("Es fin de semana, es libre de hacer lo que quiera");
		}else
			System.out.println("No es fin de semana, se le recomienda volver temprano.");
	}
}
