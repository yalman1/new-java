package loops;

public class RevisionWhileLoop {
    public static void main(String[] args) {
        while (true){             //   while (false){ unreachable statement
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
                if(i==5){
                    break;
                }
            }
            System.out.println("while scope");
           if (true) {
               break;
           }

        }
        int x=0, y=30,z=50;
        while(x<y && y<z){
            System.out.println("x ="+x+"\ty ="+y+"\tz ="+z);
            x+=3;
            y+=2;
            z+=1;
        }

    }

}
