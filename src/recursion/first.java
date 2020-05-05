package recursion;

public class first {
    static int count=0;
    static void p(){
        count++;
        if(count<=5){
            System.out.println("hello"+count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
        doThat(4);
    }
    static void doThat (int count ){
        if (count>0){
            System.out.println("Hello");
            doThat(count-1);
        }
    }
}
