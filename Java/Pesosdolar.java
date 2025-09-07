import java.util.Scanner;
public class Pesosdolar
{
  public static void main(String[] args)
    {
      Scanner dato=new Scanner (System.in);
      double pesos,dolar,total;
      System.out.println("Proporcionar la cantidad de pesos");
      pesos=dato.nextDouble();
      dolar= 20.23;     
      total=pesos*dolar;
      System.out.println("US $ " +total); 
      System.out.println("MX $ " +pesos);
    }
}
