import java.util.Scanner;
public class compu
{
    public static void main(String[] args)
    {
       Scanner dato=new Scanner (System.in);
        int precio;
        System.out.println("Dame el precio");
        precio=dato.nextInt();
        double descuento;
        descuento= 0.15;
        double ahorro;
        ahorro=precio*descuento;
        double total;
        total=precio-ahorro;
        System.out.println("Precio sin descuento $ " +precio);
        System.out.println("Ahorro $ " +ahorro);
        System.out.println("Total a pagar $ " +total);
    }   
}    
   
   
    

    
        
        
 
    
    
    
    

