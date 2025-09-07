import java.util.Scanner;
public class Terreno
{
    public static void main (String[] args)
    {
       Scanner dato=new Scanner (System.in);
       System.out.println("¿Cuanto mide el terreno de ancho?");
       double ancho, largo, total, alambre, metrosporvuelta, IVA, totalIVA;
       ancho=dato.nextDouble();
       System.out.println("¿Cuanto mide el terreno de largo?");
       largo=dato.nextDouble();
       alambre=(ancho*2+largo*2)*3;
       metrosporvuelta=alambre/3;
       total=alambre*135;
       IVA=0.16;
       totalIVA=total*IVA;  
       System.out.println("Las medidas del terreno son: " +ancho+ " m " +largo+ " m");       
       System.out.println("Los metros necesariosn de alambre son: " +alambre+ " m");       
       System.out.println("¿Cuantos metros se requieren por vuelta? " +metrosporvuelta+ " m");
       System.out.println("Total a pagar por el alambre sin IVA es de $ " +total);
       System.out.println("¿Cuanto IVA es a pagar? " +IVA);
       System.out.println("Tota neto a pagar con IVA es de $ " +totalIVA);
       
       
    }
    
}
