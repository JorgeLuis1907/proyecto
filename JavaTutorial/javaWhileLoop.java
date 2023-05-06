class whileLoop{
	public static void main(String [] args){
		int numero=0;;
		int numero1=1;
		int numero2=2;
		while(numero<50){
			System.out.println(numero);
			numero=numero1+numero2;
			numero1=numero2;
			numero2=numero;
		}
		
		int edad=6;	
		do{
			System.out.println("Sigue en el colegio con "+edad);
			edad++;
		}while(edad<16);
			System.out.println("Ya salio del colegio con "+edad);

	}
}
