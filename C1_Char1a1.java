package Caracteres;
import java.util.Scanner;

public class C1_Char1a1 {
    public static void main(String[]args){
        /*
        dame un texto y te muestro los caracteres uno a uno
        ej:
        inset="hola"
        salida= h
                o
                l
                a
        */
        Scanner scanner =new Scanner(System.in);
        
        //variables
        String texto;
        int longTexto;
        char letra;
        
        
        //programa
        System.out.println("Dime un texto y te lo divido en caracteres");
        texto=scanner.nextLine();//es importante poner Line, si no cuando metamos un espacio deja de leer
        longTexto=texto.length();
        
        for (int i=0;i<longTexto;i++){//revisar e imprimir todos los caracteres de texto hasta que no queden más
            letra=texto.charAt(i);
            System.out.println(letra);
        }
    }
}
