package Ejercicio7;

import java.io.*;

public class DatoMain {
	
	public static void main(String [] arg) throws ClassNotFoundException{
		
		Dato persona1 = new Dato (29,"Jesus",'V');
		Dato e = null;
				
	    
	    try {
	    	
	    	FileOutputStream fileOut = new FileOutputStream("persona1.ser");
	    	ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    	out.writeObject(persona1);
	    	fileOut.close();
	    	
	    	
	    	System.out.println("Actualizado fichero persona1.ser en workspace");
	    	
	    	FileInputStream fileIn = new FileInputStream("persona1.ser");
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        e = (Dato) in.readObject();
	        in.close();
	        fileIn.close();
	    
	    
	    
	    
	    }catch(Exception i) {
	    
        	//Excepción que contempla todo el resto de posibles errores de E/S posibles
   	     i.printStackTrace();
   	     
   	  }
	    System.out.println("Edad: " + e.edad);
	    System.out.println("Nombre: " + e.nombre);
	    System.out.println("Sexo: " + e.sexo);
	  }

}

