package Ejercicios123;

import java.io.*;

class LeeFichero {
   public static void main(String [] arg){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una de una línea de más de un caracter.
         archivo = new File ("C:\\archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
         String[] partes = linea.split(" ");
    	 
         	for( int i=0; i<=partes.length-1; i++){
         		int num = Integer.parseInt(partes[i]);
         		if (num>=1000){
         			System.out.println("El valor "+ partes[i] +" es mayor que 1000");
         			throw new BigNumberException("Valor superior a 1000");
         		}
    	 }
    	 System.out.println(linea);
    	 
        
      }
      }catch(FileNotFoundException e){
    	  //Excepción que contempla que el archivo no exista
         e.printStackTrace();
      } 
      catch(EOFException e) {
    	  	//Excepción que contempla que se acabe el fichero
    	    e.printStackTrace();
      }catch(IOException e) {
    	//Excepción que contempla todo el resto de posibles errores de E/S posibles
 	     e.printStackTrace();
 	  }
      catch(Exception e) {
      	//Excepción que contempla todo el resto de posibles errores de E/S posibles
   	     e.printStackTrace();
   	  }finally{
         // Cierre de fichero
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   
   }
   }
