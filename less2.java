class less2 {

    public static void main(String args[]){

        int [][] q = {{2,4,6,8,10} ,{1,3,5,7,9}};

        int [] tmp = q[0] ;
        q[0] = q[1];
        q[1] = tmp;

        System.out.println(q[0][1]);
    }
}
