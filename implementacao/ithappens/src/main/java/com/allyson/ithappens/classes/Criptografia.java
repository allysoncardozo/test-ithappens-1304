package com.allyson.ithappens.classes;


public class Criptografia {

	public static String Criptografar(String termo) {
		
		try {
			Integer Indice = 0;
	        String chaveCriptografia = "$@%\"¦Îl}æy~|ßpÎæX+{?ÉÄÖg«;æiÅo\"ls^><;\"¦Îl}æy~|ßpÎæX+{?ÉÄÖg«;æiÅo\"?|%¨*#$)(@$\"¦Îl}æy~|ßpÎæX+{?ÉÄÖg«;æiÅo\"@%ls^><;?|%¨*#$)(@";
	        char[] arr = termo.toCharArray();
	        char[] arrC = chaveCriptografia.toCharArray(); 
	        String saida = "";

	        	        	
	       for (int i = 0; i < termo.length(); i++) {
	           Character a = arrC[i];		            		            
		       saida += a.toString();			        
			}
	      return saida;
		}
		catch (Exception e){
	    	  return termo;
		}
	}
}
