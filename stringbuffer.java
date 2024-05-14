import java.lang.StringBuffer;
public class stringbuffer{
    public static void main(String args[]){
        String s = "Hello World";
        // StringBuffer a = new StringBuffer("dlroW olleH");

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
        if(a.equals(sb)){
            System.out.println(true);
        }
    }
}