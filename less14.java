import java.util.Arrays;

public class less14 {




    public static void main(String args[]){

        int[]x1 = {11,2,3,5,99,0,-1,10,20,10,999};

        Arrays.sort(x1);

        int index1 = Arrays.binarySearch(x1,0);
        int index2 = Arrays.binarySearch(x1,1);
        int index3 = Arrays.binarySearch(x1,9);
        int index4 = Arrays.binarySearch(x1,10);

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
    }
}

