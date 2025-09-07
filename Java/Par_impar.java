import java.util.Scanner;
public class Par_impar
{
   public static void main (String [ ]args)
   {
   Scanner dato=new Scanner(System.in);
   int num, x, num_poi, cont1=0, cont2=0, cont3=0, cont4=0;
      for (x=1;x<=8; x++)
    {
        System.out.println("Dame un numero");
        num=dato.nextInt();
        if (num>0)
        {
            System.out.println("El numero es positivo");
            cont1++;
        }
        else 
        { 
          System.out.println("El numero es negativo");  
          cont2++;
        }
        num_poi=num%=2;
        if (num_poi==0)
        {
            System.out.println("El numero es par");
            cont3++;
        }
        else
        {
            System.out.println("El numero es impar");
            cont4++;
        }
    }
    System.out.println( +cont1+ " Son numeros positicos");
    System.out.println( +cont2+ " Son numeros negarivos");
    System.out.println( +cont3+ " Son numeros pares");
    System.out.println( +cont4+ " Son numero impares");    
 }
}
