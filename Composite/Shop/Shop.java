public class Shop {

    public static Products getCart() {
        return new Cart();
    }

    public static Products getProd1() {
        return new Prod1(10, 5);
    }

    public static Products getProd2(){
        return new Prod2(5, 0);
    }

}
