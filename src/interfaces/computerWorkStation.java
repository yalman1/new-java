package interfaces;

public class computerWorkStation extends Comp implements Computer {
    protected String housingTypes;
    protected int screenSize;

    public computerWorkStation(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType, String housingTypes, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, cpuType);
        this.housingTypes = housingTypes;
        this.screenSize = screenSize;
    }

    public void setMainBoard (){
        System.out.println("");

    }
    public void installCPU () {
    }

    @Override
    public void installMemory() {
        
    }
}
