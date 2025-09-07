import java.util.Scanner;
public class Area
{
  public static void main (String[] args)
  {
    Scanner dato=new Scanner (System.in);
    System.out.println("Proporcioname el valor del radio del circulo");
    int radio;
    radio=dato.nextInt();
    double area;
    area=radio*radio*3.1416;
    System.out.println("El valor del radio es: " +radio);
    System.out.println("El valor del area es: " +area);    
  }  
}
