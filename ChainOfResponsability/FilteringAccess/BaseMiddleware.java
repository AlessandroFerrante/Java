// BaseHandler
public abstract class BaseMiddleware implements Middleware{
    // it would have been a boilerplate code
    protected BaseMiddleware next;

    // create a chain easily
    public static BaseMiddleware link(BaseMiddleware first, BaseMiddleware... chain){
        BaseMiddleware head = first;
        for (BaseMiddleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }
    
    // handlerRequest method
    public abstract boolean check (String email, String password);
    
    // boilerplate code of the handlerRequest method
    protected boolean checkNext(String email, String password){
        if (next == null)
            return true;
        return next.check(email, password);
    }
    
    //! boilerplate code, replaced by link method
    public void setNext(BaseMiddleware n){
        this.next = n;
    }
}
  