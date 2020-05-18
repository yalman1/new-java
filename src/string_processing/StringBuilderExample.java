package string_processing;

public class StringBuilderExample {
    public static void main(String[] args) {
        String x="a";
        StringBuilder builder=new StringBuilder("annkkk");
        builder.setCharAt(0, 'b');
        System.out.println(builder);
        builder.delete(0,builder.length());
        System.out.println(builder);
        builder.append(x);
        System.out.println(builder);
        builder=new StringBuilder(x);
        System.out.println(builder);

    }
}
