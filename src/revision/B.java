package revision;

public class B  {

}
class c extends B {
    public void read (){
        System.out.println("reading");
    }
}
class test {
    public static void main(String[] args) {
        B b=new c();
        ((c)b).read();

    }
}
