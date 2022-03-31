import java.util.Arrays;

public class less9 {

    public static void main(String args[]){

        int [] x1 = new int[100];
        Arrays.fill(x1,3,6,999);

        String str = Arrays.toString(x1);

        System.out.println(Arrays.toString(x1));
    }
}
