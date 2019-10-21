import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        //변수 선언
        int[] arr = new int[10];
        int num = 0;
        Scanner sc = new Scanner(System.in);
        //-1이 입력될때 까지 반복
        while(num != -1) {
            //숫자를 입력받음
            System.out.print("숫자를 입력하세요:(0~9까지만 입력, -1 입력시 종료): ");
            num = sc.nextInt();

            //0~9일때
            if (num < 0 || num > 9) {
                System.out.println("다시 입력하세요");
            //범위내에 있으면 배열의 값을 증가
            } else {
                arr[num] += 1;
            }
        }
        //출력
        System.out.println("입력 횟수============");
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
