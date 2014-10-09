package Ejercicio4;

import java.io.*;
import java.util.Date;

import Ejercicios123.BigNumberException;

public class LeeNumCaracteresMain {
	
	public static void main(String [] arg){
		File archivo = null;
		FileReader fr = null;
	    BufferedReader br = null;
	    FileWriter fichero = null;
	    
	    PrintWriter pw = null;
	      
	      
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una de una línea de más de un caracter.
	         archivo = new File ("registro.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero y numero de caracteres
	         String linea;
	         while((linea=br.readLine())!=null){
	        	 System.out.println(linea.length());
	    	 
	         }
	         
	         fichero=new FileWriter("registro.txt"); 
	         Date fecha = new Date (); //Obtiene fecha del sistema
	         
	         
	         pw=new PrintWriter(fichero,true);
	         pw.println("Fecha: "+fecha.toString()+ " tamaño "+archivo.length()+ "y nombre "+archivo.getName());
	         
	         
	    	 
	        
	      }catch(Exception e) {
	        	//Excepción que contempla todo el resto de posibles errores de E/S posibles
	    	     e.printStackTrace();
	    	  }finally{
	          // Cierre de fichero
	          try{                    
	             if( null != fr ){   
	                fr.close();     
	             }          
	             if (null != fichero)
	                 fichero.close();
	             
	          }catch (Exception e2){ 
	             e2.printStackTrace();
	          }
	       
	      
	}

	}
}
