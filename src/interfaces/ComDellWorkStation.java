package interfaces;

public class ComDellWorkStation extends computerWorkStation{
    public ComDellWorkStation(String[] mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(mainBoardSpecs, memorySize, cpuSpeed, cpuType, housingType, screenSize);
    }
    public void installDellSoftware(){
        System.out.println("Dell Software installed");
    }
}
