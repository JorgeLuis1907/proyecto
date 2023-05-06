class ifElse{
	public static void main(String [] args){
		
		int edad1=19;
		if(edad1>=18){
			System.out.println("Edad1 es mayor de edad");
		}else{
			System.out.println("Edad1 no es mayor de edad");
		}
		
		int edad2=16;
		String resultado=(edad2>=18)?"Edad2 si es mayor de edad":"Edad2 no es mayor de edad";
		System.out.println(resultado);


	}
}
