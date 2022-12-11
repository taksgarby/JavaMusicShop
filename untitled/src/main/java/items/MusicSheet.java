package items;

import behaviours.ISell;

public class MusicSheet implements ISell {

    String name;
    double buyingCost;
    double sellingPrice;

    public MusicSheet(String name, double buyingCost, double sellingPrice) {
        this.name = name;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return this.name;
    }

    public double getBuyingCost() {
        return this.buyingCost;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double calcMarkup() {
        return this.sellingPrice - this.buyingCost;
    }

}
