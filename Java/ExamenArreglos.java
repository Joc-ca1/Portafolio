import javax.swing.JOptionPane;
import java.util.Random;
public class ExamenArreglos
{
    public static void main(String args[]){
       Random p = new Random();
        String l,col, nomb, todo="";
       int f, c, mayor, menor, mayoor, menoor, mayorr, menorr;
        l=JOptionPane.showInputDialog("¿Cuantas personas desea ingresar?");
        f = Integer.parseInt(l);
        String nombre[]=new String[f];
        int altura[] = new int [f];
        int edad[]=new int [f];
        int peso[]= new int [f];
        double mediaedad[]=new double[f];
        double mediaaltu[]=new double [f];
        double mediapeso[]=new double [f];
        for (int x=0; x<f; x++){
            nombre[x]=JOptionPane.showInputDialog("Dame tu nombre");
            edad[x]=(int)(p.nextDouble()*100)+1;
            altura[x]=(int)(p.nextDouble()*200)+1;
            peso[x]=(int)(p.nextDouble()*100)+1;
        }
        
        for (int y=0; y<f; y++){
            JOptionPane.showMessageDialog(null, "Tu nombre es: " +nombre[y]+ "\n Tu edad es de: " +edad[y]+ "\n Tu peso es de: " +peso [y]+ "kg" + "\n Tu altura es de: " +altura[y]+ "cm"  );            
        }
        for (int w=0; w<f; w++){
            mediaedad[w]=edad[w]/f;
            mediaaltu[w]=altura[w]/f;
            mediapeso[w]=peso[w]/f;
            JOptionPane.showMessageDialog(null, "La media de la edad es de: " +mediaedad[w]+ "\n La media de la altura es de: " +mediaaltu[w]+ "\n La media de el peso es: "+mediapeso[w]);
        }
        mayor=edad[0];
        for (int k=0; k<f; k++){
            if(edad[k-0]>mayor){
                mayor=edad[k-0];
            }
        }
        todo+= "La edad mayor es: " +mayor+ "\n";
        menor=edad[0];
        for (int d=0; d<f; d++){
            if(edad[d-0]<menor){
                menor=edad[d-1];
           }
        }
        todo+="La edad menor es de: " +menor+ "\n";
        mayoor=altura[0];
        for(int s=0; s<f; s++){
            if(altura[s-0]>mayoor){
                mayoor=altura[s-0];
            }
        }
        todo+="La altura mayor es de: " +mayoor+ "\n";
        menoor=altura[0];
        for (int r=0; r<f; r++){
            if(altura[r-0]<menoor){
                menoor=altura[r-0];
           }
        }
        todo+="La altura menor es de: " +menoor+ "\n";
        mayorr=peso[0];
        for(int a=0; a<f; a++){
            if(peso[a-0]>mayorr){
                mayorr=peso[a-0];
            }
        }
        todo+="El peso mayor es de: " +mayoor+ "\n";
        menorr=peso[0];
        for (int t=0; t<f; t++){
            if(peso[t-0]<menor){
                menorr=peso[t-0];
           }
        }
        todo+="El peso menor es de: " +menorr;
        JOptionPane.showMessageDialog(null,todo);
 }
}