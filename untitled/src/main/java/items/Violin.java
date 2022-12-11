package items;

import behaviours.IPlay;

public class Violin extends Instrument  {

    public Violin(String name, InstrumentType instrumentType, Manufacturer manufacturer, double buyingCost,
                  double sellingPrice){
        super(name, instrumentType, manufacturer, buyingCost, sellingPrice);
    }

    public String playSound() {
        return "vrrr";
    }

}
