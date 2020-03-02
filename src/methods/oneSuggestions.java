package methods;

public class oneSuggestions {
    public static void main(String[] args) {
        chooseWhatToEat();
        chooseWhatToWear();
    }
    public static void chooseWhatToEat () {
      int choice =(int)(Math.random()*3)+1;
        if (choice==1){
            System.out.println("Drink soup");
        }
        else if (choice==2){
            System.out.println("Eat hamburger");
        }
        else{
            System.out.println("Enjoy salad");
        }
    }
    public static void chooseWhatToWear (){
        int choice =(int)(Math.random()*3)+1;
        if (choice==1){
            System.out.println("Wear red shirt ");
        }
        else if (choice==2){
            System.out.println("Wear blue jeans");
        }
        else {
            System.out.println("White heat");
        }
    }
}
