package polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal =new Animal();
        Animal cat =new AnimalCat();
        Animal dog =new AnimalDog();
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();

    }

}
