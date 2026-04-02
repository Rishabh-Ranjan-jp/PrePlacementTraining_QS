package solutions;

public class Product {
    private int price;
    private int quantity;

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(int price){
        if(price < 1){
            System.out.println("Please enter a valid price for the product. The price must be atleast 1 unit.");
            return;
        }
        this.price = price;
        System.out.println("Set the price of the product to: "+getPrice());
    }

    public void setQuantity(int quantity){
        if(quantity < 0){
            System.out.println("We must have atleast one unit in stock. Please try again with a valid number of units.");
            return;
        }
        this.quantity = quantity;
        System.out.println("Product quantity set to: "+getQuantity());
    }
}
