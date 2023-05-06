class string{
	public static void main(String[]args){
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("El tamaño del string txt es: " + txt.length());
		txt = "Hola Mundo";
		System.out.println(txt.toUpperCase());//Escribe a txt en letras mayusculas
		System.out.println(txt.toLowerCase());//Escribe a txt en letras minusculas
		System.out.println(txt.indexOf("Mundo"));//Encuentra World y da su posicion
		String txt2=" Mi primer programa";
		System.out.println(txt+" , "+txt2);//Concatena y le añade la coma
		System.out.println(txt.concat(txt2));//Concatena sin dar espacio
		
		int numero=10;
		String letra="10";
		System.out.println(numero+letra);//Tener cuidado con la concatenacion de numeros con strings
		
		System.out.println("Aqui estan algunos caracteres especiales: \\n ->Salto de linea \n \\r->Salto de linea \n \\t->equivalente a un tab \n \\b->Ignora el siguiente caracter\n \\f->Alimenta el formulario");
	}
}
