import javax.swing.JOptionPane;
public class MetodoOpera
{
    public static double calcularSuma(double n1, double n2){
        double a;
        a=n1+n2;
        return a;
    }
    public static double calcularResta(double n1, double n2){
        double b;
        b=n1-n2;
        return b;
    }
    public static double calcularMulti(double n1, double n2){
        double c;
        c=n1*n2;
        return c;
    }
    public static double calcularDiv(double n1, double n2){
        double d;
        d=n1/n2;
        return d;
    }
    public static void main (String args[]){
        int opc=0;
        double f,h, su, re, mu, di;
        String opci,e, g;
            while (opc!=5){
                opci=JOptionPane.showInputDialog("1. Suma"+"\n"+ "2. Resta" +"\n"+ "3. Multiplicacion" +"\n"+ "4. Divicion" +"\n"+ "5.Salir"+"\n"+"Ingrese la opcion que desea");
                opc=Byte.parseByte(opci);
                switch(opc){
                    case 1:
                    e=JOptionPane.showInputDialog("Dame el primer numero");
                    f=Byte.parseByte(e);
                    g=JOptionPane.showInputDialog("Dame el segundo numero");
                    h=Byte.parseByte(g);
                    su=calcularSuma(f,h);
                    JOptionPane.showMessageDialog(null, "La suma " +f+ " + " +h+ " es: " +su);
                    break;
                    case 2:
                    e=JOptionPane.showInputDialog("Dame el primer numero");
                    f=Byte.parseByte(e);
                    g=JOptionPane.showInputDialog("Dame el segundo numero");
                    h=Byte.parseByte(g);
                    re=calcularResta(f,h);
                    JOptionPane.showMessageDialog(null, "La resta "  +f+ " - " +h+ " es: " +re);
                    break;
                    case 3:
                    e=JOptionPane.showInputDialog("Dame el primer numero");
                    f=Byte.parseByte(e);
                    g=JOptionPane.showInputDialog("Dame el segundo numero");
                    h=Byte.parseByte(g);
                    mu=calcularMulti(f,h);
                    JOptionPane.showMessageDialog(null, "La multiplicacion "  +f+ " * " +h+ " es: "+mu);
                    break;
                    case 4:
                    e=JOptionPane.showInputDialog("Dame el primer numero");
                    f=Byte.parseByte(e);
                    g=JOptionPane.showInputDialog("Dame el segundo numero");
                    h=Byte.parseByte(g);
                    di=calcularDiv(f,h);
                    JOptionPane.showMessageDialog(null, "La divivion "  +f+ " / " +h+ " es: " +di);
                    break;
                    case 5:
                    JOptionPane.showMessageDialog(null, "Hasta luego, adios ");
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
        }
    }
}

