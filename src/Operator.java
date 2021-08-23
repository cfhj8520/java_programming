import java.util.Arrays;

public class Operator {
    public static void add(int[] A){
        for(int i = 0 ; i < A.length ; i++){
            A[i]++;
        }
    }

    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int[] B = A;

        System.out.println(Arrays.toString(A));		//[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(B));		//[1, 2, 3, 4, 5]

        A[0] = 10;

        System.out.println(Arrays.toString(A));		//[10, 2, 3, 4, 5]
        System.out.println(Arrays.toString(B));		//[10, 2, 3, 4, 5]

        add(A);

        System.out.println(Arrays.toString(A));		//[11, 3, 4, 5, 6]
        System.out.println(Arrays.toString(B));		//[11, 3, 4, 5, 6]
    }
}
