import java.util.Arrays;
/*
기존방법은 배열을 복사할경우 배열의 주소값을 참조하기 때문에 값을 기존배열의 값을 바꾸면 복사된 배열도 값이 바뀐다.
copyOf를 사용하면 주소값을 참조하는 것이 아니라 그 주소에 있는 값만을 참조한다.
*/

public class Hw1 {
    public static void main(String[] args) {
        int[] A = {10,20,30,40,50};
        //복사할 원본과 그 원본의 길이 만큼 복사
        int[] B = Arrays.copyOf(A,A.length);

        A[0] =100;
        for(int i =0;i<A.length;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i =0;i<B.length;i++) {
            System.out.print(B[i]+" ");
        }

    }
}
