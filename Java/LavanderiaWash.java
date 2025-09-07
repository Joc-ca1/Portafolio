import java.util.Scanner;
public class LavanderiaWash
{
 public static void main (String [ ] args) 
    {
        Scanner dato=new Scanner(System.in );
        int opc=0,paga=0,agua, jabon=0, cont=0, cont2=0, a, p;
        while (opc<30){
        System.out.println("------------------------------");
        System.out.println( "Lavanderia Wash");
        System.out.println("1. Mayor a 30k no funciona");
        System.out.println("2. De 22k o mas nivel maximo");
        System.out.println("3. De 15k a 21k nivel alto");
        System.out.println("4. Menos 15k nivel medio");
        System.out.println("5. Salir");
        System.out.println("Segun el peso de la ropa que opcion deseas usar");
        opc=dato.nextInt();
        System.out.println("----------------------------------------");
        switch (opc){
            case 1:
            System.out.println("No funciona tiene mucho peso");
            break;
            case 2:
            System.out.println("Dame los kilos de ropa que vas a lavar");
            opc=dato.nextInt();
            System.out.println("Lavanderia Wash");
            paga=opc*32;
            System.out.println("Lavaras un total de "+opc+ " k");
            System.out.println("Nivel maximo");
            agua=opc*4;
            System.out.println("Usaras de agua " +agua+ "L");
            jabon=opc*100;
            System.out.println("Jabon utilizado es de:" +jabon+ "g");
            System.out.println("Pagaras un total de " +paga);
            break;
            case 3:
            System.out.println("Dame los kilos de ropa que vas a lavar");
            opc=dato.nextInt();
            System.out.println("Lavanderia Wash");
            paga=opc*32;
            System.out.println("Lavaras un total de "+opc+ " k");
            System.out.println("Nivel alto");
            agua=opc*4;
            System.out.println("Usaras de agua " +agua+ "L");
            jabon=opc*100;
            System.out.println("Jabon utilizado es de:" +jabon+ "g");
            System.out.println("Pagaras un total de " +paga);
            break;
            case 4:
            System.out.println("Dame los kilos de ropa que vas a lavar");
            opc=dato.nextInt();
            System.out.println("Lavanderia Wash");
            paga=opc*32;
            System.out.println("Lavaras un total de "+opc+ " k");
            System.out.println("Nivel minimo");
            agua=opc*4;
            System.out.println("Usaras de agua " +agua+ "L");
            jabon=opc*100;
            System.out.println("Jabon utilizado es de:" +jabon+ "g");
            System.out.println("Pagaras un total de " +paga);
            break;
        }
        cont++;
     }
     System.out.println("Total de personas atendidas " +cont);
     a=jabon*cont;
     System.out.println("Total de jabon que se utilizo "  +a);
     p=paga+cont;
     System.out.println("Total ganado" +p);
  }
}