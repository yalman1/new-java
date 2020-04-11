package encapsulation;

public class CarMaintainTest {
    public static void main(String[] args) {
            CarMaintain myCar = new CarMaintain("Toyota",65000,70000,"new","new","old");
            System.out.println(myCar.toString());
            myCar.displayFilterStatus();
            myCar.doOilChange();
            myCar.setAirFilterStatus("old");
            myCar.doOilChange();
            System.out.println(myCar.getOdometerNextOilChange());
            System.out.println(myCar.toString());
            myCar.doOilChange();
            myCar.doOilChange();
            System.out.println(myCar.toString());
            myCar.setCarName("toyota");
            System.out.println(myCar.getCarName());

    }
}
