package methods;

import java.util.Scanner;

public class restaurantBill {

        public static void main(String[] args) {
            restaurant.showMenu();
            Scanner scan=new Scanner (System.in);
            System.out.print("Choose your soup (1- Lentil, 2-Tomato, 3-Fish");
            int soup =scan.nextInt();
            System.out.print("Choose your meal (1- Rice, 2-Chicken, 3-Beef");
            int meal=scan.nextInt();
            System.out.print("Choose your salad (1- Ceaser, 2-Waldorf");
            int salad=scan.nextInt();

            restaurant.showBill(soup,meal,salad);
        }
}
