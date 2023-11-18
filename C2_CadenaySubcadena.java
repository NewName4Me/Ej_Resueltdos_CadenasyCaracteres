package Tarea5;
import java.util.*;

public class C2_CadenaySubcadena {
    public static void main(String[]args){
        /*
        programa donde introducimos una cada, y una target y comprobamos si esa cadena empieza por ese tarrget
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String text;
        char target;
        
        //Programa
        System.out.println("Dame tu cadena");
        text=scanner.nextLine();
        System.out.println("Dame tu caracter");
        target=scanner.next().charAt(0);
        
        if(text.charAt(0)==target){
            System.out.println("Tu cadena comienza por el caracter introducido");
        }
        else{
            System.out.println("Tu cadena no comienza por el caracter introducido, si no por: "+text.charAt(0));
        }

    }
}
