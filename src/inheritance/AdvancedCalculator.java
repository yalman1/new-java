package inheritance;

public class AdvancedCalculator extends Calculator {
    String screenColor;

    public AdvancedCalculator (){
        super();
        this.screenColor="blue";
    }
    public AdvancedCalculator (String color){
      super();
      this.screenColor=color;
    }


    double calcAverage (int num1, int num2 ){
        double average =(num1+num2)/2;
        return average;
    }
     int calcFactorial (int num1){
        int factorial =1;
         for (int i = num1; i < 0; i--) {
             factorial*=i;
         }
         return factorial;
    }
     double calcSqrt (int num1){
        return Math.sqrt(num1);
    }
     int calcPow (int num1, int num2){
        return (int)Math.pow(num1,num2);
    }

}
