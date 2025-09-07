import java.util.Scanner;
public class Bicicleta
{
   public static void main(String[] args) 
   {
     Scanner dato=new Scanner (System.in);
     int precio;
     System.out.println("Dame el precio de la bicicleta");
     precio=dato.nextInt();
     double descuento;
     descuento=0.05;
     double IVA;
     IVA=0.16;
     double preciocondescuento;
     preciocondescuento=descuento*precio;
     double ahorro;
     ahorro=preciocondescuento-precio;
     double coniva;
     coniva=IVA*ahorro;
     double total;
     total=ahorro+coniva;
     System.out.println("Nombre del cleinte: Juan");
     System.out.println("El precio normal es $ " +precio);
     System.out.println("El descuento es $ " +preciocondescuento);
     System.out.println("El IVA es $ " +coniva);
     System.out.println("Total a pagar es $" +total); 
    }
}
