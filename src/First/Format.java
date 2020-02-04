package First;

public class Format {
    public static void main (String [] args){
        String java  = "java is fun";
        float percentageLarge = 78.98f;
        double percentageSmall = 78.980000;

        System.out.format("Do you think %s \n",java  );
        System.out.format(" \t yes %% %f of the people think it is fun \n" ,percentageLarge );
        System.out.format(" \t yes %% %.2f of the people think it is fun" ,percentageSmall );



    }
}
