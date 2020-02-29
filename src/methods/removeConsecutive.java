package methods;

public class removeConsecutive {
    public static void removeCon (String text ){
        text +=" ";
        for (int i=0; i<text.length()-1; i++){
            if (text.charAt(i)!=text.charAt(i+1)){        //if (text.charAt(i)!=text.charAt(i-1))
                System.out.println(text.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        removeConsecutive.removeCon("aaabbbccc");
    }

}
