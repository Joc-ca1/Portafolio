import java.util.Scanner;
public class Multiplicaciones
{
  public static void main (String[] args) {
     Scanner dato=new Scanner (System.in);
     Scanner dat=new Scanner (System.in);
     String op="", opcion="";
     int res,a, con=0;
     System.out.println("¿Quiere ingresar alguna tabla de multiplicar ");
     op=dato.nextLine();
     opcion=op.toLowerCase();
    if (opcion.equals("no")){
         System.out.println("Se registraron" +con+ " tablas");
        }
     while (opcion.equals("si")){
         if (opcion.equals("si")){
       System.out.println("¿Que tabla deseas hacer?");
       a=dat.nextInt();
        for (int x=1; x<=10; x++){
             res=x*a;
             System.out.println(x+" * " +a+ " = " +res);
       }
       con++;
    } 
    System.out.println("¿Quiere ingresar alguna tabla de multiplicar ");
     op=dato.nextLine();
     opcion=op.toLowerCase();
    if (opcion.equals("no")){
         System.out.println("Se registraron " +con+ " tablas");
        }
  }
 }  
}