package constructor;

public class houseRentTest {
    public static void main(String[] args) {
        houseRent myRent =new houseRent("red", 90,3200.30);
        System.out.println("my home is "+myRent.houseColor+" color\t\n"+
                "it is "+myRent.houseSize+" big\t\n"+ "I pay "+myRent.housePrise+" dolar");
        myRent.rentIncrese();
        myRent.rentIncrese(300);
    }
}
