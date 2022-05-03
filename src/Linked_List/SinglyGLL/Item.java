package Linked_List.SinglyGLL;

public class Item {
    private Integer itemId;

    private String itemName;

    private Double price;

    public Item(Integer itemId, String itemName, Double price) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
    }
}