package interfaces;

public class RetailStore {
    private String nameOfProduct;
    private static int totalQuantity;
    private int quantity;

    public RetailStore (String nameOfProduct,  int quantity){
        this.nameOfProduct=nameOfProduct;
        this.quantity=quantity;
        totalQuantity+=this.quantity;   //for opening
    }
    public void receive(int quan){       //for next receiving
        this.quantity+=quan;
        totalQuantity+=quan;
    }
    public void sell (int quan){          //for next sell
        this.quantity-=quan ;
        totalQuantity-=quan;
    }
    public void showQuantity(){
        System.out.println(this.nameOfProduct+"= "+this.quantity);

    }
    public static void showTotalQuantity(){
        System.out.println("total quantity= "+totalQuantity
        );

    }
}
