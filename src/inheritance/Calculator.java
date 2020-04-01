package inheritance;

public class Calculator {
    protected  int displayValue;

    public Calculator() {
        this.displayValue = 0;
        System.out.println("Display value"+this.displayValue);
    }
   protected int add (int num1 , int num2){
        return num1 +num2;

    }
    public int divide (int num1 , int num2){
    return num1 / num2;

    }
    private int subtract (int num1 , int num2){
       return num1 - num2;

    }
    int multiply (int num1 , int num2){
      return num1 * num2;

    }
}
