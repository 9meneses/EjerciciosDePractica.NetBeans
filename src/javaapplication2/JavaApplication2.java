/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author xp
 */
public class JavaApplication2 {

    public void ejemploString() {
        String cadena1 = "Acaso hubo buhos aca";

        System.out.println(cadena1.charAt(7));
        System.out.println(cadena1.charAt(0));
        System.out.println(cadena1.charAt(cadena1.length() - 1));

        System.out.println(cadena1.substring(6, 9));
        System.out.println(cadena1.substring(11, 16));

        String[] arrayPalbras = cadena1.split(" ");

        System.out.println(arrayPalbras[2]);

    }

    public void ejemplo2String() {
        String cadena2 = "ligar es ser ágil";
        cadena2 = cadena2.replace(" ", ""); //tenemos la cadena 2 sin espacios, en la que posteriormente tenemos que crear otra cadena
        // igual que la cadena 2 pero dada la vuelta, para poder hacer la comparación

        cadena2 = cadena2.replace("á", "a");
        cadena2 = cadena2.replace("ú", "u"); 
        cadena2 = cadena2.replace("í", "i");
        cadena2 = cadena2.replace("ó", "o");
        

        StringBuffer cadena21 = new StringBuffer(cadena2); //metodo para poder modificar el string de la cadena 2 y darla la vuelta mas adelante
        cadena21 = cadena21.reverse(); //tenemos aqui la cadena 2, llamada como cadena 21 dada la vuelta  

        if (cadena2.equalsIgnoreCase(cadena21.toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public boolean isograma(String palabra) { // no se tiene que repetir ninguna letra
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = i + 1; j < palabra.length(); j++) { //sumo una poscion respecto de la i ya que me compararia la misma letra sobre 
                //la misma letra 
                if (palabra.charAt(i) == (palabra.charAt(j))) { //compara la poscion de i con la posicion de la j  
                    return false;

                }

            }
        }
        return true;

    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication2 ejercicio1 = new JavaApplication2();
        String palabra = "hola"; //declaro la palabra para comprobar el resultado del ejercicio
        System.out.println(ejercicio1.isograma(palabra)); 
        //ejercicio1.ejemplo2String();
        
    }

}
