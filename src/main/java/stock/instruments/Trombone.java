package stock.instruments;

public class Trombone extends Instruments{

    public Trombone(String typeOfItem, String maker, double buyingPrice, double sellingPrice, String materialsMadeFrom, String colour, String typeOfInstrument) {
        super(typeOfItem, maker, buyingPrice, sellingPrice, materialsMadeFrom, colour, typeOfInstrument);
    }

    public String Play() {
        return "Buuuumbooobuuumooooohoooo";
    }
}
