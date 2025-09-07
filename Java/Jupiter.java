import java.util.Scanner;
public class Jupiter
{
   public static void main (String[] args)
    {
      Scanner dato=new Scanner (System.in);
      double marte, jupiter,  dias_tardo, dias;
      marte=34900000;
      jupiter=864875457;
      dias=167;
      dias_tardo=jupiter*dias/marte;
      System.out.println("¿Cuantos días tarda Apolo I para ir de la Tierra a Jupiter?" +dias_tardo+ " días");
    }
}
