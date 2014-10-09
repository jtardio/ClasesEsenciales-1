package Ejercicio6;

import java.io.*;

public class MayorTamaño {
	
	public static void main(String [] arg){
		
		//Objetos para operar con archivos
		File archivo1 = null;
		File archivo2 = null;
		
		//Declaración de enteros para comparar tamaños
	    int tamaño1;
	    int tamaño2;
	    
	    try{
	    	 archivo1 = new File ("registro.txt");
	    	 archivo2 = new File ("registro2.txt");
	         	    	 
	    	 //Transformamos en enteros los tamaños de cada archivo
	    	 tamaño1=(int) archivo1.length();
	    	 tamaño2=(int) archivo2.length();
	    	 
	    	 
	    	 if (tamaño1<=tamaño2){
	    		 System.out.println("El archivo "+archivo2.getName()+" es mayor");
	    	 }else if (tamaño1>=tamaño2){
	    		 System.out.println("El archivo "+archivo1.getName()+" es mayor");
	    	 }
	    	     	
	    }catch(Exception e) {
        	//Excepción que contempla todos los errores posibles
   	     e.printStackTrace();
   	  	}
	}
}
