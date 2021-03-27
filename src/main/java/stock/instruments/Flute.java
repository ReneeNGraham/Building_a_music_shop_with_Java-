package stock.instruments;

public class Flute extends Instruments{
    public Flute(String typeOfItem, String maker, double buyingPrice, double sellingPrice, String materialsMadeFrom, String colour, String typeOfInstrument) {
        super(typeOfItem, maker, buyingPrice, sellingPrice, materialsMadeFrom, colour, typeOfInstrument);
    }

    public String Play() {
        return "toootooooteeeetooooteeetooo";
    }
}
