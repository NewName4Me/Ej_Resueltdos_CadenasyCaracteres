package Tarea5;
import java.util.Scanner;

public class C5_Mayuscula {
    public static void main(String[]args){
        /*
        un programa donde nos introducen una cadena con nombre y apellidos
        todo en minuscula, y tenemos que poner las inicales en mayuscula
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String text;
        char check;//mira lso caracteres uno a uno y detecta los espacios
        String salida="";
        boolean upper=true;//comprueba cuando poner mayuculas, empiza en true para la primera mayuscula
        
        //programa
        System.out.println("Dime tu nombre y apellidos en minuscula");
        text=scanner.nextLine();
        
        for(int i=0;i<text.length();i++){//chequeamos cada carater de nuestro texto       
            check=text.charAt(i);
            
            if(upper==true){//cada vez que haya un espacio esto se activa y cambia check a mayuscula
                check=Character.toUpperCase(check);
                upper=false;
            }
            if(check==' '){//detectamos el espacio entre nombre y apellidos y cuando haya espacio entra al if anterior
                upper=true;
            }
            salida=salida+check;
        }
        
        //salida
        System.out.println("Tu nombre con mayúscula es: "+salida);
    }
}
