public class BookAssignment {
    public static void main(String[] args){
        Book[] books = {
            new Book("Wings of Fire", "A.P.J. Abdul Kalam", 180, 300),
            new Book("The Guide", "R.K. Narayan", 250, 350),
            new Book("Ignited Minds", "A.P.J. Abdul Kalam", 150, 250)
        };

        for(Book x: books){
            x.displayBookDetails();
            x.writing();
            x.reading();
        }
    }    
}


class Book{
    String title, author;
    int pages, price;

    Book(
        String title,
        String author,
        int pages,
        int price
    ){
        this.price = price;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayBookDetails(){
        System.out.println(String.format("Book title: %s | Author: %s | Number of pages: %d | Price: %s Rupees", this.title, this.author, this.pages, this.price));
    }

    void reading(){
        System.out.println("Reading the book...");
    }

    void writing(){
        System.out.println("Writing the book...");
    }
}