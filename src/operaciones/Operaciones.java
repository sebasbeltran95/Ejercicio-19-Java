package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     double velocidad;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese la velocidad");
     velocidad = in.nextDouble();
     
     System.out.println(velocidad + " Km/h " + velocidad * 1000 / 3 + "  m/s " );


    }
}
