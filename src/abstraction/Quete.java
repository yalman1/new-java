package abstraction;

abstract class Quete {
    private String costumerName;
    private int totalSquareFeet;
    private double price;

    Quete() {
        this.costumerName = "John Doe";
        this.totalSquareFeet = 0;
        this.price = 0;
    }

    public Quete(String costumerName, int totalSquareFeet, double price) {
        this.costumerName = costumerName;
        this.totalSquareFeet = totalSquareFeet;
        this.price = price;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public int getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(int totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateTotalPrice ();
    abstract void printQuete ();

    @Override
    public String toString() {
        return "Quete{" +
                "costumerName='" + costumerName + '\'' +
                ", totalSquareFeet=" + totalSquareFeet +
                ", price=" + price +
                '}';
    }
}
