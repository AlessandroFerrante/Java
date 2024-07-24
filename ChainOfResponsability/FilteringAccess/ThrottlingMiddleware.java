// ConcreteHandler
public class ThrottlingMiddleware extends BaseMiddleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    //! Constructor replaced by link method
    public ThrottlingMiddleware(BaseMiddleware m){
        this.next = m;
    }
    

    public ThrottlingMiddleware (int rPM){
        this.requestPerMinute = rPM;
        this.currentTime = System.currentTimeMillis();
    }

    // handlerRequest method
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.err.println("Request limit exceeded");
            System.exit(0);// ends with success code
        }
        return checkNext(email, password);
    }
}
