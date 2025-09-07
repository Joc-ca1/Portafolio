import javax.swing.JOptionPane;
import java.util.Random;
public class CuadroCalificacioness
{
    public static void main (String[] args){
        Random po = new Random();
        String op, r="";
        double total, U1, U2, U3;
        int opc=0;
        String alumnos[]=new String[5];
        int cal1[]=new int[5];
        int cal2[]=new int[5];
        int cal3[]=new int[5];
        double dou[]=new double[5];
        double prom[]=new double[5];
        for (int x=0; x<=4; x++){
            alumnos[x]=JOptionPane.showInputDialog("Dame tu nombre");
            cal1[x]=(int)(po.nextDouble()*100)+1;
            cal2[x]=(int)(po.nextDouble()*100)+1;
            cal3[x]=(int)(po.nextDouble()*100)+1;
            prom[x]=(cal1[x]+cal2[x]+cal3[x])/3;
        }
        for (int y=0; y<=4; y++){
            r=r+ "\n" +(y+1)+ "-" +alumnos[y];
        }            
        while (opc!=6){
                  op=JOptionPane.showInputDialog( "Alumnos:" +r+  "\n 6- Salir" +"\n"+ "¿De que alumno te gustaria saber sus calificaciones?" );
                  opc=Byte.parseByte(op);
                  switch (opc){
                      case 1:
                      JOptionPane.showMessageDialog(null, "Alumno: " +alumnos[0]+ "\n"+ "Unidad I: " +cal1[0]+ "\n"+ "Unidad II: " +cal2[0]+ "\n"+ "Unidad III: " +cal3[0]+ "\n"+ "Promedio: " +prom[0]); 
                      break;
                      case 2:
                      JOptionPane.showMessageDialog(null, "Alumno: " +alumnos[1]+ "\n"+ "Unidad I: " +cal1[1]+ "\n"+ "Unidad II: " +cal2[1]+ "\n"+ "Unidad III: " +cal3[1]+ "\n"+ "Promedio: " +prom[1]); 
                      break;
                      case 3:
                      JOptionPane.showMessageDialog(null, "Alumno: " +alumnos[2]+ "\n"+ "Unidad I: " +cal1[2]+ "\n"+ "Unidad II: " +cal2[2]+ "\n"+ "Unidad III: " +cal3[2]+ "\n"+ "Promedio: " +prom[2]); 
                      break;
                      case 4:
                      JOptionPane.showMessageDialog(null, "Alumno: " +alumnos[3]+ "\n"+ "Unidad I: " +cal1[3]+ "\n"+ "Unidad II: " +cal2[3]+ "\n"+ "Unidad III: " +cal3[3]+ "\n"+ "Promedio: " +prom[3]); 
                      break;
                      case 5:
                      JOptionPane.showMessageDialog(null, "Alumno: " +alumnos[4]+ "\n"+ "Unidad I: " +cal1[4]+ "\n"+ "Unidad II: " +cal2[4]+ "\n"+ "Unidad III: " +cal3[4]+ "\n"+ "Promedio: " +prom[4]); 
                      break;
                      case 6:
                      JOptionPane.showMessageDialog(null, "Hasta luego, adios");
                      break;
                      default:
                      JOptionPane.showMessageDialog(null, "Opcion no valida");
                      break;    
                      
                    }
        }
        for (int j=0; j<=4; j++){
        dou[j]=(prom[j]+prom[j]+prom[j]+prom[j]+prom[j])/5;
        JOptionPane.showMessageDialog(null,"El promedio general es: " +dou);
        U1=(cal1[j]+cal1[j]+cal1[j]+cal1[j]+cal1[j])/5;
        JOptionPane.showMessageDialog(null,"El promedio Unidad I es: " +U1);
        U2=(cal2[j]+cal2[j]+cal2[j]+cal2[j]+cal2[j])/5;
        JOptionPane.showMessageDialog(null,"El promedio Unidad II es: " +U2);
        U3=(cal3[j]+cal3[j]+cal3[j]+cal3[j]+cal3[j])/5;
        JOptionPane.showMessageDialog(null,"El promedio Unidad III es: " +U3);
    }
  }
  }
