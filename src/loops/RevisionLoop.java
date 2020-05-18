package loops;

public class RevisionLoop {
    public static void main(String[] args) {
        for (int i = 0, j=10; i <10 && j>=0 ; i++, j--) {
            System.out.println("i="+i+"\tj="+j);
        }
        System.out.println();
        for (int i = 0, j=10; i <j ; i++ , j--) {
            System.out.println("i="+i+"\tj="+j);

        }
        System.out.println();
        StringBuilder word=new StringBuilder("Java is fun");
        char temp;
        for (int i = 0, j=word.length()-1; i <j ; i++, j--) {
            temp=word.charAt(i);
            word.setCharAt(i,word.charAt(j));
            word.setCharAt(j,temp);
        }
        System.out.println(word);

        System.out.println();

        int counter=0;
        for (;;){               // infinite for loop

            if (counter==5){
                break;
            }
            System.out.println("hello");
            counter++;
        }

        System.out.println();
        String arr[]={"abc", "def",null,""};
        for(String x:arr){
            if(x==null){
                break;
            }
            System.out.println(x);
        }
        for(; true;){   // infinite for loop

        }
    }
}
