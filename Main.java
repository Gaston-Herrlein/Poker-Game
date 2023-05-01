import com.Cartas.Mano;
import com.Cartas.Mesa;

public class Main {
    public static void main(String[] args) {
        Mano unaMano = new Mano();
        Mano dosMano = new Mano();
        Mano tresMano = new Mano();
        Mesa unaMesa = new Mesa();
        
        System.out.println(unaMano.toString());
        System.out.println("\n");
        System.out.println(dosMano.toString());
        System.out.println("\n");
        System.out.println(tresMano.toString());
        System.out.println("\n");

        System.out.println(unaMesa.Flop());
    }
}