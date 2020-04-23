package arrays;

public class CutInHalf {
    public static void main(String[] args) {
        int [] number={1,2,3,4,5,6,7,8,9};
        int arrayLen =number.length;
        int half=arrayLen/2+1;            // to find in the middle
        int [] firstHalf = new int [half];
        for(int i=0; i<half; i++) {
            firstHalf[i] = number[i];
        }
        int [] secondHalf = new int [number.length-half];
        int index=0;
        for (int i=half; i<number.length; i++){
            secondHalf[index] = number [i];
            index++;
        }
        System.out.println("first array");
        for (int i=0; i<firstHalf.length; i++){
            System.out.print(firstHalf[i]);
        }
        System.out.println("\nsecond array");
        for (int i=0; i<secondHalf.length; i++){
            System.out.print(secondHalf[i]);
        }
    }
}
