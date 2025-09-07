import javax.swing.JOptionPane;
import java.util.Random;
public class Parametros
{
    public static float calcularBeca(String nomb, float prom){
        float bec;
        if ((prom>80) & (prom>=100)){
           
           bec=2500;
        }
           else{
           bec=0;
           prom=prom+5;
           nomb="karla";
           JOptionPane.showMessageDialog(null, "El metodo beca \n"+ "Nombre: " +nomb+ "\n Promedio: "+prom);
           
        }
        return bec;
    }
    public static float calcularProm(float prome){
        float promedio;
        promedio=prome/3;
        return promedio;
    }
    public static void main (String args[]){
        String nomb;
        Random po=new Random ();
        int cali=0;
        int califi[]=new int[3];
        float promee, becaa;
        nomb=JOptionPane.showInputDialog("Dame tu nombre");
        for (int x=0; x<2; x++){
            califi[x]=po.nextInt(100)+1;
            cali=cali+califi[x];
        }
        promee=calcularProm(cali);
        JOptionPane.showMessageDialog(null, "Fuera del metodo beca \n" + "Nombre: "+nomb+ "\n Promedio: " +promee); 
        becaa=calcularBeca(nomb, promee);
        JOptionPane.showMessageDialog(null, "En el metodo \n"+"Nombre: " +nomb+  "\n Promedio: " +promee);
    }
    
}

