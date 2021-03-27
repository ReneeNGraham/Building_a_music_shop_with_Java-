package stock.instruments;

public class Piano extends Instruments  {

    public Piano(String typeOfItem, String maker, double buyingPrice, double sellingPrice, String materialsMadeFrom, String colour, String typeOfInstrument) {
        super(typeOfItem, maker, buyingPrice, sellingPrice, materialsMadeFrom, colour, typeOfInstrument);
    }

    public String Play() {
        return "dingdongdongdongdong";
    }
}
