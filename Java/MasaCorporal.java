import java.util.Scanner;
public class MasaCorporal
{
public static void main(String[] args)
{
    Scanner dato=new Scanner (System.in);
    int peso;
    System.out.println("Proporciona tu peso");
    peso=dato.nextInt();
    int altura;
    System.out.println("Proporciona tu altura");
    altura=dato.nextInt();
    int masa;
    masa=altura*altura/peso;
    System.out.println( +peso+ " kg");
    System.out.println( +altura+ " m");
    System.out.println( "El indice de masa corporal es " +masa); 
  
}
}
