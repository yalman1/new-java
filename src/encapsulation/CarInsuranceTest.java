package encapsulation;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myIns = new CarInsurance(2015,0,0);
        double myOffer=myIns.makeOffer(2020);
        System.out.println(myOffer);
        CarInsurance second = new CarInsurance(2019,3,2);
        System.out.println(second.makeOffer(2020));

    }

}
