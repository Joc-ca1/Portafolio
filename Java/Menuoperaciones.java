import java.util.Scanner;
public class Menuoperaciones
{
    public static void main (String [ ] args) 
    {
        Scanner dato=new Scanner(System.in );
        int op=0, num1, num2, sum, res, mul, div;
        while (op<5){
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Dividir");
            System.out.println("5-Salida");
            System.out.println("Ingresa la opcion que desea hacer");
            op=dato.nextInt();
            if (op==1){
                System.out.println("Realizaras una suma");
                System.out.println("Digita el primer numero");
                num1=dato.nextInt(); 
                System.out.println("Digita el segundo numero");
                num2=dato.nextInt();
                sum=num1+num2;
                System.out.println("La suma es " +num1+ "+" +num2+ "="+sum);
            }
            if(op==2){
                System.out.println("Realizaras una resta");
                System.out.println("Digita el primer numero");
                num1=dato.nextInt();
                System.out.println("Digita el segundo numero");
                num2=dato.nextInt();
                res=num1-num2;
                System.out.println("La resta es " +num1+"-"+num2+"="+res);
            }
            if(op==3){
                System.out.println("Realizaras una multiplicacion");
                System.out.println("Digita el primer numero");
                num1=dato.nextInt();
                System.out.println("Digita el segundo nuemero");
                num2=dato.nextInt();
                mul=num1*num2;
                System.out.println("La multiplicacion es "+num1+"*"+num2+"="+mul);           
            }
            if(op==4){
            System.out.println("Realizaras una division");
            System.out.println("Digita el primer numero");
            num1=dato.nextInt();
            System.out.println("Digita el segundo numero");
            num2=dato.nextInt();
            div=num1/num2;
            System.out.println("La division es " +num1+ "/" +num2+"=" +div);
            }
            if(op==5){
            System.out.println("Hasta luego, adios");
            }
        }
      }
  }

