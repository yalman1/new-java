package constructor;

public class ElectricBill {
    int memberID;
    int counter;
    String name;
    double billAmount;

     ElectricBill(int memberID,int counter,String name,double billAmount){
        this.memberID=memberID;
        this.counter = counter;
        this.name=name;
        this.billAmount=billAmount;
    }
    public void displayBill(){
        this.billAmount = this.counter*1.9;
        System.out.println(this.billAmount);
    }
    public void readCounter(){
        System.out.println(this.counter);
    }
    public void addConsumption(int consumption){
        this.counter+=consumption;
    }
    @Override
    public String toString() {
        return "ElectricBill :\n" +
                "memberID=\t" + memberID +
                ", counter=\t" + counter +
                ", name=\t'" + name + '\'' +
                ", billAmount=\t" + billAmount;
    }
}
