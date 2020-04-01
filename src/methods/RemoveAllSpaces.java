package methods;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        removeSpace("it is a perfect day to study Java");
    }
    public static void removeSpace (String sentence){

      for (int i=0; i<sentence.length(); i++) {
          if (sentence.charAt(i) != ' ') {
              System.out.print(sentence.charAt(i));
          }
      }
    }
}
