import ObjectOrientedProgrammingConcepts.Account;
import ObjectOrientedProgrammingConcepts.Animal;
import ObjectOrientedProgrammingConcepts.Car;
import ObjectOrientedProgrammingConcepts.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(1,"Animal",1, 30);
        Dog dog = new Dog("Doggy",2, 2, 4, 1,"Black",42);
        dog.eat();
//  Car benz = new Car();
//        Car honda = new Car();
//        benz.setModel("Mercedes Benz");
//        System.out.println("Model is"  +  benz.getModel());
//        Account account = new Account();
//        account.withdraw(1000);
    }
}