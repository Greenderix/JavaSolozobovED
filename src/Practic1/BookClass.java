package Practic1;
public class BookClass {
    private String name;
    private int pages;

    public BookClass(String n, int p) {
        name = n;
        pages = p;
    }
    public BookClass(){
        name = "Book";
        pages = 12;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    public String getName() {
        return name;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        return this.name + ", contains "+ pages + " pages";
    }
    public void intoMinutesForReading(){
        System.out.println("The book " + name + " can be read in " + pages*2 + " minutes");
    }

}
