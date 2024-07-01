package ChapterThree;

public class PetrolPurchaseTwo {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private double pricePerLitre;
    private double percentageDiscount;
    public PetrolPurchaseTwo(String stationLocation, String petrolType, int petrolQuantity, double pricePerLitre,double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
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

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPetrolPrice(){
        double purchaseAmount = petrolQuantity * pricePerLitre;
        double petrolDiscount = (purchaseAmount - percentageDiscount) / 100;

        return purchaseAmount - petrolDiscount;
    }
}
