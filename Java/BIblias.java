import java.util.Scanner;
public class BIblias
{
    public static void main(String[] args)
    {
        Scanner dato=new Scanner (System.in);
        System.out.println("¿Cuantas biblias vendio en dos semanas?");
        int nbiblias,biblias,estampillas,total,porsem;
        nbiblias=dato.nextInt();
        biblias=nbiblias*250;
        estampillas=nbiblias*15;
        total=biblias+estampillas;
        porsem=biblias/2;
        System.out.println("¿Cuantas biblias vendio Sara? " +nbiblias+ " biblias");
        System.out.println("¿Cuanto gano en total? $ " +total);
        System.out.println("¿Cuanto pago por estampillas? $ " +estampillas);
        System.out.println("Cuanto gano por semana en promedio? $ " +porsem);
        
    }
}
