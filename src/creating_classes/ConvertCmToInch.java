package creating_classes;

public class ConvertCmToInch {
    public static void main(String[] args) {
        convertLength(10.0);
        convertLength(10);

    }
    public static double convertLength (double inch){

        System.out.println(inch/2.54);
        return inch;
    }
    public static double convertLength (int cm){

        System.out.println(cm*2.54);
        return cm;

    }
}
