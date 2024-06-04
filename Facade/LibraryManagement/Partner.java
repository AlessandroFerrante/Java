import java.util.Arrays;
import java.util.List;

/**
 * Classe del sottosistema,
 * Partner verifica se un utente e' registrato. |
 * Subsystem class,
 * Partner checks if a user is registered.
 */

public class Partner {
    private final List< String > listPartner = Arrays.asList("Alan", "Dan");

    public boolean verifyPartner (String name) {
        System.out.println("Partner: check ");
        return listPartner.contains(name);
    }
}
