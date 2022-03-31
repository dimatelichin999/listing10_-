import java.util.Arrays;

public class less11 {
    public static void main(String args[]){
        int [] x1 = {1,2,3,4,5,6,7,8,9,10};

        int [] x2 = Arrays.copyOfRange(x1,5,10);
        String str = Arrays.toString(x2);

        System.out.println(str);

    }
}
