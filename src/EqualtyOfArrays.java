import java.util.Arrays;

public class EqualtyOfArrays {

        public static void main(String[] args){
            int [] a1= {1,4,8,7};// create array 1
            int [] a2 = {1,4,8,2}; // create array 2

            boolean status = Arrays.equals(a1,a2);
            // process to find answer
            if(status == true) {
                System.out.println("Arrays are Equal.");
            }
            else{
                System.out.println("Arrays are Not Equal.");

            }}
}
