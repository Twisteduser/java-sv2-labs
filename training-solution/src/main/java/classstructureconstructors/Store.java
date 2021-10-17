package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product){
        this.product = product;
        stock =0;
    }

    public String getProduct() {
        return product;
    }
    public int getStock() {
        return stock;
    }

    public void stock(int quantity){
        this.stock = stock+quantity;
    }
    public void dispatch(int quantity){
        this.stock = stock-quantity;
    }

}
