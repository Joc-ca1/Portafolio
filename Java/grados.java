import java.util.Scanner;
public class grados{
    public static void main(String[] args)
    {
        Scanner dato=new Scanner(System.in);
        double celcius,fahrenheit;
        System.out.println("Proporcioname grados °C");
        celcius=dato.nextFloat();
        fahrenheit=(celcius*9/5)+32;
        System.out.println("Grados: "+celcius+"°C");
        System.out.println("Grados: "+fahrenheit+"°F");
    }
}
