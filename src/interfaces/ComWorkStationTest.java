package interfaces;

public class ComWorkStationTest {
    public static void main(String[] args) {
        String mainboard[]={"intel","3000","128"};
        computerWorkStation myWrks = new computerWorkStation(mainboard,64,8900,"amd","maxi",42);
        myWrks.setMainBoard();
        myWrks.installMemory(64);
        myWrks.installCPU();
        ComDellWorkStation myDell = new ComDellWorkStation(mainboard,128,2500,"intel","tower",29);
    }
}
