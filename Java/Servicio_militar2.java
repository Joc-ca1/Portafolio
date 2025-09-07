import java.util.Scanner;
public class Servicio_militar2
{
    public static void main (String[ ] args)
    {
        Scanner num=new Scanner (System.in);
        Scanner entrada=new Scanner (System.in);
        String nombre,gen, genero;
        int t,edad,mujer,años, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        System.out.println("¿Cuantas persona quiere ingresar?");
        t=num.nextInt();
        for(int x=1; x<=t; x++) {
        System.out.println("Dame tu nombre");
        nombre=entrada.nextLine();
        System.out.println("Dame tu edad");
        edad=num.nextInt();
        System.out.println("Ingresa tu sexo hombre o mujer");
        gen=entrada.nextLine();
        genero=gen.toLowerCase();
        if (genero.equals("mujer")){
            System.out.println("Tu genero es " +gen+ " no puedes hacer servicio por ser mujer");          
            cont1++;
         }
        if (genero.equals("hombre")){    
        if (edad>=18){
          System.out.println(nombre+" Te tocara hace servicio militar");
         cont2++;
         cont3++;
        }
        else{
            años=18-edad;
          System.out.println ("No puedes hacer el servicio ya que te faltan "+años+ " años " +nombre);
          cont4++;
          cont5++;
        }        
    }
   }
   System.out.println(+cont2+ " Personas que haran el servicio militar");
   System.out.println(+cont4+ " Personas que no haran el servicio militar");
   System.out.println(+cont1+ " Mujeres ingresadas");
   System.out.println(+cont3+ " Hombres ingresados");
   System.out.println(+cont5+ " Menores de edad ingresados");
  }
}
