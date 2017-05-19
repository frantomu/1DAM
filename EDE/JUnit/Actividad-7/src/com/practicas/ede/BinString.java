//Paco Torres - Primer cambio

package com.practicas.ede;

// �Qu� puede hacer esta Clase?
//Convierte un String a binario pasando por su valor ASCII
public class BinString {
	public BinString(){}

	// �Qu� hace este m�todo?
	//Se le pasa un String y devuelve el valor en binario de su valor ASCII
	public static String convertir(String s){
		return aBinario(sumar(s));
	}
	
	// �Qu� hace este m�todo?
	//Suma los valores ASCII de los caracteres del String que se pasa por par�metro
	public static int sumar(String s){
		String s1 = s.substring(0);
		int sum = 0;
		while(!s1.equals(""))
		{
			sum = sum+(int)(s1.charAt(0));
			s1 = s1.substring(1);
		}
		
		return sum;
	}
	
	// �Qu� hace este m�todo?
	//Pasa el valor ASCII anterior a binario
	public static String aBinario(int n){
	    String s = "";
	    
	    while (n > 0)
	    {
	    	if(n%2==0)
	    		s = "0"+s;
	    	else
	    		s = "1"+s;
	        n = n / 2;
	    }
	    
	    return s;
	}
	
	public static void main(String[] args){
		System.out.println(convertir("Hola"));
		String s="Hola";
		System.out.println(s.substring(2));
		System.out.println(sumar("H"));
	}
}
