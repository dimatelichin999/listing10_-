import java.util.Arrays;

public class less13 {

    public static void main(String args[]){

        int [] x1 = {1,99,5,3,0,-1,25,-99,100,-7,-2,200,500,100,0,300,400};

        Arrays.sort(x1,4,8);
        String str = Arrays.toString(x1);

        System.out.println(str);
    }
}
