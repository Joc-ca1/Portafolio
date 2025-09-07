import java.util.Random;
import java.util.Scanner;
public class Vendedores2
{
    public static void main (String [ ] args) 
    {  
     Scanner dato=new Scanner (System.in);
     Scanner entrada=new Scanner (System.in);
     Random r1 = new Random();
     String nom;
     int n=1,k=0,alea1=0, alea2=0, alea3=0, alea4=0, alea5=0, alea6=0, ventas, acum=0;
     System.out.println("¿Cuantos vendedores quiere regristrar?");
     k=dato.nextInt();
     while (n<=k){
     System.out.println("Dame tu nombre");
     nom=entrada.nextLine();
     alea1= (int) (r1.nextDouble()*100)+1;
     System.out.println("Ventas primer bimestre $"+alea1);
     alea2= (int) (r1.nextDouble()*100);
     System.out.println("Ventas segundo bimestre $"+alea2);
     alea3= (int) (r1.nextDouble()*100);
     System.out.println("Ventas tercer bimestre $"+alea3);
     alea4= (int) (r1.nextDouble()*100);
     System.out.println("Ventas cuarto bimestre $"+alea4);
     alea5= (int) (r1.nextDouble()*100);
     System.out.println("Ventas quinto bimestre $"+alea5);
     alea6= (int) (r1.nextDouble()*100);
     System.out.println("Ventas sexto bimestre $" +alea6);
     ventas=alea1+alea2+alea3+alea4+alea5+alea6;
     acum=acum+ventas;
     System.out.println(nom+ " vendio $ " +ventas);
     n++;
    }
     System.out.println("Total que venderieron entre todos $" +acum);
 }
}

   
