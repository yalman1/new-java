package constructor;

public class houseRent {
    String houseColor;
    int houseSize;
    double housePrise;

    public houseRent(String color, int size, double prise){
        houseColor=color;
        houseSize=size;
        housePrise=prise;
    }
    public void rentIncrese (){
        System.out.println("it will be incresed");
    }
    public void rentIncrese (int inc){
        System.out.println("it will be "+inc+" dolar increased");
    }
}
