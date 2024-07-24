// ConcreteHandler
public class UserExistsMiddleware extends BaseMiddleware{
    private Server server;

    //! Constructor replaced by link method
    //public UserExistsMiddleware(BaseMiddleware m){
     //   this.next = m;
    //}

    public UserExistsMiddleware(Server s) {
        this.server = s;
    }

    // handlerRequest method
    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("This email is not registered");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }

        return checkNext(email, password);
    }
}

