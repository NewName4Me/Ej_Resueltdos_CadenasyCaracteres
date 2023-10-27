package Caracteres;
import java.util.Scanner;

public class C3_CharRepetido {
    public static void main(String[]args){
        /*
        Un programa donde introduzcamos cualquier texto, luego 
        introducimos un caracter y nos dice cuantas veces aparece 
        dicho caracter
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String texto;
        char letra;//letra que queremos revisar
        int longTexto;
        int cuantas=0;
        char letraTexto;//para revisar todas las letras y compararlo con letra para ver si se repite
        
        //programa
        System.out.println("Dime lo que quieras");
        texto=scanner.nextLine();
        longTexto=texto.length();
        
        System.out.println("Dame el caracter para revisar");
        letra=scanner.next().charAt(0);//obtienes un caracter de 1 de longitud

        for (int i=0;i<longTexto;i++){//revisar e todos los caracteres de texto hasta que no queden más
            letraTexto=texto.charAt(i);
            if(letra==letraTexto){
                cuantas++;
            }
        }
        System.out.println("La letra '"+letra+"' se repite en tu texto "+cuantas+" veces");
    }
}
