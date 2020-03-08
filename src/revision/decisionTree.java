package revision;

public class decisionTree {
    public static void main(String[] args) {
        boolean roadTest=true;
        boolean millage=true;
        boolean age=true;
        if (roadTest){
            if (millage){
                if (age){
                    System.out.println(" buy ");
                }
                else {
                    System.out.println("don't buy");
                }
                }
            else {
                System.out.println("buy");
            }
        }
        else {
            System.out.println("don't buy");
        }

    }

}
