public class Book {
    String name;
    int price;

    Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book("Kubus",100);
    }
}
