/**
 * 
 */
public class Register {
    private final Permissions permission = new Permissions();
    private final Partner partner  = new Partner();
    private static Loans loans = new Loans();

    public boolean lendBook(String name, Book book){
        System.out.println("Register: loan");
        if (partner.verifyPartner(name) && permission.ifLoanable(name)) {
            System.out.println("Register: loanable");
            loans.register(name, book.getTitle());
            return true;
        }
        System.out.println("Register: not lent");
        return false;
    }
    
    public boolean readBook(Book book) {
        System.out.println("Register: read");
        final String  personName = loans.foundPerson(book.getTitle());
        System.out.println("Register: person who borrows the book " + personName);
		return (partner.verifyPartner(personName) && permission.ifLegible(personName));
    }
}
