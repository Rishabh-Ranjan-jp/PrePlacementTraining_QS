public class AnimalInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.sleep();
        p.yelp();
    }
}

class Animal{
    void eat(){
        System.out.println("The animal has consumed sustinance.");
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println("Doggie sleeps");
    }
}

class Puppy extends Dog{
    void yelp(){
        System.out.println("Puppy is yelping");
    }
}