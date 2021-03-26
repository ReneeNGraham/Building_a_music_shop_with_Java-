package stock;

import behaviours.ISell;

public abstract class ItemsInStock implements ISell {

    private String TypeOfItem;
    private String maker;
    private double buyingPrice;
    private double sellingPrice;

    public ItemsInStock(String typeOfItem, String maker, double buyingPrice, double sellingPrice) {
        TypeOfItem = typeOfItem;
        this.maker = maker;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;

    }

    public String getTypeOfItem() {
        return TypeOfItem;
    }

    public void setTypeOfItem(String typeOfItem) {
        TypeOfItem = typeOfItem;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }


    public double calculateMarkup(ItemsInStock itemsInStock) {
        double markup = itemsInStock.getBuyingPrice() * 1.5;
        sellingPrice = this.getSellingPrice() + markup;
        return markup;
    }


}
