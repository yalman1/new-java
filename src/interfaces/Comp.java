package interfaces;

public class Comp  {
    private String mainBoardSpec;
    private int memorySize;
    private int cpuSpeed;
    private String cpuType;

    public Comp(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
    }

    public String getMainBoardSpec() {
        return mainBoardSpec;
    }

    public void setMainBoardSpec(String mainBoardSpec) {
        this.mainBoardSpec = mainBoardSpec;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }
    public void turnOn (){
        System.out.println("computer turned on");
    }
    public void turnOff (){
        System.out.println("computer turned off");
    }
    public void boot (){
        System.out.println("computer booted");
    }

    @Override
    public String toString() {
        return "Comp{" +
                "mainBoardSpec='" + mainBoardSpec + '\'' +
                ", memorySize=" + memorySize +
                ", cpuSpeed=" + cpuSpeed +
                ", cpuType='" + cpuType + '\'' +
                '}';
    }
}
