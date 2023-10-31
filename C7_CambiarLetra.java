package Caracteres;
import java.util.Scanner;

public class C7_CambiarLetra {
    public static void main(String[]args){
        /*
        Un programa donde introduces una cadena
        Luego indicas que caracter de esa cadena quieres reeemplazar y por cual
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String texto;
        char char1;//caracter contenido en el texto
        char char2;//caracter reemplazador
        String textoFinal;
        
        //programa
        System.out.println("Inserte una palabra");
        texto=scanner.nextLine();
        
        System.out.println("Indique que caracteres de su frase anterior quiere reemplazar");
        char1=scanner.next().charAt(0);
        
        System.out.println("Inserte el caracter por el cual lo quiere reemplazar");
        char2=scanner.next().charAt(0);
        
        textoFinal=texto.replace(char1, char2);//se intercambian las letras
        System.out.print("Texto reemplazado: "+textoFinal);
        

    }
}
