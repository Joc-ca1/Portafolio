import java.util.Scanner;
import java.util.Random;
public class Vector{
    public static void main (String args[]){
        Scanner dato=new Scanner (System.in);
        Random po = new Random();
        String nombre;
        int alea1=0, alea2=0, alea3=0;
        //Declaramos y creamos un vector
        String alumnos[]=new String[5];
        int cal1[]=new int[5];
        int cal2[]=new int[5];
        int cal3[]=new int[5];
        int prom[]=new int[5];
        //llenado de vecto
        for (int x=0;x<=4;x++){
            System.out.println("Dame tu nombre");
            nombre=dato.nextLine();
            alumnos[x]=nombre;
            alea1=(int)(po.nextDouble()*100)+1;
            cal1[x]=alea1;
            alea2=(int)(po.nextDouble()*100)+1;
            cal2[x]=alea2;
            alea3=(int)(po.nextDouble()*100)+1;
            cal3[x]=alea3;
            prom[x]=(cal1[x]+cal2[x]+cal3[x])/3;
        }
        System.out.println("********************");
        for (int y=0; y<=4; y++){
            System.out.println("Tu nombre es:" +alumnos[y]);
            System.out.println("Calificacion I: " +cal1[y] );
            System.out.println("Calificacion II: " +cal2[y]);
            System.out.println("Calificacion III: " +cal3 [y]);
            System.out.println("Promedio es: " +prom[y]);
            System.out.println("******************************");
        }
    }
}
