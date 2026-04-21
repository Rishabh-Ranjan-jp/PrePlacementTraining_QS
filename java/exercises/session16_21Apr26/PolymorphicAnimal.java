public class PolymorphicAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat b = new Cat();
        Dog c = new Dog();
        a.sound();
        b.sound();
        c.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animal made some sound");
    }
}

class Cat extends Animal{
    @Override // generally only written when dealing with advanced java, in oops, it is not necessary
    void sound(){
        System.out.println("M E O W");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("W O O F");
    }
}