package interfaces;

public class ComLaptop implements Computer{
    protected String mainBoardSpec;
    protected int memorySize;
    protected int cpuSpeed;
    protected String cpuType;
    protected int batteryPercentage;

    public ComLaptop(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType, int batteryPercentage) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercentage = batteryPercentage;
    }

    public void setMainBoard (){
        if (this.mainBoardSpec.contains("intel")){
            System.out.println("Intel MainBoard is set");
        }
        else if (this.mainBoardSpec.contains("amd")){
            System.out.println("AMd mainboard is set");
        }
        else {
            System.out.println("unknown mainboard");
        }
    }
    public void installCPU (){
        System.out.println("  ");
    }
    public void installMemory (){
        System.out.println("jjj");
    }
    public void chargeBattery (){
        System.out.println("Battery charging");

    }
    public void showBatteryPercentage (){
    }
}
