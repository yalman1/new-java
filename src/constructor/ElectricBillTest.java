package constructor;

public class ElectricBillTest {
    public static void main(String[] args) {
        ElectricBill myBill = new ElectricBill(9876999,0,"veteran",0);
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        myBill.displayBill();
        myBill.addConsumption(33);
        myBill.readCounter();
    }

}
