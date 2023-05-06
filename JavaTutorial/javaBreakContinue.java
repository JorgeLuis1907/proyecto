import java.util.Scanner;
class breakContinue{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese 5 nombres:");
		String [] listaNombres = new String[5];
		for(int i=0;i<5;i++){
			listaNombres[i]=sc.next();
		}
		System.out.println("Ingrese sus edades correspondientes" );
		int [] listaEdades = new int[5];
		for(int j=0;j<5;j++){
			listaEdades[j]=sc.nextInt();
		}
		System.out.println("Aqui esta la lista de mayores de edad");
		for(int a=0;a<5;a++){
			if(listaEdades[a]<18)
				continue;
			System.out.println(listaNombres[a]);
		}
		for(int a=0;a<5;a++){
			if(listaEdades[a]>=18){
				System.out.println("Se encontro al primer mayor de edad: "+listaNombres[a]);
				break;
			}
		}
	}
}
