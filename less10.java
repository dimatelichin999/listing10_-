import java.util.Arrays;

public class less10 {

    public static void main(String args[]){

        int [] x1 = {1,2,3,4,5,6,7,8,9,10};

        int[] x2 = Arrays.copyOf(x1,5);
        String str2 = Arrays.toString(x2);

        int[] x3 = Arrays.copyOf(x1,15);
        String str3 = Arrays.toString(x3);

        System.out.println(Arrays.toString(x2));
        System.out.println(Arrays.toString(x3));


    }
}
