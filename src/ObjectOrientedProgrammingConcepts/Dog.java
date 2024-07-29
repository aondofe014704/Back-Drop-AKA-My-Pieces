package ObjectOrientedProgrammingConcepts;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private String color;
    private int teeth;
    public Dog(String name, int weight, int eyes, int legs, int tail, String color, int teeth) {
        super(1, name, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.color = color;
        this.teeth = teeth;
    }
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("Dog.chew() called");

    }
}
