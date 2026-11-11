import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){

Scanner escaner=new Scanner(System.in);


System.out.println("Introduce el nombre de tu personaje");
String nombre= escaner.nextLine();
System.out.println("===================================");
Personaje miPersonaje1=new Personaje(nombre);
miPersonaje1.mostrarFicha();
        escaner.close();


    }
}
