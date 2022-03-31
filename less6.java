import java.util.Arrays;

public class less6 {

    public static void main(String args[]){

        int [][] x1 = {{1,2,3,4}, {5,6,7,8}};
        int [][] x2 = {{1,2,3,4}, {5,6,7,8}};

        Arrays.deepEquals(x1,x2);

        System.out.println(Arrays.deepEquals(x1,x2));
    }
}
