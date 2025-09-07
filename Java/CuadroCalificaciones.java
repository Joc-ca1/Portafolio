import javax.swing.JOptionPane;
import java.util.Random;
public class CuadroCalificaciones
{
    public static void main (String[] args){
        Random po = new Random();
        String cali, op;
        byte opc=0;
        String alumnos[]=new String[5];
        int cal1[]=new int[5];
        int cal2[]=new int[5];
        int cal3[]=new int[5];
        double prom[]=new double[5];
        for (int x=0; x<=4; x++){
            alumnos[x]=JOptionPane.showInputDialog("Dame tu nombre");
            cal1[x]=(int)(po.nextDouble()*100)+1;
            cal2[x]=(int)(po.nextDouble()*100)+1;
            cal3[x]=(int)(po.nextDouble()*100)+1;
            prom[x]=(cal1[x]+cal2[x]+cal3[x])/3;
        }
        for (int y=0; y<=4; y++){
            JOptionPane.showMessageDialog(null, "Nombre: " +alumnos[y]+ "\n Unidad I: " +cal1[y]+ "\n Unidad II: " +cal2[y]+ "\n Unidad II: "+cal3[y]+ "\n Promedio: " +prom[y]);
        }
    }
}
