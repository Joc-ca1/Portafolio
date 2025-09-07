import java.util.Scanner;
public class Servicio_militar
{
   public static void main (String[ ] args)
    {
      Scanner num=new Scanner (System.in);
      Scanner entrada=new Scanner (System.in);
      System.out.println("Estamos haciendo un ejercicio de for");
      int edad, con=0, sin=0;
      String nombre;
      for(int x=1; x<=5; x++) {
      System.out.println("Dame tu nombre");
      nombre=num.nextLine();
      System.out.println("Dame tu edad");
      edad=entrada.nextInt();
      if (edad>=18){
          System.out.println(nombre+" Hacer servicio militar");
          con++;
      }
      else{
          System.out.println ("te savaste " +nombre);
          sin++;
        }
      }
   System.out.println ("Total que haran servicio " +con);
   System.out.println ("Total que no haran el ervicio " +sin);
 }
}
