import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    private static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    private static Server server;


    public static void inint(){
        server = new Server();
        server.register("admin@alessandroferrante.net", "admin_pass");
        server.register("user1@alessandroferrante.net", "user_pass");
        server.register("user2@alessandroferrante.net", "user_pass");

        BaseMiddleware middleware = BaseMiddleware.link(
            new ThrottlingMiddleware(2), 
            new UserExistsMiddleware(server), 
            new RoleCheckMiddleware()
        );
        
        server.setMiddleware(middleware);
    } 

    public static void main(String[] args) throws IOException {
        inint();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
