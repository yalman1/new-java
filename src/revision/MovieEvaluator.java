package revision;

public class MovieEvaluator {
    public static void main(String[] args) {
        movieDes(5.6,84500,154000.89);
        decideMovie(2.7,2000,134.23);
    }
    public static void movieDes(double imdb, int total, double box){
        double a=imdb*total/box;
        if (a>10){
            System.out.println("watch movie");
        }
        else {
            System.out.println("don't watch the movie");
        }
    }
    public static int decideMovie (double imdb, int totalVotes, double boxOffice){
        int result=0;
        double a;
        a=imdb*totalVotes/boxOffice;
        if (a>10){
            System.out.println("watch movie");
        }
        else {
            System.out.println("don't watch the movie");
        }
        return result;
    }



}
