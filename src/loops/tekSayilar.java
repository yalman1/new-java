package loops;

public class tekSayilar {
    public static void main(String[] args) {
        for(int i=99; i>=1 ; i-=2) {                      //odd numbers 99-1
            System.out.println("odd numbers:\t" + (i));  //2*i+1 odd numbers
        }
        for(int i=1; i<100; i++ ) {             //100 icinde hem 3 e hem 7 ye bolunebilen
            if(i%21==0) {                       //if(i%3==0 && i%7==0){
                System.out.println(""+i);
            }
        }
        for (int i=1 ; i<100; i*=2){            //ussunu alma
            System.out.println(i);
        }
        for (int i=1; i<=100; i++){               //1 den 100 e kadar 5 e tam bolunen sayilar
            if (i%5==0)
            System.out.println(i);
        }
    }
}

