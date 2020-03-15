package creating_classes;

public class CalculataCostOfProduct {
    public static void main(String[] args) {
        costOfProduct(2000,15.4);
        costOfProduct(3000,13.2,200);

    }
    public static int costOfProduct (int price, double tax){
        int cost = (int) ((price+tax)*1.1);
        System.out.println(cost);
        return cost;
    }
    public static int costOfProduct (int price, double tax, int shipping){
        int cost= (int) ((price+tax)*1.1+shipping);
        System.out.println(cost);
        return cost;
    }
}
