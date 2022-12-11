package items;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String name;
    private InstrumentType instrumentType;
    private Manufacturer manufacturer;

    private double buyingCost;

    private double sellingPrice;

    private IPlay playInstrument;

    public Instrument(String name, InstrumentType instrumentType, Manufacturer manufacturer,
                      double buyingCost, double sellingPrice) {
        this.name = name;
        this.instrumentType = instrumentType;
        this.manufacturer = manufacturer;
        this.buyingCost = buyingCost;
        this.sellingPrice = sellingPrice;

    }

    public String getName() {
        return this.name;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public double getBuyingCost() {
        return this.buyingCost;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

//    public void setIPlayInstrument(IPlay playInstrument) {
//        this.playInstrument = playInstrument;
//    }

    public abstract String playSound();

    public double calcMarkup() {
        return this.sellingPrice - this.buyingCost;
    }

}
