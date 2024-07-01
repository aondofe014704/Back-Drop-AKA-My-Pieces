package ChapterThree;

public class ClassCarApplication {
    public static void main(String[] args) {
        ClassCar classCar = new ClassCar("Corolla", "2020", 145000);
        System.out.println(classCar.firstCarDiscount(0.9));

        ClassCar classCarTwo = new ClassCar("G-Wagon", "2020", 150000);
        System.out.println(classCarTwo.firstCarDiscount(10));


    }
}
