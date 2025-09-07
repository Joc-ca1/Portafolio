import java.util.Scanner; 
public class Lavanderia
{
  public static void main (String [] args)
  {
    Scanner dato=new Scanner (System.in);
    int opc=0,paga=0,agua, jabon=0,  cont=0, cont2=0, a, p;
    while (opc<31){
        System.out.println("------------------------------");
        System.out.println("Lavanderia Wash");
        System.out.println("Mayor a 30k no funciona");
        System.out.println("De 22k o mas nivel maximo");
        System.out.println("De 15k a 21k nivel alto");
        System.out.println("Menos 15k nivel medio");
        System.out.println("Dame los kilos de ropa que vas a lavar");
        opc=dato.nextInt();
        System.out.println("----------------------------------------");
       if (opc>=30){
         System.out.println("No funciona tiene mucho peso");
        }
       if (opc<30) {
         System.out.println("Lavanderia Wash");
         paga=opc*32;
         System.out.println("Lavaras un total de "+opc+ " k");
         System.out.println("Nivel maximo");
         agua=opc*4;
         System.out.println("Usaras de agua " +agua+ "L");
         jabon=opc*100;
         System.out.println("Jabon utilizado es de:" +jabon+ "g");
         System.out.println("Pagaras un total de " +paga);
        }
       if (opc<=15){
         System.out.println("Lavanderia Wash");
         paga=opc*32;
         System.out.println("Lavaras un total de "+opc+ " k");
         System.out.println("Nivel alto");
         agua=opc*4;
         System.out.println("Usaras de agua " +agua+ "L");
         jabon=opc*100;
         System.out.println("Jabon utilizado es de:" +jabon+ "g");
         System.out.println("Pagaras un total de " +paga);
        }
       if (opc<15){
         System.out.println("Lavanderia Wash");
         paga=opc*32;
         System.out.println("Lavaras un total de "+opc+ " k");
         System.out.println("Nivel minimo");
         agua=opc*4;
         System.out.println("Usaras de agua " +agua+ "L");
         jabon=opc*100;
         System.out.println("Jabon utilizado es de:" +jabon+ "g");
         System.out.println("Pagaras un total de " +paga);
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
