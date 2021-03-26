package stock.instruments;

import behaviours.IPlay;
import stock.ItemsInStock;

public abstract class Instruments extends ItemsInStock implements IPlay {

    private String materialsMadeFrom;
    private String colour;
    private String typeOfInstrument;


    public Instruments(String typeOfItem, String maker, double buyingPrice,  double sellingPrice,
                       String materialsMadeFrom, String colour,String typeOfInstrument ) {
        super(typeOfItem, maker, buyingPrice, sellingPrice);
        this.materialsMadeFrom = materialsMadeFrom;
        this.colour = colour;
        this.typeOfInstrument = typeOfInstrument;
    }

    public String getMaterialsMadeFrom() {
        return materialsMadeFrom;
    }

    public void setMaterialsMadeFrom(String materialsMadeFrom) {
        this.materialsMadeFrom = materialsMadeFrom;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTypeOfInstrument() {
        return typeOfInstrument;
    }

    public void setTypeOfInstrument(String typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
    }


}
