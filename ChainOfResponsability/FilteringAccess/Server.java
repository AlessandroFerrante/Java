

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private BaseMiddleware middleware;

    public void setMiddleware (BaseMiddleware m){
        this.middleware = m;
    }

    public boolean logIn(String email, String password){
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successfull!");
            return true;
        }
        return false;
    }
    public void register(String email, String password){
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
    
}
