import java.util.Scanner;
public class CompuSinDesc
{
    public static void main(String[] args)
    {
     Scanner dato=new Scanner (System.in);
     double preciocon,descuento,precio_normal;
     System.out.println("Dame el precio de la computadora con descuento");
     preciocon=dato.nextInt();
     descuento=preciocon*0.15;
     precio_normal=preciocon-descuento;
     System.out.println("Precio sin  descuento $ " +precio_normal);
     System.out.println("Precio con descuento $ " +preciocon);
     System.out.println("El descuento es de $ " +descuento);   
        
    }
}
