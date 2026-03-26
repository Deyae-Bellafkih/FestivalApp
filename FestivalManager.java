import java.util.*;

public class FestivalManager {
    public static void main(String[] args) {
        List<String> scaletta = new ArrayList<>();
        TreeSet<String> ticketCodex = new TreeSet<>();

        scaletta.add("Glocky");
        scaletta.add("Lazza");
        scaletta.add("Luche");
        scaletta.add("Shiva");
        scaletta.add("Sfera");

        scaletta.remove("Lazza");

        scaletta.add(1,"Ospite Sorpresa");

        System.out.println("SCALETTA UFFICIALE DEGLI ARTISTI");
        for (int i = 0; i < scaletta.size(); i++) {
            System.out.println((i+1) + "." + scaletta.get(i));
        }

        ticketCodex.add("TICK-123");
        ticketCodex.add("TICK-159");
        ticketCodex.add("TICK-183");

        ticketCodex.add("TICK-123");

        System.out.println("INGRESSI");
        System.out.println("Tickets:" + ticketCodex);
        System.out.println("Numero persone entrare" + ticketCodex.size());


    }
}
