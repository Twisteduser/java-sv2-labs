package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store storeTools = new Store("Hammer");
        System.out.println(storeTools.getProduct() +" : " + storeTools.getStock());

        Store storeFood = new Store("Bread");
        System.out.println(storeFood.getProduct() +" : " + storeFood.getStock());

        storeTools.stock(20);
        storeFood.stock(50);
        storeTools.dispatch(5);
        storeFood.dispatch(30);

        System.out.println(storeTools.getProduct() +" : " + storeTools.getStock());
        System.out.println(storeFood.getProduct() +" : " + storeFood.getStock());

    }
}
