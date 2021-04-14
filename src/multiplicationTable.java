public class multiplicationTable {

        public static void main(String[] args){
            int arr[][] = { {1,2,3},{2,4,6},{3,6,9}};
            // multiplication of table i , 2 and 3

            for (int i = 0; i< arr.length; i++) {

                for (int j= 0; j< arr.length; j++){
                    System.out.print(arr [i][j] + " ");
                }
                System.out.println();
            }
        }
}
