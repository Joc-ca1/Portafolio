import java.util.Scanner;
public class Materias
{
 public static void main(String[] args)
 {
     Scanner dato=new Scanner (System.in);
     String nombre;
     System.out.println("¿Cual es tu nombre?");
     nombre=dato.nextLine();
     int materia1;
     System.out.println("Pedir calificacion final de materia 1");
     materia1=dato.nextInt();
     int materia2;
     System.out.println("Pedir calificacion final de materia 2");
     materia2=dato.nextInt();
     int materia3;
     System.out.println("Pedir calificacion final de materia 3");
     materia3=dato.nextInt();
     int Calfinal; 
     Calfinal=(materia1+materia2+materia3)/3;
     System.out.println("El alumno es: " +nombre);
     System.out.println("Calificacion 1 es: " +materia1);
     System.out.println("Calificacion 2 es: " +materia2);
     System.out.println("Calificacion 3 es: " +materia3);
     System.out.println("Calificacion final es: "+Calfinal); 
 }
}
