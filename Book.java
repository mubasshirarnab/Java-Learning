package PracticeForCT1;

public class Book {
    public int chapters;
    public int pages;

    public Book(int chapters, int pages){
        this.chapters = chapters;
        this.pages = pages;
    }

    public void printSummary(){
        System.out.println("Chapters: " + chapters);
        System.out.println("Pages: " + pages);
    }
}

class EBook extends Book{
    public String format;

    public EBook(int chapters, int pages, String format){
        super(chapters,pages);
        this.format = format;
    }
    public EBook(){
        super(5,100);
    }

    @Override
    public void printSummary(){
        System.out.println("Chapters: " + chapters);
        System.out.println("Pages: " + pages);
        System.out.println("Format: " + format);
    }
}

class InheritanceTest{
    public static void main(String[] args) {
        EBook java = new EBook();
        int chapters = 8, pages = 500;
        EBook c = new EBook(chapters,pages,"pdf");
        Book b = java;
        java.printSummary();
        b = c;
        c.printSummary();

    }
}
