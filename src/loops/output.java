package loops;

public class output {
    public static void main(String[] args) {

        // 1 2 3 4 5 and repeat version for loop implementation
        int number=1;
        for (int i= 1; i<4; i++){
            for (int j=1; j<6; j++){
                System.out.print(number+"\t");
                number++;
            }
            System.out.println();
        }
        System.out.println("_______________");

        //even number
        int even=2;
        for (int i= 1; i<4; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(even + "\t");
                even += 2;
            }
            System.out.println();
        }
        System.out.println("_______________");
        // filtering the numbers
        int filter=2;
        for (int i= 1; i<5; i++) {
            for (int j = 1; j < 7; j++) {
                if (filter > 17 && filter < 23) {
                    System.out.print(" " + "\t");

                } else {
                    System.out.print(filter + "\t");
                }
                filter += 2;
            }
            System.out.println();
        }
    }
}
