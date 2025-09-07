import java.util.Scanner;
public class añosvida{
public static void main (String[] args)
    {
      Scanner dato=new Scanner (System.in);
      int edad,dias,hrs,totalhrs;
      System.out.println("¿Que edad tienes?");
      edad=dato.nextInt();
      dias=edad*365;
      hrs=8*365;
      totalhrs=hrs*edad;      
      System.out.println("Edad: " +edad);
      System.out.println("Dias vividos: "+dias);
      System.out.println("Has dormido: "+totalhrs);
    }
}
