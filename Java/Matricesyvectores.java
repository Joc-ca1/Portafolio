import javax.swing.JOptionPane;
import java.util.Random;
public class Matricesyvectores
{
        public static void main(String args[]){
    Random aleatori = new Random();
    String dy, resul="", resulta, di, hi, mi,tod, todas;
    String todo="",todos="",toda="";
    int c, d, l, n, menor, mayor;
    resul=JOptionPane.showInputDialog("Esta a punto de ingresar una matriz"+"\n"+"Si desea seguir teclea SI, De lo contrario NO");
    resulta=resul.toLowerCase();
    int Matri[][];
    int vec1[];
    int vec2[];
    int vec3[];
    if(resulta.equals("no")){
        JOptionPane.showMessageDialog(null,"Hasta luego,adios");
    }
    if(resulta.equals("si")){
    while(resulta.equals("si")){
        mi=JOptionPane.showInputDialog("¿Cuantas filas requieres?");
        l = Integer.parseInt(mi);
        hi=JOptionPane.showInputDialog("¿Cuantas columnas requieres?");
        n = Integer.parseInt(hi);
        if (l==n) {
         tod="";
         todas="";
         Matri = new int[l][n];
         vec1=new int[l];
         vec2=new int[l];
         vec3= new int[l];
         for(int fila=1;fila<=l;fila++){
             int can=0;
         for(int colum=1;colum<=n;colum++){
             Matri[fila-1][colum-1]=aleatori.nextInt (50)+10;
             can=can+Matri[fila-1][colum-1];
    }
    vec1[fila-1]=can;
}
for(int x=1; x<=l;x++){
    vec2[x-1]=vec1[x-1]/4;
}
menor=vec2[0];
for (int k=1; k<=l;k++){
    if(vec2[k-1]<menor){
        menor=vec2[k-1];
    }
}
tod+="El promedio menor es: "+menor+"\n";
for(int x=1;x<=l;x++){
    for(int j=1;j<=n;j++){
        todos+=Matri[x-1][j-1];
        todo+=Matri[x-1][j-1];
        toda+=Matri[x-1][j-1];
        todo+="        ";
        todos+="        ";
        toda+="        ";
    }
    todo+="\n";
    todos+="\n";
    toda+="\n";
}
toda+="---------------------------------------------------------------"+"\n";
di = "";
dy = "";
c = 1;
d = l;
for(int i=1;i<=l;i++){
    di = di+("");
    di = di+(Integer.toString(Matri[i-1][i-1])+"="+"("+i+","+i+")"+" ");
                            }
toda+="Diagonal Principal: "+di+"\n";
for (int s=1;s<=l; s++){
    dy = dy+("");
    dy = dy+(Integer.toString(Matri[c-1][d-1])+" = "+"("+c+","+d+")"+" ");
    c= c+1;
    d = d-1;
}
toda+="Diagonal inversa: "+dy+"\n";
todo+="------------------------------------------------------------"+"\n";
todos+="------------------------------------------------------------"+"\n";
toda+="------------------------------------------------------------"+"\n";
for (int j=1;j<=l; j++){
    todo+="El Promedio de la fila "+(j)+" es "+vec2[j-1]+"\n";
}
for(int x=1;x<=n; x++){
    int sumacolum=0;
for(int j=1; j<=l;j++){
    sumacolum+=Matri[j-1][x-1];
}
vec3[x-1]=sumacolum;
todos+="La suma de la columna "+(x)+" es: "+sumacolum+"\n";
}
mayor=vec3[0];
for(int o=1; o<=l;o++){
    if(vec3[o-1]>mayor){
        mayor=vec3[o-1];
    }
}
todas+="La suma mayor es: "+mayor+"\n";
todos+="------------------------------------------------------------"+"\n"+todas;
todo+="------------------------------------------------------------"+"\n";
todo=todo+tod;
JOptionPane.showMessageDialog(null,todo);
JOptionPane.showMessageDialog(null,todos);
JOptionPane.showMessageDialog(null,toda);
resul=JOptionPane.showInputDialog("¿Desea introducir otra matriz? Si/No");
resulta=resul.toLowerCase();
if(resulta.equals("no")){
    JOptionPane.showMessageDialog(null,"Hasta luego,adios");
}
}
if(l!=n){
    JOptionPane.showMessageDialog(null, "La matriz propuesta no es cuadrada."+"\n"+"Por favor introdusca otra.", "ERROR", JOptionPane.WARNING_MESSAGE);
}
}
}
}
}

