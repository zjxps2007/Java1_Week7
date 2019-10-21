import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        //벼열선언
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);

        //학생의 점수를 입력받음
        for(int i = 0; i < arr.length; i++) {
            System.out.print(i+1+"번째 학생의 점수를 입력하세요: ");
            arr[i] = sc.nextInt();
        }
        //내림차순으로 정렬
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                //조건이 성립하면 i와 j의 위치를 바꿈
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //정렬된 결과를 출력
        System.out.print("성적 순: ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
