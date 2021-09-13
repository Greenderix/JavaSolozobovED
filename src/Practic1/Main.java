package Practic1;
public class Main {


    public static void main(String[] args) {
        BookClass b1 = new BookClass("Harry Potter and the Sorcerer's Stone", 400);
        BookClass b2 = new BookClass("2666", 912);
        BookClass b3 = new BookClass("Black Leopard, Red Wolf", 620);
        BookClass b4 = new BookClass("Freedom", 676);
        BookClass b5 = new BookClass();
        BookClass b6 = new BookClass();
        b1.intoMinutesForReading();
        b2.intoMinutesForReading();
        b3.intoMinutesForReading();
        b4.intoMinutesForReading();
        b5.setPages(b3.getPages());
        b5.setName(b3.getName());
        b5.intoMinutesForReading();
        b6.setPages(b2.getPages());
        b6.setName(b1.getName());
        b6.intoMinutesForReading();
        System.out.println(b5);
        System.out.println(b6);
    }
}
