import javax.swing.JOptionPane;
import java.util.Random;
public class ExamenMetodos
{
    
    public static void  registrarEmpleados(String a, String b, String c){
        a=JOptionPane.showInputDialog(" Dame el nombre del primer empleado");
        b=JOptionPane.showInputDialog(" Dame el nombre del segundo empleado");
        c=JOptionPane.showInputDialog(" Dame el nombre del tercer empleado");
    }
    public static double registrarMes(double e){
        Random p = new Random();
        String todo="";
        for (double d=0; d<=11; d++){
            e=(double)(p.nextDouble()*100)+1; 
            todo+="La venta del los meses es de" +e;
        }
        return e;
        
    }
    
    public static void main (String args[]){
        String nomb[]=new String [3];
        String nombr, todo="";
        double w=0;
        double e=0;
        empleaos=registrarEmpleados(nomb);
        w=registrarMes(e);
        
        JOptionPane.showMessageDialog(null,"Empleado" +nomb+ "\n"+ "Vendio" +w);
        }
}
