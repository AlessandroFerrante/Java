public class Client {
    private static Book b1 = new Book("Java", "Alessandro Ferrante");
    private static Book b2 = new Book("Design Pattern", "Ferrante Alessandro");
    private static Register r = new Register();
    private static String name = "Alan";

    public static void lend(Book book){
        if(r.lendBook(name, book)) 
            System.out.println("Registered loan!\n");
    }

    public static void read(Book book){
        if(r.readBook(book))
            System.out.println(name+ " reads " +book.getTitle());
    }

    public static void main(String[] args) {         
        lend(b1);
        lend(b2);
        read(b2);
        System.out.println("Book 1: " + b1.getTitle() +  " author: " + b1.getAuthor());
        System.out.println("Book 2: " + b2.getTitle() +  " author: " + b2.getAuthor());
    }
}
