/**
 * TicketStatus è uno State.
 * TicketStatus is a State.
 */
public interface TicketStatus {
    /**
     * Dichiarazioni metodi
     */
    public void show();
    public TicketStatus register(String name);
    public TicketStatus pay();
    public TicketStatus delete();
}
