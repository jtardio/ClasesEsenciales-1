package Ejercicio5;

import java.io.*;
import java.util.Date;


public class AbreImagen {
	
	public static void main(String [] arg){
		
		//Variables para imagen
		File archivo = null;
		FileInputStream fr = null;
	    BufferedInputStream br = null;
	    
	    //Variables para archivo de texto
	    FileWriter fichero = null;
	    
	    PrintWriter pw = null;
	    
	    try {
	    	//objeto imagen
	         archivo = new File ("C:\\imagen.jpg");
	        	         
	         //objeto del fichero de texto y objeto para escribir en este fichero
	         fichero=new FileWriter("registro2.txt");
	         pw=new PrintWriter(fichero,true);
	         
	         
	         // Lectura de imagen y muestra tamaño
	         System.out.println("El tamaño de la imagen es "+archivo.length()+ " bytes. Actualizado archivo registro2.txt");
	         pw.println("El tamaño de la imagen es "+archivo.length()+ " bytes");
	         
	         
	        
	      }catch(Exception e) {
	        	//Excepción que contempla todo el resto de posibles errores de E/S posibles
	    	     e.printStackTrace();
	    	  }finally{
	          // Cierre de fichero
	          try{                    
	           
	             if (null != fichero)
	                 fichero.close();
	            	             
	          }catch (Exception e2){ 
	             e2.printStackTrace();
	          }
	       
	      
	}

	}


}
