import stock.ItemsInStock;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ItemsInStock> stock;

    public Shop() {
        stock = new ArrayList<ItemsInStock>();
    }

    public void
    addItemsInStock(ItemsInStock ItemsInStock) {
        this.stock.add(ItemsInStock);
    }

    public void
    removeItemsInStock(ItemsInStock ItemsInStock) {
        this.stock.remove(ItemsInStock);
    }

    public int
    getStockCount() {
        return this.stock.size();
    }
}

