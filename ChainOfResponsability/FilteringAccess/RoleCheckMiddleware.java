// ConcreteHandler
public class RoleCheckMiddleware extends BaseMiddleware {

    //! Constructor replaced by link method
    public RoleCheckMiddleware(BaseMiddleware m){
        this.next = m;
    }

    public RoleCheckMiddleware(){
        
    }
    
    // handlerRequest method
    @Override
    public boolean check(String email, String password){
        if(email.equals("admin@alessandroferrante.net")){
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return check(email, password);
    }
}
