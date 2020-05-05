package enums;

public class Oca {
    public static void main(String[] args) {

    }

    public static void goToEnvironment(String env) {
    String envStag="";
    if (env.equals("stag")){
        envStag =OcaConstant.ENV_STAG;
    }
        System.out.println("NAvigating to :"+envStag);
}
}
