package SetterAndGetter;

public class CarInsurance {
    private int modelYear ;
    private int numberOfTicket;
    private int numberOfAccident;
    double priceOffer;
    final double BasePriseOffer=99.9;

    public CarInsurance(int modelYear, int numberOfTicket, int numberOfAccident) {
        this.modelYear = modelYear;
        this.numberOfTicket = numberOfTicket;
        this.numberOfAccident = numberOfAccident;
        this.priceOffer = priceOffer;

    }
    public void setModelYear (int modelYear){
        this.modelYear=modelYear;
    }
    public int getModelYear (){
        return this.modelYear;
    }
    public void setNumberOfTicket (int tickets){
        this.numberOfTicket=tickets;
    }
    public int getNumberOfTicket (){
        return this.numberOfTicket;
    }
    public void  setNumberOfAccident(int accidents){
        this.numberOfTicket=accidents;
    }
    public int getNumberOfAccident (){
        return this.numberOfAccident;
    }
    public void setPriceOffer (int offer){
        this.priceOffer=offer;
    }
    public double getPriceOffer (){
        return this.priceOffer;
    }

    public double makeOffer (int year){
        this.priceOffer=this.BasePriseOffer +(year-this.modelYear)*50+(30*this.numberOfTicket)
                +(100*this.numberOfAccident);
        return this.priceOffer;
    }

    @Override
    public String toString() {
        return "CarInsurance{" +
                "modelYear=" + modelYear +
                ", numberOfTicket=" + numberOfTicket +
                ", numberOfAccident=" + numberOfAccident +
                ", priceOffer=" + priceOffer +
                ", BasePriseOffer=" + BasePriseOffer +
                '}';
    }
}
