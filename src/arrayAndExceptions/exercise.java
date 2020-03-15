package arrayAndExceptions;

public class exercise {
    public static void main(String[] args) {
      String result ="I love java";

       removeSpace(result);
    }
    public static void removeSpace (String arr){
        int count =0;
        for (int i=0; i<arr.length(); i++){
            if (arr.charAt(i)>64 && arr.charAt(i)<122) {
              count++;
            }
        }
        System.out.println(arr.charAt(count));
    }
}
