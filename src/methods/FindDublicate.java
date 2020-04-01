package methods;

public class FindDublicate {
    public static void main(String[] args) {
        String []sentence={"abc", "def", "abc", "ddf","ddf"};
   findDup(sentence);
    }
    public static void findDup (String []arr){

        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++)      //j=i+1   is also solution
            if (arr[j].equals(arr[i]) && i!=j){
                System.out.println(arr[j]);
            }
        }
    }
}
