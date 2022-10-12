package listadoblementeligada;
import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Dame una secuencia de ADN: ");
        String adnString = (d.nextLine()).toUpperCase();
        System.out.println("La cadena de ADN: "+adnString);
        adnDoubleStrand adnD = new adnDoubleStrand();
        System.out.println("one by one");
        for(int i=0;i<adnString.length();i++){
            System.out.print(adnString.charAt(i));
            adnD.inserAtTail(adnString.charAt(i));
        }
        
        
    }
    
}
