package Caracteres;
import java.util.Scanner;

public class C4_Contador_De_Espacios {
    public static void main(String[]args){
        /*
        Ejercicio que nos cuente los espacios que hay en un texto
        Dos formas de resolverlo, un contador que cuando String texto=" " se sume uno
        O quitarle al texto los espacios, mirar la longitud de ambos y calcular la diferencia
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String texto;
        int longitud;//para mirar todos los caracteres sin excepción
        char char1;
        int cont=0;//contador de espacios
        String textoTrim;
        
        //programa
        System.out.println("Inserte un texto y le digo cuántos espacios tiene");
        texto=scanner.nextLine();
        textoTrim=texto.trim();//se asegura de no contar los espacios al principio o final de la oración
        longitud=textoTrim.length();
        
        for(int i=0;i<longitud;i++){//comprueba cada caracter de nuestro texto uno a uno
            char1=textoTrim.charAt(i);
            if (char1==' '){
                cont++;
            }
        }
        System.out.println(cont);

    }
}
