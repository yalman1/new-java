package exceptions;

public class Sample {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
            System.out.println("code");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        // new
        int i=50;
        int j=0;
        int data;
        try {
            data=i/j;
            System.out.println(data);
        }
        catch (Exception e){
           // System.out.println(i/j);
            System.out.println(i/(j+2));
        }

        //new
       /* try {
            int data2=50/0;

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");


        //new
        try{
            int c=4/0;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/

        //new
        try{
            int c=4/0;
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        try {
            int arr []={1,2,3,4};
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }


}

