package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("Bottle of water", 100,12,25);
        System.out.println(billItem.getProduct());
        System.out.println(billItem.getPrice());
        System.out.println(billItem.getQuantity());
        System.out.println(billItem.getVatPercent());

        double summ = billItem.calculateTotalPrice();
        System.out.println("Total price is " + summ);
    }
}
