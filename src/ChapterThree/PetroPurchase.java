package ChapterThree;

public class PetroPurchase {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double petrolPerLitre;
    private double percentageDiscount;

    public PetroPurchase(String stationLocation,
                         String petrolType,
                         int petrolQuantity,
                         double petrolPerLitre,
                         double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType =  petrolType;
        this.petrolQuantity = petrolQuantity;
        this.petrolPerLitre = petrolPerLitre;
        this.percentageDiscount = percentageDiscount;
    }
    public double getPurchaseAmount(){
        double grossPurchase = petrolQuantity * petrolPerLitre;
        double discountPrice =  (grossPurchase * percentageDiscount) /  100;
        return (grossPurchase - discountPrice);
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getPetrolQuantity() {
        return petrolQuantity;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }

    public double getPetrolPerLitre() {
        return petrolPerLitre;
    }

    public void setPetrolPerLitre(double petrolPerLitre) {
        this.petrolPerLitre = petrolPerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

}
