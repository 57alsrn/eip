import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static int m() {
        System.out.println("hello");
        return 1;
    }
    public static void main(String[] arg) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Object> a = new ArrayList<Object>();
        a.add("hi");
        a.add(12);
        a.add("true");
        
        Set<String> b = new HashSet<String>();

        b.add("hello");

        int c = m();


        System.out.println( c  - 5);

        int[] arr = {0,1,2};
        System.out.println("arr > " + arr[2]);

        Object[] d = {"hi", 0 };
        for(int i = 0; i<d.length; i++){
            System.out.println("d >> " + d[i]);
        }
    }
   
}
