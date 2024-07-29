package ObjectOrientedProgrammingConcepts;

public class Animal {
    private int brain;
    private String name;
    private int body;
    private int weight;

    public Animal(int brain, String name, int body, int weight) {
        this.brain = brain;
        this.name = name;
        this.body = body;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animals that eat() called");
    }
    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

}
