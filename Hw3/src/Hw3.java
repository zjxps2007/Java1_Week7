public class Hw3 {
    public static void main(String[] args) {
        //변수 선언
        int sum =0;

        for(int i=0; i < args.length;i++) {
            //매개변수로 문자열을 정수형으로 변환 받은 숫자를 전부 더함
            sum +=Integer.parseInt(args[i]);
        }
        //출력
        System.out.println("Result: "+sum);
    }
}
