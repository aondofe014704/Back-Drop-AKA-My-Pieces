package ChapterThree;

public class ClassCar {
    private String model;
    private String year;
    private double price;


    public ClassCar(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double firstCarDiscount(double discountAmount) {
        double discountPrice = (price * discountAmount) / 100;
        return  discountPrice;
    }
//    public double secondCarDiscount() {
//        double priceOfSecondCar = (price * 7) / 100;
//        return priceOfSecondCar;
//    }
}
