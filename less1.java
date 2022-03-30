class less1 {

    public static void main(String args[]){

        int [][] x = new int[5][5];
        x [2][1] = 25;
        x [3][2] = 85;
        x [4][4] =  x [2][1] *  x [3][2];

        System.out.println(x[4][4]);
    }
}
