import com.Cartas.Table;
import com.Jugadores.Boot1;
import com.Jugadores.Jugador;

public class Main {
    public static void main(String[] args) {
        Boot1 Steve = new Boot1("Steve Jhonson");
        Jugador Yo = new Jugador ("Gaston Herrlein");
        Table table = new Table();

        Steve.setCiegaGrande();
        Yo.setDiller();
        Yo.setCiegaChica();

        System.out.println(Yo.toString());
        System.out.println("ESTO NO SE HACE PERO BUENO TE MUESTRO LAS CARTAS DEL BOOT: \n" + Steve.toString());

        Yo.Jugar();
        Steve.Jugar();

        Yo.Jugar(false);
        Steve.Jugar(false);

       System.out.println(table.Flop());
    }
}