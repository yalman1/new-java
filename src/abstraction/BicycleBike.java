package abstraction;

public class BicycleBike extends Bicycle{
    private String tireType;
    private int seatHeight;

    public BicycleBike(String tireType, int seatHeight) {
        this.tireType = tireType;
        this.seatHeight = seatHeight;
    }
    public String getTireType() {
        return tireType;
    }
    public void setTireType(String tireType) {
        this.tireType = tireType;
    }
    public int getSeatHeight() {
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    void speedUP() {
        System.out.println("speed increased");
    }
    void slowDown() {
        System.out.println("speed decreased ");
    }

    void stop() {
        System.out.println("bike stopped");
    }

    void start() {
        System.out.println("bike started");
    }
    public void switchToSteepMode (){
        System.out.println("steed Mode activated");

    }

    @Override
    public String toString() {
        return "BicycleBike{" +
                "tireType='" + tireType + '\'' +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
