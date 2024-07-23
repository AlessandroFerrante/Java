public class Client {
    
    private static Pasta spaghetti = new Spaghetti();
    private static Pasta trofie = new Trofie();
    
    public static void main(String[] args) {
        Restaurant r1 = new CasualRestaurant(spaghetti);
        Restaurant r2 = new StarryRestaurant(spaghetti);
        System.out.println("\nCasual Resturant: Spaghetti\n");
        r1.serveDish();
        System.out.println("\nStarry Resturant: Spaghetti\n");
        r2.serveDish();

        // added method to request another type of pasta
        r1.request(trofie);
        r2.request(trofie);
        
        System.out.println("\nCasual Resturant: Trofie\n");
        r1.serveDish();
        System.out.println("\nStarry Resturant: Trofie\n");
        r2.serveDish();
    }
    
}
