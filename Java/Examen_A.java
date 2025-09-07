import java.util.Scanner;
public class Examen_A
{
    public static void main (String [] args){
   Scanner dato=new Scanner (System.in);
   int x=1, opc=0, cont=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
   System.out.println("Solicitud de baja de materias");
   while (opc!=8){
       System.out.println("Menu de opciones");
       System.out.println("***************************************");
       System.out.println("1- Algoritomos y fundamentos de programacion");
       System.out.println("2- Investigacion de operaciones");
       System.out.println("3- Fisica");
       System.out.println("4- Seguridad e higiene industrial");
       System.out.println("5- Estudio del trabajo II");
       System.out.println("6- Procesos de fabicacion");
       System.out.println("7- Estadistica inferencial II");
       System.out.println("8- Salir");
       System.out.println("*************************************");
       System.out.println("¿Que materia quieres dar de baja?");
       opc=dato.nextInt();
       switch (opc){
           case 1:
           System.out.println("La baja de la materia de algoritmos y fundamenos de programacion fue correcta");
           cont++;
           cont1++;
           break;
           case 2:
           System.out.println("La baja de la materia de investigacion de operaciones fue correcta");
           cont++;
           cont2++;
           break;
           case 3:
           System.out.println("La baja de la materia de fisica fue correcta");
           cont++;
           cont3++;
           break;
           case 4:
           System.out.println("La baja de la materia de seguridad e higiene industrial fue correcta");
           cont++;
           cont4++;
           break;
           case 5:
           System.out.println("La baja de la materia de estudio del trabajo II fue correcta");
           cont++;
           cont5++;
           break;
           case 6:
           System.out.println("La baja de la materia de procesos de fabricacion fue correcta");
           cont++;
           cont6++;
           break;
           case 7:
           System.out.println("La baja de la materia de estadistica indiferencial II fue correcta ");
           cont++;
           cont7++;
           break;
           case 8: 
           System.out.println("Hasta luego, adios");
           break;
           default:
           System.out.println("Opcion no valida");
           break;
        }     
    }
    System.out.println("Total de alumnos que soliciaron su baja: " +cont);
    System.out.println("Alumnos de baja por materia:");
    System.out.println("Total de alumnos en algoritmos y fundamentos: " +cont1);
    System.out.println("Total de alumnos en investigacion de operaciones: " +cont2);
    System.out.println("Total de alumnos en fisica: "+cont3);
    System.out.println("Total de alumnos en seguridad e higiene: "+cont4);
    System.out.println("Total de alumnos en estudo del trabajo II: " +cont5);
    System.out.println("Total de alumnos en procesos de fabricacion: " +cont6);
    System.out.println("Total de laumnos en estadisticas indefernecial II: "+cont7);
  }
}
