import java.util.Scanner;
public class Vendedores
{
    public static void main (String [ ] args)
    {
     Scanner dato=new Scanner (System.in);
     Scanner salida=new Scanner(System.in);
     String nom;
     int bim1, bim2, bim3, bim4, bim5, bim6, n=1, cont=0, ventas, acom=0, k=0;
     System.out.println("¿Cuantos vendedores quiere regristrar?");
     k=dato.nextInt();
     while (n<=k){
         System.out.println("Dame tu nombre");
         nom=salida.nextLine();
         System.out.println("Dame cuanto vendiste en el primer bimestre");
         bim1=dato.nextInt();
         System.out.println("Dame cuanto vendiste en el segundo bimestre");
         bim2=dato.nextInt();
         System.out.println("Dame cuanto vendiste en el tercer bimestre");
         bim3=dato.nextInt();
         System.out.println("Dame cuanto vendiste en el cuarto bimestre");
         bim4=dato.nextInt();
         System.out.println("Dame cuanto vendiste en el quinto bimestre");
         bim5=dato.nextInt();
         System.out.println("Dame cuanto vendiste en el sexto bimestre");
         bim6=dato.nextInt();
         ventas=bim1+bim2+bim3+bim3+bim4+bim5+bim6;
         acom=acom+ventas;
         System.out.println( nom+ " tus ventas totales son $ " +ventas);
         n++;
        }
        System.out.println("Â¿Cuanto venderieron entre todos? " +acom);
    }
}