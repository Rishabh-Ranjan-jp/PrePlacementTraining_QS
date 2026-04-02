package solutions;

public class Book {
    private int price;
    private String name;

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }
}
