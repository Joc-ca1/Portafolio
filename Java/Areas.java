import java.util.Scanner;
public class Areas
{
  public static void main (String[] args){ 
      Scanner dato=new Scanner (System.in);
      int area=1,a, b, al, l ; 
      double k, r;
      while (area!=5) {
          System.out.println("1. Area del triangulo");
          System.out.println("2. Area del cuadrado");
          System.out.println("3. Area del circulo");
          System.out.println("4. Area del rectangulo");
          System.out.println("5. Salir");
          System.out.println("Ingrese la opcion que desea hacer");
          area=dato.nextInt();
          switch (area){
              case 1:
              System.out.println("Relizaras la operacion para saber la area de un triangulo");
              System.out.println("Dame la medida de la base del triangulo");
              b=dato.nextInt();
              System.out.println("Dame la altura del triangulo");
              al=dato.nextInt();
              a=b*al/2;
              System.out.println("El area del triangulo es de " +a);
              break;
              case 2:
              System.out.println("Realizaras una operacion para saber la area de un cuadrado");
              System.out.println("Dame la medida de los lados");
              l=dato.nextInt();
              a=l*l;
              System.out.println("El area del cuadrado es de " +a);
              break;
              case 3:
              System.out.println("Realizaras una operacion para saber la area de un circulo");
              System.out.println("Dame el radio del circulo");
              r=dato.nextDouble();
              k=3.14*r*r;
              System.out.println("El area del circulo es de" +k);
              break;
              case 4:
              System.out.println("Realizaras una operacion para saber la area de un rectangulo");
              System.out.println("Dame la medida de la base del rectangulo");
              b=dato.nextInt();
              System.out.println("Dame la altura del rectangulo");
              al=dato.nextInt();
              a=b*al;
              System.out.println("El area del rectangulo es de " +a);
              break;
              case 5:
              System.out.println("Hasta luego, adios");
              break;
              default:
              System.out.println("Opcion no valida");
              
            }
          
        }
      
    }
}
